
package Persistencia;

import LogicaDeNegocio.PlantillaTurno;
import Persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

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

    public void create(PlantillaTurno plantillaTurno) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(plantillaTurno);
            em.getTransaction().commit();
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
            plantillaTurno = em.merge(plantillaTurno);
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
