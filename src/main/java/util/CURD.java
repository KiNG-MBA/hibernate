package util;

import dao.AddressImpl;
import dao.MasterImpl;
import dao.StudentImpl;
import entity.Address;
import entity.Master;
import entity.Student;

import javax.persistence.EntityManager;

import java.util.Date;


public class CURD {

    MasterImpl masterImpl;
    AddressImpl addressImpl;
    StudentImpl studentImpl;
    public Master createMaster(String firstName, String lastName,
                                           Long tID, Double salary, Date birthday,Address address) {
        Master master = new Master();
        master.setFirstName(firstName);
        master.setLastName(lastName);
        master.setTeacherCode(tID);
        master.setSalary(salary);
        master.setBirthDay(birthday);
        master.setAddress(address);
        try{
            masterImpl.save(master);

        }catch (Exception exception) {
            exception.getStackTrace();
        }
        return master;
    }

    public Address createAddress(Long number,String state,String city,String postAddress,Long postCode){
        Address address = new Address();
        address.setNumber(number);
        address.setState(state);
        address.setCity(city);
        address.setPostalAddress(postAddress);
        address.setPostalCode(postCode);
        try {
            addressImpl.save(address);
        }catch (Exception exception){
            exception.getStackTrace();
        }

        return address;
    }

    public Student createStudent(String firstName,String lastName,Long sID,Date birthday, Address address){
        Student student = new Student();
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setStudentCode(sID);
        student.setAddress(address);
        student.setBirthDay(birthday);
        try{
            studentImpl.save(student);
        }catch (Exception exception){
            exception.getStackTrace();
        }
        return student;
    }

    public void initializeDao(EntityManager entityManager) {
        studentImpl = new StudentImpl(entityManager);
        masterImpl = new MasterImpl(entityManager);
        addressImpl = new AddressImpl(entityManager);
    }
}
