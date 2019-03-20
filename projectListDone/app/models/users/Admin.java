package models.users;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
@Table(name="user")
@DiscriminatorValue("a")
public class Admin extends User{

    public Admin() {
    }

    public Admin(String name, String role, String em, String ps) {
        super(name, role, em, ps);
    }


    public static final Finder<Long, Admin> find = new Finder<>(Admin.class);
    
    public static final List<Admin> findAll() {
        return Admin.find.all();
    }

   
}