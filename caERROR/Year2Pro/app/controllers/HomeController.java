package controllers;

import play.mvc.*;
import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import models.*;
import models.users.*;
import views.html.*;



public class HomeController extends Controller {

    
    private FormFactory formFactory;

    @Inject
    public HomeController(FormFactory f){
        this.formFactory = f;
    }

    public Result index() {
        return ok(index.render(User.getUserById(session().get("email"))));
    }

/*    public Result onsale(Long cat){
        List<ItemOnSale> itemList = null;
        List<Category> categoryList = Category.findAll();

        if(cat == 0){
            itemList = ItemOnSale.findAll();
        } else {
            itemList = Category.find.ref(cat).getItems();
        }
        return ok(onsale.render(itemList,categoryList,User.getUserById(session().get("email"))));
        }
    */    


    public Result gallerya(){
        return ok(gallerya.render(User.getUserById(session().get("email"))));
    }
    public Result galleryk(){
        return ok(galleryk.render(User.getUserById(session().get("email"))));
    }
    public Result gallerym(){
        return ok(gallerym.render(User.getUserById(session().get("email"))));
    }

    public Result userProfile(){
        return ok(userProfile.render(User.getUserById(session().get("email"))));
    }

/*    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    public Result addItem(){
        Form<ItemOnSale> itemForm = formFactory.form(ItemOnSale.class);
        return ok(addItem.render(itemForm,User.getUserById(session().get("email"))));
    }
*/
/*    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result addItemSubmit(){
        Form<ItemOnSale> newItemForm = formFactory.form(ItemOnSale.class).bindFromRequest();

        if(newItemForm.hasErrors()){
            return badRequest(addItem.render(newItemForm,User.getUserById(session().get("email"))));
        }else{
            ItemOnSale newItem = newItemForm.get();
            if(newItem.getId() == null){
                newItem.save();
                flash("success","Item "+newItem.getName()+" was added.");
            }else{
                newItem.update();
                flash("success","Item "+newItem.getName()+" was updated.");
            }
            
            return redirect(controllers.routes.HomeController.onsale(0));
        }
    }
*/
/*    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result deleteItem(Long id){
        ItemOnSale.find.ref(id).delete();
        flash("success","Item has been deleted.");
        return redirect(controllers.routes.HomeController.onsale(0));
    }
*/
/*    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    public Result updateItem(Long id){
        ItemOnSale i;
        Form<ItemOnSale> itemForm;

        try{
            i = ItemOnSale.find.byId(id);
            itemForm = formFactory.form(ItemOnSale.class).fill(i);
        }catch(Exception e){
            return badRequest("error"+e.getMessage());
        }
        return ok(addItem.render(itemForm,User.getUserById(session().get("email"))));
        }
*/




    public Result admin_users(){
        List<Admin> userList = null;
      
        userList = Admin.findAll();

        return ok(admin_users.render(userList,User.getUserById(session().get("email"))));
    }

    public Result admin_artist(){
        List<Artist> userList = null;
      
        userList = Artist.findAll();

        return ok(admin_artist.render(userList,User.getUserById(session().get("email"))));
    }

    public Result admin_cust(){
        List<Customer> userList = null;
      
        userList = Customer.findAll();

        return ok(admin_cust.render(userList,User.getUserById(session().get("email"))));
    }

    public Result admin_appointments(){
       
        List<Appointment> appList = null;

        appList= Appointment.findAll();

        return ok(admin_appointments.render(appList,User.getUserById(session().get("email"))));
    }



    //ADD   


    @Security.Authenticated(Secured.class)
    @Transactional
    public Result addAdmin() {
        Form<Admin> userForm = formFactory.form(Admin.class);
        return ok(addAdmin.render(userForm,User.getUserById(session().get("email"))));
    }
    public Result addAdminSubmit(){
        Form<Admin> newUserForm = formFactory.form(Admin.class).bindFromRequest();
        if (newUserForm.hasErrors()) {
            return badRequest(addAdmin.render(newUserForm,User.getUserById(session().get("email"))));
        } else {
            Admin newUser = newUserForm.get();
            System.out.println("Name: "+newUserForm.field("name").getValue().get());
            System.out.println("Email: "+newUserForm.field("email").getValue().get());
            System.out.println("Password: "+newUserForm.field("password").getValue().get());
            System.out.println("Role: "+newUserForm.field("role").getValue().get());

            if(User.getUserById(newUser.getEmail())==null){
                newUser.save();
            }else{
                newUser.update();
            }
            flash("success", "User " + newUser.getName() + " was added/updated.");
            return redirect(controllers.routes.HomeController.admin_users());             
        }
    
    }



