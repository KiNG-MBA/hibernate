
import entity.Address;
import entity.Master;
import entity.Student;
import util.CURD;
import util.JPAUtil;

import javax.persistence.EntityManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        CURD curd = new CURD();
        curd.initializeDao(entityManager);


        Address address = curd.createAddress(2134L, "tehran", "tehran", "makatab", 123496L);

        Master master1 = curd.createMaster("sajad", "jaafri", 123L, 49.23, format.parse("1990-11-19"), address);
        Student student1 = curd.createStudent("masoud", "hassannia", 732L, format.parse("1994-02-01"), address);

        entityManager.getTransaction().commit();
        entityManager.close();
        JPAUtil.shutdown();

    }


}
