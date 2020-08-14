/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wyv.persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import wyv.persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author bdeg_
 */
public class SubcategoriaJpa implements Serializable {
    
     public SubcategoriaJpa() {
        this.emf= Persistence.createEntityManagerFactory("W_V_S.A.CPU");
    }

    public SubcategoriaJpa(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Subcategoria subcategoria) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Categoria idCategoria = subcategoria.getIdCategoria();
            if (idCategoria != null) {
                idCategoria = em.getReference(idCategoria.getClass(), idCategoria.getIdCategoria());
                subcategoria.setIdCategoria(idCategoria);
            }
            em.persist(subcategoria);
            if (idCategoria != null) {
                idCategoria.getSubcategoriaList().add(subcategoria);
                idCategoria = em.merge(idCategoria);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Subcategoria subcategoria) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Subcategoria persistentSubcategoria = em.find(Subcategoria.class, subcategoria.getIdSubcategoria());
            Categoria idCategoriaOld = persistentSubcategoria.getIdCategoria();
            Categoria idCategoriaNew = subcategoria.getIdCategoria();
            if (idCategoriaNew != null) {
                idCategoriaNew = em.getReference(idCategoriaNew.getClass(), idCategoriaNew.getIdCategoria());
                subcategoria.setIdCategoria(idCategoriaNew);
            }
            subcategoria = em.merge(subcategoria);
            if (idCategoriaOld != null && !idCategoriaOld.equals(idCategoriaNew)) {
                idCategoriaOld.getSubcategoriaList().remove(subcategoria);
                idCategoriaOld = em.merge(idCategoriaOld);
            }
            if (idCategoriaNew != null && !idCategoriaNew.equals(idCategoriaOld)) {
                idCategoriaNew.getSubcategoriaList().add(subcategoria);
                idCategoriaNew = em.merge(idCategoriaNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = subcategoria.getIdSubcategoria();
                if (findSubcategoria(id) == null) {
                    throw new NonexistentEntityException("The subcategoria with id " + id + " no longer exists.");
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
            Subcategoria subcategoria;
            try {
                subcategoria = em.getReference(Subcategoria.class, id);
                subcategoria.getIdSubcategoria();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The subcategoria with id " + id + " no longer exists.", enfe);
            }
            Categoria idCategoria = subcategoria.getIdCategoria();
            if (idCategoria != null) {
                idCategoria.getSubcategoriaList().remove(subcategoria);
                idCategoria = em.merge(idCategoria);
            }
            em.remove(subcategoria);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Subcategoria> findSubcategoriaEntities() {
        return findSubcategoriaEntities(true, -1, -1);
    }

    public List<Subcategoria> findSubcategoriaEntities(int maxResults, int firstResult) {
        return findSubcategoriaEntities(false, maxResults, firstResult);
    }

    private List<Subcategoria> findSubcategoriaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Subcategoria.class));
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

    public Subcategoria findSubcategoria(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Subcategoria.class, id);
        } finally {
            em.close();
        }
    }

    public int getSubcategoriaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Subcategoria> rt = cq.from(Subcategoria.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
