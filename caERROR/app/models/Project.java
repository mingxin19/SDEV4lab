package models;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;


public class Project extends Model {

    // Properties
    @Id
    @GeneratedValue
    private Long id;

    @Constraints.Required
    private String empName;

    private String description;

    @Constraints.Required
    private String startDate;

    @Constraints.Required
    private String department;

    // Default Constructor
    public Project() {
    }

    // Constructor to initialise object
    public Project(Long id, String empName, String description, String startDate, String department) {
        this.id = id;
        this.empName = empName;
        this.description = description;
        this.startDate = startDate;
        this.department = department;
    }

    // Accessor methods
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
}