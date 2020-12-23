package dao;

import javax.persistence.EntityManager;

public abstract class JpaDaoImpl<E, I> {
    private EntityManager entityManager;

    public JpaDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(E entity) {
        try {
            entityManager.persist(entity);
        } catch (Exception exception) {
            exception.getStackTrace();
        }
    }

    public void update(E entity) {
        entityManager.merge(entity);
    }

    public void delete(E entity) {
        entityManager.remove(entity);
    }

    public E load(I id) {
        return entityManager.find(getEntityClass(), id);
    }

    protected abstract Class<E> getEntityClass();


    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
