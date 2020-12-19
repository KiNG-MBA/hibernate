package dao;

import entity.Master;

import javax.persistence.EntityManager;

public class MasterImpl extends JpaDaoImpl<Master,Long> {
    public MasterImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    protected Class<Master> getEntityClass() {
        return Master.class;
    }
}
