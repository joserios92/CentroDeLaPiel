/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import LogicaDeNegocio.EstadoTurno;
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
public class EstadoTurnoJpaController implements Serializable {

    public EstadoTurnoJpaController() {
        emf = Persistence.createEntityManagerFactory("CentroDeLaPielPU");
    }

    public EstadoTurnoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(EstadoTurno estadoTurno) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(estadoTurno);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findEstadoTurno(estadoTurno.getIdEstadoTurno()) != null) {
                throw new PreexistingEntityException("EstadoTurno " + estadoTurno + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(EstadoTurno estadoTurno) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            estadoTurno = em.merge(estadoTurno);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = estadoTurno.getIdEstadoTurno();
                if (findEstadoTurno(id) == null) {
                    throw new NonexistentEntityException("The estadoTurno with id " + id + " no longer exists.");
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
            EstadoTurno estadoTurno;
            try {
                estadoTurno = em.getReference(EstadoTurno.class, id);
                estadoTurno.getIdEstadoTurno();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The estadoTurno with id " + id + " no longer exists.", enfe);
            }
            em.remove(estadoTurno);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<EstadoTurno> findEstadoTurnoEntities() {
        return findEstadoTurnoEntities(true, -1, -1);
    }

    public List<EstadoTurno> findEstadoTurnoEntities(int maxResults, int firstResult) {
        return findEstadoTurnoEntities(false, maxResults, firstResult);
    }

    private List<EstadoTurno> findEstadoTurnoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(EstadoTurno.class));
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

    public EstadoTurno findEstadoTurno(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(EstadoTurno.class, id);
        } finally {
            em.close();
        }
    }

    public int getEstadoTurnoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<EstadoTurno> rt = cq.from(EstadoTurno.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
