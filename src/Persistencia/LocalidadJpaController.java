
package Persistencia;

import LogicaDeNegocio.Localidad;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import LogicaDeNegocio.Provincia;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LocalidadJpaController implements Serializable {

    public LocalidadJpaController() {
        emf = Persistence.createEntityManagerFactory("CentroDeLaPielPU");
    }

    public LocalidadJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Localidad localidad) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Provincia unaProvincia = localidad.getUnaProvincia();
            if (unaProvincia != null) {
                unaProvincia = em.getReference(unaProvincia.getClass(), unaProvincia.getIdProvincia());
                localidad.setUnaProvincia(unaProvincia);
            }
            em.persist(localidad);
            if (unaProvincia != null) {
                unaProvincia.getLocalidades().add(localidad);
                unaProvincia = em.merge(unaProvincia);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Localidad localidad) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Localidad persistentLocalidad = em.find(Localidad.class, localidad.getIdLocalidad());
            Provincia unaProvinciaOld = persistentLocalidad.getUnaProvincia();
            Provincia unaProvinciaNew = localidad.getUnaProvincia();
            if (unaProvinciaNew != null) {
                unaProvinciaNew = em.getReference(unaProvinciaNew.getClass(), unaProvinciaNew.getIdProvincia());
                localidad.setUnaProvincia(unaProvinciaNew);
            }
            localidad = em.merge(localidad);
            if (unaProvinciaOld != null && !unaProvinciaOld.equals(unaProvinciaNew)) {
                unaProvinciaOld.getLocalidades().remove(localidad);
                unaProvinciaOld = em.merge(unaProvinciaOld);
            }
            if (unaProvinciaNew != null && !unaProvinciaNew.equals(unaProvinciaOld)) {
                unaProvinciaNew.getLocalidades().add(localidad);
                unaProvinciaNew = em.merge(unaProvinciaNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = localidad.getIdLocalidad();
                if (findLocalidad(id) == null) {
                    throw new NonexistentEntityException("The localidad with id " + id + " no longer exists.");
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
            Localidad localidad;
            try {
                localidad = em.getReference(Localidad.class, id);
                localidad.getIdLocalidad();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The localidad with id " + id + " no longer exists.", enfe);
            }
            Provincia unaProvincia = localidad.getUnaProvincia();
            if (unaProvincia != null) {
                unaProvincia.getLocalidades().remove(localidad);
                unaProvincia = em.merge(unaProvincia);
            }
            em.remove(localidad);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Localidad> findLocalidadEntities() {
        return findLocalidadEntities(true, -1, -1);
    }

    public List<Localidad> findLocalidadEntities(int maxResults, int firstResult) {
        return findLocalidadEntities(false, maxResults, firstResult);
    }

    private List<Localidad> findLocalidadEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Localidad.class));
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

    public Localidad findLocalidad(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Localidad.class, id);
        } finally {
            em.close();
        }
    }

    public int getLocalidadCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Localidad> rt = cq.from(Localidad.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
