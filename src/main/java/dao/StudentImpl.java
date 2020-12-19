package dao;

import entity.Student;

import javax.persistence.EntityManager;

public class StudentImpl extends JpaDaoImpl<Student,Long> {
    public StudentImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    protected Class<Student> getEntityClass() {
        return Student.class;
    }
}
