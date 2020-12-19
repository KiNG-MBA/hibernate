package entity;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long ID;

    private Long number;

    private String state;

    private String city;

    private String postalAddress;

    private Long postalCode;

    @OneToOne(targetEntity = Master.class)
    private Master master;

    @OneToMany(mappedBy ="address")
    private Set<Student> students;



    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public Long getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Long postalCode) {
        this.postalCode = postalCode;
    }

    public Master getMaster() {
        return master;
    }

    public void setMaster(Master master) {
        this.master = master;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
