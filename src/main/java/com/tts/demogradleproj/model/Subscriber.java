package com.tts.demogradleproj.model;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class Subscriber {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String Gender;
    private String City;
    private String State;
    private String userName;
    @Column
    @CreationTimestamp
    private Date signedUp;
    // empty constructors are utilized for beans
    // this class will be picked up as a java bean
    // they need to be serializable and have an empty constructor
    public Subscriber() {
    }
    public Subscriber(String firstName, String lastName, String Gender, String City, String State,String userName, Date signedUp) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Gender = Gender ;
        this.City = City ;
        this.State = State ;
        this.userName = userName;
        this.signedUp = signedUp;
    }
    public Long getId() {
        return id;
    }
    //    public void setId(Long id) {
//        this.id = id;
//    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender(){return Gender;} ;
    public void  setGender(String Gender){ this.Gender = Gender;} ;

    public String getCity(){return City;} ;
    public void setCity(String City){ this.City = City;};

    public String getState(){return State;};
    public void setState(String State){this.State = State;} ;

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public Date getSignedUp() {
        return signedUp;
    }
    public void setSignedUp(Date signedUp) {
        this.signedUp = signedUp;
    }
    @Override
    public String toString() {
        return "Subscriber{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", signedUp=" + signedUp +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subscriber that = (Subscriber) o;
        return id.equals(that.id) && firstName.equals(that.firstName) && lastName.equals(that.lastName) && userName.equals(that.userName) && signedUp.equals(that.signedUp);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, userName, signedUp);
    }
}






