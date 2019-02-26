package models.users;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
@Table(name ="user")
@DiscriminatorValue("c")
public class Customer extends User{
    @Constraints.Required
    private String street1;

    @Constraints.Required
    private String street2;

    @Constraints.Required
    private String town;

    @Constraints.Required
    private String postCode;

    @Constraints.Required
    private String creditCard;
    
    public Customer(){

    }

    public Customer(String s1, String s2, String t, String pC, String cC){
        this.street1 = s1;
        this.street2 = s2;
        this.town = t;
        this.postCode = pC;
        this.creditCard = cC;
    }

    public String getStreet1() {
        return street1;
    }
    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }
    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getTown() {
        return town;
    }
    public void setTown(String town) {
        this.town = town;
    }

    public String getPostCode() {
        return postCode;
    }
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCreditCard() {
        return creditCard;
    }
    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public static final Finder<Long, Customer> find = new Finder<>(Customer.class);

    public static final List<Customer> findAll(){
        return Customer.find.all();
    }

}