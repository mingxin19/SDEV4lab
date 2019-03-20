
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object addUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.User],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[models.users.User], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.62*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add User",user)/*4.23*/ {_display_(Seq[Any](format.raw/*4.25*/("""
    """),format.raw/*5.5*/("""<p class="lead">Add a new user</p>
    """),_display_(/*6.6*/form(action=routes.HomeController.addUserSubmit(), 'class -> "form-horizontal", 'role -> "form")/*6.102*/ {_display_(Seq[Any](format.raw/*6.104*/("""
        """),format.raw/*7.37*/("""
        """),_display_(/*8.10*/CSRF/*8.14*/.formField),format.raw/*8.24*/("""

        """),_display_(/*10.10*/inputText(userForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*10.82*/("""
        """),_display_(/*11.10*/select(
            userForm("department.id"),
            options(Department.options),
            '_label -> "Department", '_default -> "-- Choose a department --",
            '_showConstraints -> false, 'class -> "form-control"
        )),format.raw/*16.10*/("""
        """),_display_(/*17.10*/inputText(userForm("role"), '_label -> "Role", 'class -> "form-control")),format.raw/*17.82*/("""
        """),_display_(/*18.10*/inputText(userForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*18.84*/("""
        

        """),_display_(/*21.10*/inputText(userForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*21.71*/("""

        """),format.raw/*23.9*/("""<div class="actions">
            <input type="submit" value="Add/Update user" class="btn btn-primary">
            <a href=""""),_display_(/*25.23*/routes/*25.29*/.HomeController.index(0)),format.raw/*25.53*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*29.6*/("""
""")))}))
      }
    }
  }

  def render(userForm:Form[models.users.User],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(userForm,user)

  def f:((Form[models.users.User],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (userForm,user) => apply(userForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 15 23:51:14 GMT 2019
                  SOURCE: /home/wdd/SDEV4lab/projectListDone/app/views/addUser.scala.html
                  HASH: 7b4090b226d2b19ffb17b2065b6e6feaff5e50b4
                  MATRIX: 985->1|1118->63|1163->61|1190->79|1217->81|1246->102|1285->104|1316->109|1381->149|1486->245|1526->247|1562->284|1598->294|1610->298|1640->308|1678->319|1771->391|1808->401|2070->642|2107->652|2200->724|2237->734|2332->808|2379->828|2461->889|2498->899|2651->1025|2666->1031|2711->1055|2859->1173
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|38->6|38->6|38->6|39->7|40->8|40->8|40->8|42->10|42->10|43->11|48->16|49->17|49->17|50->18|50->18|53->21|53->21|55->23|57->25|57->25|57->25|61->29
                  -- GENERATED --
              */
          