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

import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;
import java.io.File;

import java.io.IOException;
import java.awt.image.*;
import javax.imageio.*;
import org.imgscalr.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    private FormFactory formFactory;

    private Environment e;
    
        @Inject
        public HomeController(FormFactory f, Environment env) {
            this.e = env;
            this.formFactory = f;
        }
    
        public Result index(Long cat) {
            List<Projects> projectsList = null;
            List<Department> departmentList = Department.findAll();
            if (cat == 0) {
                projectsList = Projects.findAll();
            }
            else {
                projectsList = Department.find.ref(cat).getProjects();
            }
            return ok(index.render(projectsList, departmentList, User.getUserById(session().get("email"))));
        }




    //WEBPAGE

    public Result employee() {
        List<Employee> userList = Employee.findAll();
        return ok(employee.render(userList,User.getUserById(session().get("email")), e));
    }

    public Result manager() {
        List<Manager> userList = Manager.findAll();
        return ok(manager.render(userList,User.getUserById(session().get("email")), e));
    }

    public Result admin() {
        List<Admin> userList = Admin.findAll();
        return ok(admin.render(userList,User.getUserById(session().get("email")), e));
    }

    public Result profile() {
        User user = User.getUserById(session().get("email"));
        Employee emp = (Employee)User.getUserById(session().get("email"));
        return ok(profile.render(emp, user,User.getUserById(session().get("email")), e));
    }




    //ADD

    @Security.Authenticated(Secured.class)
    @With(AuthManager.class)
    @Transactional
    public Result addProjects() {
        Form<Projects> projectsForm = formFactory.form(Projects.class);
        return ok(addProjects.render(projectsForm, User.getUserById(session().get("email"))));
    }
    public Result addProjectsSubmit() {
        Form<Projects> newProjectsForm = formFactory.form(Projects.class).bindFromRequest();

        if (newProjectsForm.hasErrors()) {
            return badRequest(addProjects.render(newProjectsForm, User.getUserById(session().get("email"))));
        }
        else {
            Projects newProjects = newProjectsForm.get();

            if (newProjects.getId() == null) {
                newProjects.save();    
                flash("success", "Project "+newProjects.getId()+" for " + newProjects.getName() + " was added");
                
            }
            else if (newProjects.getId() != null) {
                newProjects.update();
                flash("success", "Project "+newProjects.getId()+" for " + newProjects.getName() + " was updated");
            }
        }

        return redirect(controllers.routes.HomeController.index(0));
    }



    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result addEmployee() {
        Form<Employee> newUserForm = formFactory.form(Employee.class);
        return ok(addEmployee.render(newUserForm,User.getUserById(session().get("email"))));
    }
    

    public Result addEmployeeSubmit() {
        Form<Employee> newUserForm = formFactory.form(Employee.class).bindFromRequest();
        

        if (newUserForm.hasErrors()) {
            return badRequest(addEmployee.render(newUserForm,User.getUserById(session().get("email"))));
            
        } 
        else {
            Employee user = newUserForm.get();
            System.out.println("Name: "+newUserForm.field("name").getValue().get());
            System.out.println("Role: "+newUserForm.field("role").getValue().get());
            System.out.println("Email: "+newUserForm.field("email").getValue().get());
            System.out.println("Password: "+newUserForm.field("password").getValue().get());

            if (User.getUserById(user.getEmail()) == null) {
                user.save();
                flash("success", "User " + user.getName() + " was added");                
            }else {
                user.update();
                flash("success", "User " + user.getName() + " was updated");                
            }

            MultipartFormData<File> data = request().body().asMultipartFormData();
            
            FilePart<File> image = data.getFile("upload");

            String saveImageMessage = saveFile(user.getEmail(), image);
            flash("success", "User "+user.getName()+" was added/updated "+saveImageMessage);
            return redirect(controllers.routes.HomeController.employee());
        }
    }



    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result addAdmin() {
        Form<Admin> newUserForm = formFactory.form(Admin.class);
        return ok(addAdmin.render(newUserForm,User.getUserById(session().get("email"))));
    }

    public Result addAdminSubmit() {
        Form<Admin> newUserForm = formFactory.form(Admin.class).bindFromRequest();
        

        if (newUserForm.hasErrors()) {
            return badRequest(addAdmin.render(newUserForm,User.getUserById(session().get("email"))));
            
        } 
        else {
            Admin user = newUserForm.get();
            System.out.println("Name: "+newUserForm.field("name").getValue().get());
            System.out.println("Role: "+newUserForm.field("role").getValue().get());
            System.out.println("Email: "+newUserForm.field("email").getValue().get());
            System.out.println("Password: "+newUserForm.field("password").getValue().get());

            if (User.getUserById(user.getEmail()) == null) {
                user.save();
                flash("success", "User " + user.getName() + " was added");                
            }else {
                user.update();
                flash("success", "User " + user.getName() + " was updated");                
            }

            MultipartFormData<File> data = request().body().asMultipartFormData();
            
            FilePart<File> image = data.getFile("upload");

            String saveImageMessage = saveFile(user.getEmail(), image);
            flash("success", "User "+user.getName()+" was added/updated "+saveImageMessage);
            return redirect(controllers.routes.HomeController.admin());
        }
    }



    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result addManager() {
        Form<Manager> newUserForm = formFactory.form(Manager.class);
        return ok(addManager.render(newUserForm,User.getUserById(session().get("email"))));
    }

    public Result addManagerSubmit() {
        Form<Manager> newUserForm = formFactory.form(Manager.class).bindFromRequest();
        

        if (newUserForm.hasErrors()) {
            return badRequest(addManager.render(newUserForm,User.getUserById(session().get("email"))));
            
        } 
        else {
            Manager user = newUserForm.get();
            System.out.println("Name: "+newUserForm.field("name").getValue().get());
            System.out.println("Role: "+newUserForm.field("role").getValue().get());
            System.out.println("Email: "+newUserForm.field("email").getValue().get());
            System.out.println("Password: "+newUserForm.field("password").getValue().get());

            if (User.getUserById(user.getEmail()) == null) {
                user.save();
                flash("success", "User " + user.getName() + " was added");                
            }else {
                user.update();
                flash("success", "User " + user.getName() + " was updated");                
            }

            MultipartFormData<File> data = request().body().asMultipartFormData();
            
            FilePart<File> image = data.getFile("upload");

            String saveImageMessage = saveFile(user.getEmail(), image);
            flash("success", "User "+user.getName()+" was added/updated "+saveImageMessage);
            return redirect(controllers.routes.HomeController.manager());
        }
    }




    //IMAGE

    public String saveFile(String id, FilePart<File> uploaded){
        if(uploaded != null){
            String mimeType = uploaded.getContentType();

            if(mimeType.startsWith("image/")){
                String fileName = uploaded.getFilename();

                String extension = "";
                int i = fileName.lastIndexOf('.');

                if(i >= 0){
                    extension = fileName.substring(i+1);
                }

                File file = uploaded.getFile();
                File dir = new File("public/images/userImages");

                if(!dir.exists()){
                    dir.mkdirs();
                }

                File newFile = new File("public/images/userImages/", id + "."+extension);
                if(file.renameTo(newFile)){

                    try{
                        BufferedImage img = ImageIO.read(newFile);
                        BufferedImage scaledImg = Scalr.resize(img, 90);

                        if(ImageIO.write(scaledImg, extension, new File("public/images/userImages/", id + "thumb.jpg"))){
                            return "/ file uploaded and thumbnail created.";
                        }else{
                            return "/ file uploaded but thumbnail creation failed.";  
                        }

                    }catch(IOException e){
                        return "/ file uploaded but thumbnail creation failed.";
                    }
                    
                }else{
                    return "/ file upload failed.";
                }
            }
        }

        return "/ no image file.";
    }




    //DELETE

    @Security.Authenticated(Secured.class)
    @With(AuthManager.class)
    @Transactional
    public Result deleteProjects(Long id) {
        Projects.find.ref(id).delete();

        flash("success", "Projects has been deleted");
        
        return redirect(routes.HomeController.index(0));
    }



    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result deleteEmployee(String email) {
        Employee u = (Employee)User.getUserById(email);
        u.delete();
        flash("success", "User has been deleted");

        return redirect(routes.HomeController.index(0));
    }



    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result deleteAdmin(String email) {
        Admin u = (Admin)User.getUserById(email);
        u.delete();
        flash("success", "User has been deleted");

        return redirect(routes.HomeController.index(0));
    }



    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result deleteManager(String email) {
        Manager u = (Manager)User.getUserById(email);
        u.delete();
        flash("success", "User has been deleted");

        return redirect(routes.HomeController.index(0));
    }




    //UPDATE

    @Security.Authenticated(Secured.class)
    @With(AuthManager.class)
    @Transactional
    public Result updateProjects(Long id) {
        Projects p;
        Form<Projects> projectsForm;

        try {
            p = Projects.find.byId(id);
            projectsForm = formFactory.form(Projects.class).fill(p);
        } 
        catch (Exception ex) {
            return badRequest("error");
        }
        return ok(addProjects.render(projectsForm,User.getUserById(session().get("email"))));
    }



    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result updateEmployee(String email) {        
        Employee u;
        Form<Employee> userForm;

        try {
            u = (Employee)User.getUserById(email);
            u.update();
            userForm = formFactory.form(Employee.class).fill(u);
        }
        catch (Exception ex) {
            return badRequest("error");
        }

        return ok(addEmployee.render(userForm,User.getUserById(session().get("email"))));
    }



    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result updateAdmin(String email) {        
        Admin u;
        Form<Admin> userForm;

        try {
            u = (Admin)User.getUserById(email);
            u.update();
            userForm = formFactory.form(Admin.class).fill(u);
        }
        catch (Exception ex) {
            return badRequest("error");
        }

        return ok(addAdmin.render(userForm,User.getUserById(session().get("email"))));
    }



    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result updateManager(String email) {        
        Manager u;
        Form<Manager> userForm;

        try {
            u = (Manager)User.getUserById(email);
            u.update();
            userForm = formFactory.form(Manager.class).fill(u);
        }
        catch (Exception ex) {
            return badRequest("error");
        }

        return ok(addManager.render(userForm,User.getUserById(session().get("email"))));
    }


}
