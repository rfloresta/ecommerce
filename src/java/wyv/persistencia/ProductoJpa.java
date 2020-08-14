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
import wyv.persistencia.exceptions.NonexistentEntityException;

public class ProductoJpa implements Serializable {
    public ProductoJpa() {
        this.emf= Persistence.createEntityManagerFactory("W_V_S.A.CPU");
    }
    public ProductoJpa(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Producto producto) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Categoria idCategoria = producto.getIdCategoria();
            if (idCategoria != null) {
                idCategoria = em.getReference(idCategoria.getClass(), idCategoria.getIdCategoria());
                producto.setIdCategoria(idCategoria);
            }
            Marca idMarca = producto.getIdMarca();
            if (idMarca != null) {
                idMarca = em.getReference(idMarca.getClass(), idMarca.getIdMarca());
                producto.setIdMarca(idMarca);
            }
            Subcategoria idSubCategoria = producto.getIdSubCategoria();
            if (idSubCategoria != null) {
                idSubCategoria = em.getReference(idSubCategoria.getClass(), idSubCategoria.getIdSubcategoria());
                producto.setIdSubCategoria(idSubCategoria);
            }
            em.persist(producto);
            if (idCategoria != null) {
                idCategoria.getProductoList().add(producto);
                idCategoria = em.merge(idCategoria);
            }
            if (idMarca != null) {
                idMarca.getProductoList().add(producto);
                idMarca = em.merge(idMarca);
            }
            if (idSubCategoria != null) {
                idSubCategoria.getProductoList().add(producto);
                idSubCategoria = em.merge(idSubCategoria);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Producto producto) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Producto persistentProducto = em.find(Producto.class, producto.getIdProducto());
            Categoria idCategoriaOld = persistentProducto.getIdCategoria();
            Categoria idCategoriaNew = producto.getIdCategoria();
            Marca idMarcaOld = persistentProducto.getIdMarca();
            Marca idMarcaNew = producto.getIdMarca();
            Subcategoria idSubCategoriaOld = persistentProducto.getIdSubCategoria();
            Subcategoria idSubCategoriaNew = producto.getIdSubCategoria();
            if (idCategoriaNew != null) {
                idCategoriaNew = em.getReference(idCategoriaNew.getClass(), idCategoriaNew.getIdCategoria());
                producto.setIdCategoria(idCategoriaNew);
            }
            if (idMarcaNew != null) {
                idMarcaNew = em.getReference(idMarcaNew.getClass(), idMarcaNew.getIdMarca());
                producto.setIdMarca(idMarcaNew);
            }
            if (idSubCategoriaNew != null) {
                idSubCategoriaNew = em.getReference(idSubCategoriaNew.getClass(), idSubCategoriaNew.getIdSubcategoria());
                producto.setIdSubCategoria(idSubCategoriaNew);
            }
            producto = em.merge(producto);
            if (idCategoriaOld != null && !idCategoriaOld.equals(idCategoriaNew)) {
                idCategoriaOld.getProductoList().remove(producto);
                idCategoriaOld = em.merge(idCategoriaOld);
            }
            if (idCategoriaNew != null && !idCategoriaNew.equals(idCategoriaOld)) {
                idCategoriaNew.getProductoList().add(producto);
                idCategoriaNew = em.merge(idCategoriaNew);
            }
            if (idMarcaOld != null && !idMarcaOld.equals(idMarcaNew)) {
                idMarcaOld.getProductoList().remove(producto);
                idMarcaOld = em.merge(idMarcaOld);
            }
            if (idMarcaNew != null && !idMarcaNew.equals(idMarcaOld)) {
                idMarcaNew.getProductoList().add(producto);
                idMarcaNew = em.merge(idMarcaNew);
            }
            if (idSubCategoriaOld != null && !idSubCategoriaOld.equals(idSubCategoriaNew)) {
                idSubCategoriaOld.getProductoList().remove(producto);
                idSubCategoriaOld = em.merge(idSubCategoriaOld);
            }
            if (idSubCategoriaNew != null && !idSubCategoriaNew.equals(idSubCategoriaOld)) {
                idSubCategoriaNew.getProductoList().add(producto);
                idSubCategoriaNew = em.merge(idSubCategoriaNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = producto.getIdProducto();
                if (findProducto(id) == null) {
                    throw new NonexistentEntityException("The producto with id " + id + " no longer exists.");
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
            Producto producto;
            try {
                producto = em.getReference(Producto.class, id);
                producto.getIdProducto();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The producto with id " + id + " no longer exists.", enfe);
            }
            Categoria idCategoria = producto.getIdCategoria();
            if (idCategoria != null) {
                idCategoria.getProductoList().remove(producto);
                idCategoria = em.merge(idCategoria);
            }
            Marca idMarca = producto.getIdMarca();
            if (idMarca != null) {
                idMarca.getProductoList().remove(producto);
                idMarca = em.merge(idMarca);
            }
            Subcategoria idSubCategoria = producto.getIdSubCategoria();
            if (idSubCategoria != null) {
                idSubCategoria.getProductoList().remove(producto);
                idSubCategoria = em.merge(idSubCategoria);
            }
            em.remove(producto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Producto> findProductoEntities() {
        return findProductoEntities(true, -1, -1);
    }

    public List<Producto> findProductoEntities(int maxResults, int firstResult) {
        return findProductoEntities(false, maxResults, firstResult);
    }

    private List<Producto> findProductoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Producto.class));
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

    public Producto findProducto(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Producto.class, id);
        } finally {
            em.close();
        }
    }

    public int getProductoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Producto> rt = cq.from(Producto.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    
     public List<Subcategoria> listarSubPorCate(int idCate) {
        PreparedStatement ptstm;
        Connection cn;
        ResultSet rs;
        List<Subcategoria> listSubCategoria = new ArrayList<>();
        
        try {
            cn = Util.getConexionBD();
            ptstm = cn.prepareStatement("Select * from subcategoria where idCategoria="+idCate+"");
            rs = ptstm.executeQuery();
           
            while (rs.next()) {
                Subcategoria subC=new Subcategoria();
                Categoria cat = new Categoria();
                
                subC.setIdSubcategoria(rs.getInt(1));
                subC.setNombre(rs.getString(2));
                cat.setIdCategoria(rs.getInt(3));
                subC.setIdCategoria(cat);
                //Ingresamos cliente
                listSubCategoria.add(subC);
                
}
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSubCategoria;
    }
   
   
    
}
