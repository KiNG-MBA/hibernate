package dao;

import entity.Address;

import javax.persistence.EntityManager;

public class AddressImpl extends JpaDaoImpl<Address,Long> {
    public AddressImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    protected Class<Address> getEntityClass() {
        return Address.class;
    }
}
