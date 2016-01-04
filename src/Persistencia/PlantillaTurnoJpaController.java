/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import LogicaDeNegocio.Agenda;
import LogicaDeNegocio.PlantillaTurno;
import Persistencia.exceptions.NonexistentEntityException;
import Persistencia.exceptions.PreexistingEntityException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Dell
 */
public class PlantillaTurnoJpaController implements Serializable {

    public PlantillaTurnoJpaController() {
        emf = Persistence.createEntityManagerFactory("CentroDeLaPielPU");
    }

    public PlantillaTurnoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(PlantillaTurno plantillaTurno) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Agenda unaAgenda = plantillaTurno.getUnaAgenda();
            if (unaAgenda != null) {
                unaAgenda = em.getReference(unaAgenda.getClass(), unaAgenda.getIdAgenda());
                plantillaTurno.setUnaAgenda(unaAgenda);
            }
            em.persist(plantillaTurno);
            if (unaAgenda != null) {
                unaAgenda.getPlantillaTurnos().add(plantillaTurno);
                unaAgenda = em.merge(unaAgenda);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findPlantillaTurno(plantillaTurno.getIdPlantilla()) != null) {
                throw new PreexistingEntityException("PlantillaTurno " + plantillaTurno + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(PlantillaTurno plantillaTurno) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            PlantillaTurno persistentPlantillaTurno = em.find(PlantillaTurno.class, plantillaTurno.getIdPlantilla());
            Agenda unaAgendaOld = persistentPlantillaTurno.getUnaAgenda();
            Agenda unaAgendaNew = plantillaTurno.getUnaAgenda();
            if (unaAgendaNew != null) {
                unaAgendaNew = em.getReference(unaAgendaNew.getClass(), unaAgendaNew.getIdAgenda());
                plantillaTurno.setUnaAgenda(unaAgendaNew);
            }
            plantillaTurno = em.merge(plantillaTurno);
            if (unaAgendaOld != null && !unaAgendaOld.equals(unaAgendaNew)) {
                unaAgendaOld.getPlantillaTurnos().remove(plantillaTurno);
                unaAgendaOld = em.merge(unaAgendaOld);
            }
            if (unaAgendaNew != null && !unaAgendaNew.equals(unaAgendaOld)) {
                unaAgendaNew.getPlantillaTurnos().add(plantillaTurno);
                unaAgendaNew = em.merge(unaAgendaNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = plantillaTurno.getIdPlantilla();
                if (findPlantillaTurno(id) == null) {
                    throw new NonexistentEntityException("The plantillaTurno with id " + id + " no longer exists.");
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
            PlantillaTurno plantillaTurno;
            try {
                plantillaTurno = em.getReference(PlantillaTurno.class, id);
                plantillaTurno.getIdPlantilla();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The plantillaTurno with id " + id + " no longer exists.", enfe);
            }
            Agenda unaAgenda = plantillaTurno.getUnaAgenda();
            if (unaAgenda != null) {
                unaAgenda.getPlantillaTurnos().remove(plantillaTurno);
                unaAgenda = em.merge(unaAgenda);
            }
            em.remove(plantillaTurno);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<PlantillaTurno> findPlantillaTurnoEntities() {
        return findPlantillaTurnoEntities(true, -1, -1);
    }

    public List<PlantillaTurno> findPlantillaTurnoEntities(int maxResults, int firstResult) {
        return findPlantillaTurnoEntities(false, maxResults, firstResult);
    }

    private List<PlantillaTurno> findPlantillaTurnoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(PlantillaTurno.class));
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

    public PlantillaTurno findPlantillaTurno(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(PlantillaTurno.class, id);
        } finally {
            em.close();
        }
    }

    public int getPlantillaTurnoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<PlantillaTurno> rt = cq.from(PlantillaTurno.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
