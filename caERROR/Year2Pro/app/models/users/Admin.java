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
    
    public Admin(){

    }
    public Admin(String email,String role,String name,String phoneNumber,String password){
        super(email, role, name, phoneNumber, password);
    }

    

    public static Finder<Long, Admin> find = new Finder<Long,Admin>(Admin.class);

    public static final List<Admin> findAll(){
        return Admin.find.all();
    }

    

    
}
