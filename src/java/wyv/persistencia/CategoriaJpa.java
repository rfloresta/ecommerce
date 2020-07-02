/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wyv.persistencia;

import java.io.Serializable;
<<<<<<< HEAD
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
=======
>>>>>>> 5bd843f1d468459a1d0d208020b39eae7b3e01df
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import wyv.persistencia.exceptions.NonexistentEntityException;

/**
 *
<<<<<<< HEAD
 * @author Romario
=======
 * @author bdeg_
>>>>>>> f4f39a8562a2416f673e4a77a81b882ca25ce0e1
 */
public class CategoriaJpa implements Serializable {
    
    public CategoriaJpa() {
        this.emf= Persistence.createEntityManagerFactory("W_V_S.A.CPU");
    }

    public CategoriaJpa(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Categoria categoria) {
        if (categoria.getProductoList() == null) {
            categoria.setProductoList(new ArrayList<Producto>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Producto> attachedProductoList = new ArrayList<Producto>();
            for (Producto productoListProductoToAttach : categoria.getProductoList()) {
                productoListProductoToAttach = em.getReference(productoListProductoToAttach.getClass(), productoListProductoToAttach.getIdProducto());
                attachedProductoList.add(productoListProductoToAttach);
            }
            categoria.setProductoList(attachedProductoList);
            em.persist(categoria);
            for (Producto productoListProducto : categoria.getProductoList()) {
                Categoria oldIdCategoriaOfProductoListProducto = productoListProducto.getIdCategoria();
                productoListProducto.setIdCategoria(categoria);
                productoListProducto = em.merge(productoListProducto);
                if (oldIdCategoriaOfProductoListProducto != null) {
                    oldIdCategoriaOfProductoListProducto.getProductoList().remove(productoListProducto);
                    oldIdCategoriaOfProductoListProducto = em.merge(oldIdCategoriaOfProductoListProducto);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Categoria categoria) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Categoria persistentCategoria = em.find(Categoria.class, categoria.getIdCategoria());
            List<Producto> productoListOld = persistentCategoria.getProductoList();
            List<Producto> productoListNew = categoria.getProductoList();
            List<Producto> attachedProductoListNew = new ArrayList<Producto>();
            for (Producto productoListNewProductoToAttach : productoListNew) {
                productoListNewProductoToAttach = em.getReference(productoListNewProductoToAttach.getClass(), productoListNewProductoToAttach.getIdProducto());
                attachedProductoListNew.add(productoListNewProductoToAttach);
            }
            productoListNew = attachedProductoListNew;
            categoria.setProductoList(productoListNew);
            categoria = em.merge(categoria);
            for (Producto productoListOldProducto : productoListOld) {
                if (!productoListNew.contains(productoListOldProducto)) {
                    productoListOldProducto.setIdCategoria(null);
                    productoListOldProducto = em.merge(productoListOldProducto);
                }
            }
            for (Producto productoListNewProducto : productoListNew) {
                if (!productoListOld.contains(productoListNewProducto)) {
                    Categoria oldIdCategoriaOfProductoListNewProducto = productoListNewProducto.getIdCategoria();
                    productoListNewProducto.setIdCategoria(categoria);
                    productoListNewProducto = em.merge(productoListNewProducto);
                    if (oldIdCategoriaOfProductoListNewProducto != null && !oldIdCategoriaOfProductoListNewProducto.equals(categoria)) {
                        oldIdCategoriaOfProductoListNewProducto.getProductoList().remove(productoListNewProducto);
                        oldIdCategoriaOfProductoListNewProducto = em.merge(oldIdCategoriaOfProductoListNewProducto);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = categoria.getIdCategoria();
                if (findCategoria(id) == null) {
                    throw new NonexistentEntityException("The categoria with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Categoria categoria;
            try {
                categoria = em.getReference(Categoria.class, id);
                categoria.getIdCategoria();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The categoria with id " + id + " no longer exists.", enfe);
            }
            List<Producto> productoList = categoria.getProductoList();
            for (Producto productoListProducto : productoList) {
                productoListProducto.setIdCategoria(null);
                productoListProducto = em.merge(productoListProducto);
            }
            em.remove(categoria);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Categoria> findCategoriaEntities() {
        return findCategoriaEntities(true, -1, -1);
    }

    public List<Categoria> findCategoriaEntities(int maxResults, int firstResult) {
        return findCategoriaEntities(false, maxResults, firstResult);
    }

    private List<Categoria> findCategoriaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Categoria.class));
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

    public Categoria findCategoria(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Categoria.class, id);
        } finally {
            em.close();
        }
    }

    public int getCategoriaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Categoria> rt = cq.from(Categoria.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    public List<Categoria> listarCategoria()
    {
        Connection cn;
        CallableStatement cstmt;
        ResultSet rs;
        List<Categoria> lstCate=new ArrayList<>();
        try {
            cn = Util.getConexionBD();
            cstmt = cn.prepareCall("call sp_listarcategoria()");
            rs = cstmt.executeQuery();
            while(rs.next())
            {
                Categoria cat=new Categoria();
                cat.setIdCategoria(rs.getInt(1));
                cat.setNombre(rs.getString(2));
                lstCate.add(cat);
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return lstCate;
    }
    
    public List<Categoria> listarsubCategoria(int id)
    {
        Connection cn;
        CallableStatement cstmt;
        ResultSet rs;
        List<Categoria> lstCate=new ArrayList<>();
        try {
            cn = Util.getConexionBD();
            cstmt = cn.prepareCall("call sp_listarsubCategoria("+id+")");
            rs = cstmt.executeQuery();
            while(rs.next())
            {
                Categoria cat=new Categoria();
                cat.setIdCategoria(rs.getInt(1));
                cat.setNombre(rs.getString(2));
                lstCate.add(cat);
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return lstCate;
    }
    
}
