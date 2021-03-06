/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wyv.persistencia;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import wyv.persistencia.exceptions.IllegalOrphanException;
import wyv.persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author bdeg_
 */
public class PedidoJpa implements Serializable {

    public PedidoJpa() {
        this.emf = Persistence.createEntityManagerFactory("W_V_S.A.CPU");
    }
    public PedidoJpa(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Pedido pedido) {
        if (pedido.getDetallePedidoList() == null) {
            pedido.setDetallePedidoList(new ArrayList<DetallePedido>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente idCliente = pedido.getIdCliente();
            if (idCliente != null) {
                idCliente = em.getReference(idCliente.getClass(), idCliente.getIdCliente());
                pedido.setIdCliente(idCliente);
            }
            List<DetallePedido> attachedDetallePedidoList = new ArrayList<DetallePedido>();
            for (DetallePedido detallePedidoListDetallePedidoToAttach : pedido.getDetallePedidoList()) {
                detallePedidoListDetallePedidoToAttach = em.getReference(detallePedidoListDetallePedidoToAttach.getClass(), detallePedidoListDetallePedidoToAttach.getDetallePedidoPK());
                attachedDetallePedidoList.add(detallePedidoListDetallePedidoToAttach);
            }
            pedido.setDetallePedidoList(attachedDetallePedidoList);
            em.persist(pedido);
            if (idCliente != null) {
                idCliente.getPedidoList().add(pedido);
                idCliente = em.merge(idCliente);
            }
            for (DetallePedido detallePedidoListDetallePedido : pedido.getDetallePedidoList()) {
                Pedido oldPedidoOfDetallePedidoListDetallePedido = detallePedidoListDetallePedido.getPedido();
                detallePedidoListDetallePedido.setPedido(pedido);
                detallePedidoListDetallePedido = em.merge(detallePedidoListDetallePedido);
                if (oldPedidoOfDetallePedidoListDetallePedido != null) {
                    oldPedidoOfDetallePedidoListDetallePedido.getDetallePedidoList().remove(detallePedidoListDetallePedido);
                    oldPedidoOfDetallePedidoListDetallePedido = em.merge(oldPedidoOfDetallePedidoListDetallePedido);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Pedido pedido) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Pedido persistentPedido = em.find(Pedido.class, pedido.getIdPedido());
            Cliente idClienteOld = persistentPedido.getIdCliente();
            Cliente idClienteNew = pedido.getIdCliente();
            List<DetallePedido> detallePedidoListOld = persistentPedido.getDetallePedidoList();
            List<DetallePedido> detallePedidoListNew = pedido.getDetallePedidoList();
            List<String> illegalOrphanMessages = null;
            for (DetallePedido detallePedidoListOldDetallePedido : detallePedidoListOld) {
                if (!detallePedidoListNew.contains(detallePedidoListOldDetallePedido)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain DetallePedido " + detallePedidoListOldDetallePedido + " since its pedido field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            if (idClienteNew != null) {
                idClienteNew = em.getReference(idClienteNew.getClass(), idClienteNew.getIdCliente());
                pedido.setIdCliente(idClienteNew);
            }
            List<DetallePedido> attachedDetallePedidoListNew = new ArrayList<DetallePedido>();
            for (DetallePedido detallePedidoListNewDetallePedidoToAttach : detallePedidoListNew) {
                detallePedidoListNewDetallePedidoToAttach = em.getReference(detallePedidoListNewDetallePedidoToAttach.getClass(), detallePedidoListNewDetallePedidoToAttach.getDetallePedidoPK());
                attachedDetallePedidoListNew.add(detallePedidoListNewDetallePedidoToAttach);
            }
            detallePedidoListNew = attachedDetallePedidoListNew;
            pedido.setDetallePedidoList(detallePedidoListNew);
            pedido = em.merge(pedido);
            if (idClienteOld != null && !idClienteOld.equals(idClienteNew)) {
                idClienteOld.getPedidoList().remove(pedido);
                idClienteOld = em.merge(idClienteOld);
            }
            if (idClienteNew != null && !idClienteNew.equals(idClienteOld)) {
                idClienteNew.getPedidoList().add(pedido);
                idClienteNew = em.merge(idClienteNew);
            }
            for (DetallePedido detallePedidoListNewDetallePedido : detallePedidoListNew) {
                if (!detallePedidoListOld.contains(detallePedidoListNewDetallePedido)) {
                    Pedido oldPedidoOfDetallePedidoListNewDetallePedido = detallePedidoListNewDetallePedido.getPedido();
                    detallePedidoListNewDetallePedido.setPedido(pedido);
                    detallePedidoListNewDetallePedido = em.merge(detallePedidoListNewDetallePedido);
                    if (oldPedidoOfDetallePedidoListNewDetallePedido != null && !oldPedidoOfDetallePedidoListNewDetallePedido.equals(pedido)) {
                        oldPedidoOfDetallePedidoListNewDetallePedido.getDetallePedidoList().remove(detallePedidoListNewDetallePedido);
                        oldPedidoOfDetallePedidoListNewDetallePedido = em.merge(oldPedidoOfDetallePedidoListNewDetallePedido);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = pedido.getIdPedido();
                if (findPedido(id) == null) {
                    throw new NonexistentEntityException("The pedido with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws IllegalOrphanException, NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Pedido pedido;
            try {
                pedido = em.getReference(Pedido.class, id);
                pedido.getIdPedido();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The pedido with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            List<DetallePedido> detallePedidoListOrphanCheck = pedido.getDetallePedidoList();
            for (DetallePedido detallePedidoListOrphanCheckDetallePedido : detallePedidoListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Pedido (" + pedido + ") cannot be destroyed since the DetallePedido " + detallePedidoListOrphanCheckDetallePedido + " in its detallePedidoList field has a non-nullable pedido field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            Cliente idCliente = pedido.getIdCliente();
            if (idCliente != null) {
                idCliente.getPedidoList().remove(pedido);
                idCliente = em.merge(idCliente);
            }
            em.remove(pedido);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Pedido> findPedidoEntities() {
        return findPedidoEntities(true, -1, -1);
    }

    public List<Pedido> findPedidoEntities(int maxResults, int firstResult) {
        return findPedidoEntities(false, maxResults, firstResult);
    }

    private List<Pedido> findPedidoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Pedido.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Pedido findPedido(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Pedido.class, id);
        } finally {
            em.close();
        }
    }

    public int getPedidoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Pedido> rt = cq.from(Pedido.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    public int actualizar(Pedido p) {
        Connection cn;
        PreparedStatement pstmt;
        ResultSet rs;
        int resultado = 0;

        try {
            cn = Util.getConexionBD();
            pstmt = cn.prepareStatement("UPDATE pedido set  numero=?, fecha=?, subtotal=?, igv=?, total=?, pago=?, estado=?, idCliente=? where idPedido=?");
            pstmt.setString(1, p.getNumero());
            pstmt.setString(2, p.getFecha());
            pstmt.setDouble(3, p.getSubtotal());
            pstmt.setDouble(4, p.getIgv());
            pstmt.setDouble(5, p.getTotal());
            pstmt.setString(6, p.getPago());
            pstmt.setString(7, String.valueOf(p.getEstado()));
            pstmt.setInt(8, p.getIdCliente().getIdCliente());
            pstmt.setInt(9, p.getIdPedido());
            resultado = pstmt.executeUpdate();
            System.out.println("resultado" + resultado);
        } catch (Exception e) {
            e.getMessage();
}
        return resultado;

    }
    public List<Pedido> listarPedido() {
        PreparedStatement ptstm;
        Connection cn;
        ResultSet rs;
        List<Pedido> lisPedido = new ArrayList<>();
        try {
            cn = Util.getConexionBD();
            ptstm = cn.prepareStatement("Select p.*, c.nombres AS NombreCli From pedido AS p INNER JOIN cliente As c on p.idCliente=c.idCliente");
            rs = ptstm.executeQuery();

            while (rs.next()) {
                Pedido pedNext = new Pedido();
                pedNext.setIdPedido(rs.getInt(1));
                pedNext.setNumero(rs.getString(2));
                pedNext.setFecha(rs.getString(3));
                pedNext.setSubtotal(rs.getDouble(4));
                pedNext.setIgv(rs.getDouble(5));
                pedNext.setTotal(rs.getDouble(6));
                pedNext.setPago(rs.getString(7));
                char s = rs.getString(8).charAt(0);
                pedNext.setEstado(s);
                Cliente cli = new Cliente();
                cli.setIdCliente(rs.getInt(9));
                cli.setNombres(rs.getString("NombreCli"));
                pedNext.setIdCliente(cli);
                lisPedido.add(pedNext);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lisPedido;
    }
}
