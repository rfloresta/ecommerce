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
import wyv.persistencia.exceptions.PreexistingEntityException;

/**
 *
 * @author Romario
 */
public class RecuperarPasswordJpa implements Serializable {

    public RecuperarPasswordJpa(){
        this.emf = Persistence.createEntityManagerFactory("W_V_S.A.CPU");
    }

    public RecuperarPasswordJpa(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(RecuperarPassword recuperarPassword) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(recuperarPassword);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findRecuperarPassword(recuperarPassword.getIdUsuario()) != null) {
                throw new PreexistingEntityException("RecuperarPassword " + recuperarPassword + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(RecuperarPassword recuperarPassword) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            recuperarPassword = em.merge(recuperarPassword);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = recuperarPassword.getIdUsuario();
                if (findRecuperarPassword(id) == null) {
                    throw new NonexistentEntityException("The recuperarPassword with id " + id + " no longer exists.");
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
            RecuperarPassword recuperarPassword;
            try {
                recuperarPassword = em.getReference(RecuperarPassword.class, id);
                recuperarPassword.getIdUsuario();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The recuperarPassword with id " + id + " no longer exists.", enfe);
            }
            em.remove(recuperarPassword);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<RecuperarPassword> findRecuperarPasswordEntities() {
        return findRecuperarPasswordEntities(true, -1, -1);
    }

    public List<RecuperarPassword> findRecuperarPasswordEntities(int maxResults, int firstResult) {
        return findRecuperarPasswordEntities(false, maxResults, firstResult);
    }

    private List<RecuperarPassword> findRecuperarPasswordEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(RecuperarPassword.class));
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

    public RecuperarPassword findRecuperarPassword(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(RecuperarPassword.class, id);
        } finally {
            em.close();
        }
    }

    public int getRecuperarPasswordCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<RecuperarPassword> rt = cq.from(RecuperarPassword.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
