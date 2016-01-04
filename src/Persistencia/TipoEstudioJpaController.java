/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import LogicaDeNegocio.TipoEstudio;
import Persistencia.exceptions.NonexistentEntityException;
import Persistencia.exceptions.PreexistingEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Dell
 */
public class TipoEstudioJpaController implements Serializable {

    public TipoEstudioJpaController() {
        emf = Persistence.createEntityManagerFactory("CentroDeLaPielPU");
    }

    public TipoEstudioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(TipoEstudio tipoEstudio) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(tipoEstudio);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findTipoEstudio(tipoEstudio.getIdTipoEstudio()) != null) {
                throw new PreexistingEntityException("TipoEstudio " + tipoEstudio + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TipoEstudio tipoEstudio) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            tipoEstudio = em.merge(tipoEstudio);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = tipoEstudio.getIdTipoEstudio();
                if (findTipoEstudio(id) == null) {
                    throw new NonexistentEntityException("The tipoEstudio with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TipoEstudio tipoEstudio;
            try {
                tipoEstudio = em.getReference(TipoEstudio.class, id);
                tipoEstudio.getIdTipoEstudio();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tipoEstudio with id " + id + " no longer exists.", enfe);
            }
            em.remove(tipoEstudio);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TipoEstudio> findTipoEstudioEntities() {
        return findTipoEstudioEntities(true, -1, -1);
    }

    public List<TipoEstudio> findTipoEstudioEntities(int maxResults, int firstResult) {
        return findTipoEstudioEntities(false, maxResults, firstResult);
    }

    private List<TipoEstudio> findTipoEstudioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TipoEstudio.class));
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

    public TipoEstudio findTipoEstudio(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TipoEstudio.class, id);
        } finally {
            em.close();
        }
    }

    public int getTipoEstudioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TipoEstudio> rt = cq.from(TipoEstudio.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}