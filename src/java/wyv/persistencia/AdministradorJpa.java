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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
public class AdministradorJpa implements Serializable {

    public AdministradorJpa() {
        this.emf= Persistence.createEntityManagerFactory("W_V_S.A.CPU");
    }
    public AdministradorJpa(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Administrador administrador) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(administrador);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findAdministrador(administrador.getDni()) != null) {
                throw new PreexistingEntityException("Administrador " + administrador + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Administrador administrador) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            administrador = em.merge(administrador);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = administrador.getDni();
                if (findAdministrador(id) == null) {
                    throw new NonexistentEntityException("The administrador with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Administrador administrador;
            try {
                administrador = em.getReference(Administrador.class, id);
                administrador.getDni();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The administrador with id " + id + " no longer exists.", enfe);
            }
            em.remove(administrador);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Administrador> findAdministradorEntities() {
        return findAdministradorEntities(true, -1, -1);
    }

    public List<Administrador> findAdministradorEntities(int maxResults, int firstResult) {
        return findAdministradorEntities(false, maxResults, firstResult);
    }

    private List<Administrador> findAdministradorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Administrador.class));
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

    public Administrador findAdministrador(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Administrador.class, id);
        } finally {
            em.close();
        }
    }

    public int getAdministradorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Administrador> rt = cq.from(Administrador.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    // Mis metodos Personalizados
    public  List<Map<String, String>> ventaMes()
    {
        Connection cn;
        PreparedStatement pstmt;
        ResultSet rs;

        List<Map<String, String>> venMes =new ArrayList<>();
        try {

            cn = Util.getConexionBD();
            pstmt = cn.prepareStatement("SELECT fecha as fecha,sum(total) as Total FROM pedido  GROUP BY fecha ORDER BY date(fecha)");
            rs = pstmt.executeQuery();
            Map<String, String> mapa=null;
            while(rs.next())
            {
                mapa=new HashMap<String, String>();
                String Mes = rs.getString("fecha");
                String Total = rs.getString("Total");
                mapa.put("Fecha", Mes);
                mapa.put("Total", Total);
                venMes.add(mapa);


}


        } catch (Exception e) {
            e.printStackTrace();
        }

       
        return venMes;

    }


    public int ContarClientes()
    {
        Connection cn;
        PreparedStatement pstmt;
        ResultSet rs;
        int resultado = 0;

        try {
            cn = Util.getConexionBD();
            pstmt = cn.prepareStatement("SELECT COUNT(idCliente) FROM cliente");
            rs = pstmt.executeQuery();
            while(rs.next())
            {
                resultado = rs.getInt(1);
            }

        } catch (Exception e) {
            e.getMessage();
        }
        return resultado;
    }

     public int ContarAdministrador()
    {
        Connection cn;
        PreparedStatement pstmt;
        ResultSet rs;
        int resultado = 0;

        try {
            cn = Util.getConexionBD();
            pstmt = cn.prepareStatement("select COUNT(dni) from administrador");
            rs = pstmt.executeQuery();
            while(rs.next())
            {
                resultado = rs.getInt(1);
            }

        } catch (Exception e) {
            e.getMessage();
        }
        return resultado;
    }

      public int ContarPedido()
    {
        Connection cn;
        PreparedStatement pstmt;
        ResultSet rs;
        int resultado = 0;

        try {
            cn = Util.getConexionBD();
            pstmt = cn.prepareStatement("SELECT COUNT(idPedido) from pedido");
            rs = pstmt.executeQuery();
            while(rs.next())
            {
                resultado = rs.getInt(1);
            }

        } catch (Exception e) {
            e.getMessage();
        }
        return resultado;
    }
    
    
}
