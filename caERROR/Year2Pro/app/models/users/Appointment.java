package models.users;

import java.util.*;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlID;


import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Appointment extends Model{

    @Id
    //Generate itself
    private int apmNumber;

    @Constraints.Required
    private String name;
    @Constraints.Required
    private String email;
    @Constraints.Required
    private String phoneNumber;
    @Constraints.Required
    private String date;
    @Constraints.Required
    private String time;
    @Constraints.Required
    private String artist;
    @Constraints.Required
    private String description;
    @Constraints.Required
    private String size;
    @Constraints.Required
    private String placement;
    @Constraints.Required
    private String colour;

    public Appointment(){

    }

    public Appointment(String n, String e, String pN, String d, 
    String t, String a, String dp, String s, String p, String c){
        this.name = n;
        this.email = e;
        this.phoneNumber = pN;
        this.date = d;
        this.time = t;
        this.artist = a;
        this.description = dp;
        this.size = s;
        this.placement = p;
        this.colour = c;
    }

    public int getId(){
        return apmNumber;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date = date;
    }

    public String getTime(){
        return time;
    }
    public void setTime(String time){
        this.time = time;
    }

    public String getArtist(){
        return artist;
    }
    public void setArtist(String artist){
        this.artist = artist;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public String getSize(){
        return size;
    }
    public void setSize(String size){
        this.size = size;
    }

    public String getPlacement(){
        return placement;
    }
    public void setPlacement(String placement){
        this.placement = placement;
    }

    public String getColour(){
        return colour;
    }
    public void setColour(String colour){
        this.colour = colour;
    }

    public static Finder<Long, Appointment> find = new Finder<Long,Appointment>(Appointment.class);

    public static final List<Appointment> findAll(){
        return Appointment.find.all();
    }

    public static Appointment getAppointmentById(int id){
        if(id == 0){
            return null;
        }else{
            return find.query().where().eq("apm_number",id).findUnique();
        }
    }

    

}