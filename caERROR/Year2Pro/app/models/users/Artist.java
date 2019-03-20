package models.users;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
@Table(name="user")
@DiscriminatorValue("e")
public class Artist extends User{
    
    public Artist(){

    }
    public Artist(String email,String role,String name,String phoneNumber,String password){
        super(email, role, name, phoneNumber, password);
    }

    

    public static Finder<Long, Artist> find = new Finder<Long,Artist>(Artist.class);

    public static final List<Artist> findAll(){
        return Artist.find.all();
    }

    

    
}
