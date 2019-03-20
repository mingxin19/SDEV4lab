package models.users;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
@Table(name="user")
@DiscriminatorValue("c")
public class Customer extends User{
    
    public Customer(){

    }
    public Customer(String email,String role,String name,String phoneNumber,String password){
        super(email, role, name, phoneNumber, password);
    }

    

    public static Finder<Long, Customer> find = new Finder<Long,Customer>(Customer.class);

    public static final List<Customer> findAll(){
        return Customer.find.all();
    }

    

    
}
