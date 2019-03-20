package models.users;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
@Table(name="user")
@DiscriminatorValue("m")
public class Manager extends User{

    public Manager() {
    }

    public Manager(String name, String role, String em, String ps) {
        super(name, role, em, ps);
    }


    public static final Finder<Long, Manager> find = new Finder<>(Manager.class);
    
    public static final List<Manager> findAll() {
        return Manager.find.all();
    }

   
}