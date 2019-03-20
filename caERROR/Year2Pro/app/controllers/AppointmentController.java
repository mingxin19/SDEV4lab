package controllers;

import play.mvc.*;
import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import models.users.*;
import views.html.*;

public class AppointmentController extends Controller{
    private FormFactory formFactory;

    @Inject
    public AppointmentController(FormFactory f){
        this.formFactory=f;
    }

    public Result appointment(){
        Form<Appointment> appForm = formFactory.form(Appointment.class);
        return ok(appointment.render(appForm,User.getUserById(session().get("email"))));
    }

    public Result appointmentSubmit(){
        Form<Appointment> appForm = formFactory.form(Appointment.class).bindFromRequest();

        if(appForm.hasErrors()){
            return badRequest(appointment.render(appForm,User.getUserById(session().get("email"))));
        }else{
            
            Appointment newApp = appForm.get();
           
            newApp.save();
            flash("success", "Appointment for " + newApp.getName() + " is booked.");
            return redirect(controllers.routes.AppointmentController.appointment());
    
            
            
        }
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result deleteAppointment(int id){
        Appointment app = Appointment.getAppointmentById(id);
        app.delete();
        flash("success", "Appointment has been deleted.");
        return redirect(controllers.routes.HomeController.admin_appointments());
    }

    

    @Security.Authenticated(Secured.class)
    public Result updateAppointment(int id){
        Appointment app;
        Form<Appointment> appForm;
        try{
            app = Appointment.getAppointmentById(id);
            app.update();
            appForm = formFactory.form(Appointment.class).fill(app);
        }catch(Exception e){
            return badRequest("error");
        }
        return ok(appointment.render(appForm,User.getUserById(session().get("email"))));
    }
}