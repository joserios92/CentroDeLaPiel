
package Persistencia;

import LogicaDeNegocio.ImagenEstudio;
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

public class ImagenEstudioJpaController implements Serializable {

    public ImagenEstudioJpaController() {
        emf = Persistence.createEntityManagerFactory("CentroDeLaPielPU");
    }

    public ImagenEstudioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(ImagenEstudio imagenEstudio) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(imagenEstudio);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(ImagenEstudio imagenEstudio) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            imagenEstudio = em.merge(imagenEstudio);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = imagenEstudio.getIdImagenEstudio();
                if (findImagenEstudio(id) == null) {
                    throw new NonexistentEntityException("The imagenEstudio with id " + id + " no longer exists.");
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
            ImagenEstudio imagenEstudio;
            try {
                imagenEstudio = em.getReference(ImagenEstudio.class, id);
                imagenEstudio.getIdImagenEstudio();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The imagenEstudio with id " + id + " no longer exists.", enfe);
            }
            em.remove(imagenEstudio);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<ImagenEstudio> findImagenEstudioEntities() {
        return findImagenEstudioEntities(true, -1, -1);
    }

    public List<ImagenEstudio> findImagenEstudioEntities(int maxResults, int firstResult) {
        return findImagenEstudioEntities(false, maxResults, firstResult);
    }

    private List<ImagenEstudio> findImagenEstudioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(ImagenEstudio.class));
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

    public ImagenEstudio findImagenEstudio(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(ImagenEstudio.class, id);
        } finally {
            em.close();
        }
    }

    public int getImagenEstudioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<ImagenEstudio> rt = cq.from(ImagenEstudio.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
