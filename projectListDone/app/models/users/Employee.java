package models.users;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.*;

@Entity
@Table(name="user")
@DiscriminatorValue("e")
public class Employee extends User{

    @ManyToOne
    private Department department;

    public Employee() {
    }

    public Employee(String name, String role, String em, String ps) {
        super(name, role, em, ps);
    }


    public static final Finder<Long, Employee> find = new Finder<>(Employee.class);
    
    public static final List<Employee> findAll() {
        return Employee.find.all();
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

   
}