    @Security.Authenticated(Secured.class)
    @Transactional
    public Result addArtist() {
        Form<Artist> userForm = formFactory.form(Artist.class);
        return ok(addArtist.render(userForm,User.getUserById(session().get("email"))));
    }
    public Result addArtistSubmit(){
        Form<Artist> newUserForm = formFactory.form(Artist.class).bindFromRequest();
        if (newUserForm.hasErrors()) {
            return badRequest(addArtist.render(newUserForm,User.getUserById(session().get("email"))));
        } else {
            Artist newUser = newUserForm.get();
            System.out.println("Name: "+newUserForm.field("name").getValue().get());
            System.out.println("Email: "+newUserForm.field("email").getValue().get());
            System.out.println("Password: "+newUserForm.field("password").getValue().get());
            System.out.println("Role: "+newUserForm.field("role").getValue().get());

            if(User.getUserById(newUser.getEmail())==null){
                newUser.save();
            }else{
                newUser.update();
            }
            flash("success", "User " + newUser.getName() + " was added/updated.");
            return redirect(controllers.routes.HomeController.admin_artist());             
        }
    
    }



    @Security.Authenticated(Secured.class)
    @Transactional
    public Result addCust() {
        Form<Customer> userForm = formFactory.form(Customer.class);
        return ok(addCust.render(userForm,User.getUserById(session().get("email"))));
    }
    public Result addCustSubmit(){
        Form<Customer> newUserForm = formFactory.form(Customer.class).bindFromRequest();
        if (newUserForm.hasErrors()) {
            return badRequest(addCust.render(newUserForm,User.getUserById(session().get("email"))));
        } else {
            Customer newUser = newUserForm.get();
            System.out.println("Name: "+newUserForm.field("name").getValue().get());
            System.out.println("Email: "+newUserForm.field("email").getValue().get());
            System.out.println("Password: "+newUserForm.field("password").getValue().get());
            System.out.println("Role: "+newUserForm.field("role").getValue().get());

            if(User.getUserById(newUser.getEmail())==null){
                newUser.save();
            }else{
                newUser.update();
            }
            flash("success", "User " + newUser.getName() + " was added/updated.");
            return redirect(controllers.routes.HomeController.admin_cust());             
        }
    
    }


    

    //DELETE
    


    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result deleteAdmin(String email){
        Admin u = (Admin)User.getUserById(email);
        u.delete();
        flash("success", "User has been deleted.");
        return redirect(controllers.routes.HomeController.admin_users());
    }




    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result deleteArtist(String email){
        Artist u = (Artist)User.getUserById(email);
        u.delete();
        flash("success", "User has been deleted.");
        return redirect(controllers.routes.HomeController.admin_artist());
    }



    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result deleteCust(String email){
        Customer u = (Customer)User.getUserById(email);
        u.delete();
        flash("success", "User has been deleted.");
        return redirect(controllers.routes.HomeController.admin_cust());
    }




    //UPDATE

    @Security.Authenticated(Secured.class)
    public Result updateAdmin(String email){
        Admin u;
        Form<Admin> userForm;
        try{
            u = (Admin)User.getUserById(email);
            u.update();
            userForm = formFactory.form(Admin.class).fill(u);
        }catch(Exception e){
            return badRequest("error");
        }
        return ok(addAdmin.render(userForm,User.getUserById(session().get("email"))));
    }



    @Security.Authenticated(Secured.class)
    public Result updateArtist(String email){
        Artist u;
        Form<Artist> userForm;
        try{
            u = (Artist)User.getUserById(email);
            u.update();
            userForm = formFactory.form(Artist.class).fill(u);
        }catch(Exception e){
            return badRequest("error");
        }
        return ok(addArtist.render(userForm,User.getUserById(session().get("email"))));
    }



    @Security.Authenticated(Secured.class)
    public Result updateCust(String email){
        Customer u;
        Form<Customer> userForm;
        try{
            u = (Customer)User.getUserById(email);
            u.update();
            userForm = formFactory.form(Customer.class).fill(u);
        }catch(Exception e){
            return badRequest("error");
        }
        return ok(addCust.render(userForm,User.getUserById(session().get("email"))));
    }
    
}
