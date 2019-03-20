package models.users;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
@Table(name="user")
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type")
@DiscriminatorValue("u")
public class User extends Model {
    @Id
    private String email;

    @Constraints.Required
    private String role;    

    @Constraints.Required
    private String name;

    @Constraints.Required
    private String password;

    public User() {
    }

    public User(String name, String role, String em, String ps) {
        this.name = name;
        this.role = role;
        this.email = em;
        this.password = ps;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRole(String role) {
        this.role = role;
    }

    
    public void setName(String name) {
        this.name = name;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public static Finder<String, User> find = new Finder<String, User>(User.class);



    public static User authenticate(String email, String password) {
        return find.query().where().eq("email", email).eq("password", password).findUnique();
    }

    public static User getUserById(String id) {
        if (id == null) {
            return null;
        }
        else {
            return find.byId(id);
        }
    }

    

}