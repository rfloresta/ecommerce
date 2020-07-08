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
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import wyv.persistencia.exceptions.NonexistentEntityException;
import wyv.persistencia.exceptions.PreexistingEntityException;

/**
 *
 * @author bdeg_
 */
public class DetallePedidoJpa implements Serializable {
    public DetallePedidoJpa() {
        this.emf= Persistence.createEntityManagerFactory("W_V_S.A.CPU");
    }

    public DetallePedidoJpa(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(DetallePedido detallePedido) throws PreexistingEntityException, Exception {
        if (detallePedido.getDetallePedidoPK() == null) {
            detallePedido.setDetallePedidoPK(new DetallePedidoPK());
        }
        detallePedido.getDetallePedidoPK().setIdProducto(detallePedido.getProducto().getIdProducto());
        detallePedido.getDetallePedidoPK().setIdPedido(detallePedido.getPedido().getIdPedido());
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Producto producto = detallePedido.getProducto();
            if (producto != null) {
                producto = em.getReference(producto.getClass(), producto.getIdProducto());
                detallePedido.setProducto(producto);
            }
            Pedido pedido = detallePedido.getPedido();
            if (pedido != null) {
                pedido = em.getReference(pedido.getClass(), pedido.getIdPedido());
                detallePedido.setPedido(pedido);
            }
            em.persist(detallePedido);
            if (producto != null) {
                producto.getDetallePedidoList().add(detallePedido);
                producto = em.merge(producto);
            }
            if (pedido != null) {
                pedido.getDetallePedidoList().add(detallePedido);
                pedido = em.merge(pedido);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findDetallePedido(detallePedido.getDetallePedidoPK()) != null) {
                throw new PreexistingEntityException("DetallePedido " + detallePedido + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(DetallePedido detallePedido) throws NonexistentEntityException, Exception {
        detallePedido.getDetallePedidoPK().setIdProducto(detallePedido.getProducto().getIdProducto());
        detallePedido.getDetallePedidoPK().setIdPedido(detallePedido.getPedido().getIdPedido());
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            DetallePedido persistentDetallePedido = em.find(DetallePedido.class, detallePedido.getDetallePedidoPK());
            Producto productoOld = persistentDetallePedido.getProducto();
            Producto productoNew = detallePedido.getProducto();
            Pedido pedidoOld = persistentDetallePedido.getPedido();
            Pedido pedidoNew = detallePedido.getPedido();
            if (productoNew != null) {
                productoNew = em.getReference(productoNew.getClass(), productoNew.getIdProducto());
                detallePedido.setProducto(productoNew);
            }
            if (pedidoNew != null) {
                pedidoNew = em.getReference(pedidoNew.getClass(), pedidoNew.getIdPedido());
                detallePedido.setPedido(pedidoNew);
            }
            detallePedido = em.merge(detallePedido);
            if (productoOld != null && !productoOld.equals(productoNew)) {
                productoOld.getDetallePedidoList().remove(detallePedido);
                productoOld = em.merge(productoOld);
            }
            if (productoNew != null && !productoNew.equals(productoOld)) {
                productoNew.getDetallePedidoList().add(detallePedido);
                productoNew = em.merge(productoNew);
            }
            if (pedidoOld != null && !pedidoOld.equals(pedidoNew)) {
                pedidoOld.getDetallePedidoList().remove(detallePedido);
                pedidoOld = em.merge(pedidoOld);
            }
            if (pedidoNew != null && !pedidoNew.equals(pedidoOld)) {
                pedidoNew.getDetallePedidoList().add(detallePedido);
                pedidoNew = em.merge(pedidoNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                DetallePedidoPK id = detallePedido.getDetallePedidoPK();
                if (findDetallePedido(id) == null) {
                    throw new NonexistentEntityException("The detallePedido with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(DetallePedidoPK id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            DetallePedido detallePedido;
            try {
                detallePedido = em.getReference(DetallePedido.class, id);
                detallePedido.getDetallePedidoPK();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The detallePedido with id " + id + " no longer exists.", enfe);
            }
            Producto producto = detallePedido.getProducto();
            if (producto != null) {
                producto.getDetallePedidoList().remove(detallePedido);
                producto = em.merge(producto);
            }
            Pedido pedido = detallePedido.getPedido();
            if (pedido != null) {
                pedido.getDetallePedidoList().remove(detallePedido);
                pedido = em.merge(pedido);
            }
            em.remove(detallePedido);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<DetallePedido> findDetallePedidoEntities() {
        return findDetallePedidoEntities(true, -1, -1);
    }

    public List<DetallePedido> findDetallePedidoEntities(int maxResults, int firstResult) {
        return findDetallePedidoEntities(false, maxResults, firstResult);
    }

    private List<DetallePedido> findDetallePedidoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(DetallePedido.class));
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

    public DetallePedido findDetallePedido(DetallePedidoPK id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(DetallePedido.class, id);
        } finally {
            em.close();
        }
    }

    public int getDetallePedidoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<DetallePedido> rt = cq.from(DetallePedido.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    
     public List<DetallePedido> listarDPedidoPorCliente(int idClie) {
        PreparedStatement ptstm;
        Connection cn;
        ResultSet rs;
        List<DetallePedido> lisDetallePedido = new ArrayList<>();
        
        try {
            cn = Util.getConexionBD();
            ptstm = cn.prepareStatement("Select p.numero, p.fecha, p.total,de.cantidad,pro.nombre, pro.precioVenta,pro.imagen from pedido AS p inner join detalle_pedido As de ON de.idPedido= p.idPedido INNER JOIN producto As pro ON pro.idProducto= de.idProducto "
                    + "INNER JOIN cliente AS cli on cli.idCliente=p.idCliente WHERE cli.idCliente="+idClie+"");
            rs = ptstm.executeQuery();
           
            while (rs.next()) {
                DetallePedido deta=new DetallePedido();
                Pedido pedNext = new Pedido();
                
                
                pedNext.setNumero(rs.getInt(1));
                pedNext.setFecha(rs.getString(2));
                pedNext.setTotal(rs.getDouble(3));
                
                Producto pro = new Producto();
                pro.setNombre(rs.getString(5));
                pro.setPrecioVenta(rs.getDouble(6));
                pro.setImagen(rs.getString(7));
                
                deta.setPedido(pedNext);
                deta.setProducto(pro);
                deta.setCantidad(rs.getInt(4));

                //Ingresamos cliente
                lisDetallePedido.add(deta);
                
}
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lisDetallePedido;
    }
    
}
