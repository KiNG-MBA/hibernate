package entity;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long ID;

    @Column(unique = true,nullable = false)
    private Long number;
    @Column(name="state")
    private String state;
    @Column(name="city")
    private String city;
    @Column(name="post_address")
    private String postalAddress;
    @Column(name="post_code")
    private Long postalCode;

//    @OneToOne(targetEntity = Master.class)
//    private Master master;

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

//    public Master getMaster() {
//        return master;
//    }
//
//    public void setMaster(Master master) {
//        this.master = master;
//    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
