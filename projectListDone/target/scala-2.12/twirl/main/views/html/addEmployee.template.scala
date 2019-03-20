
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

object addEmployee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Employee],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[models.users.Employee],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.65*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add Employee",user)/*4.27*/ {_display_(Seq[Any](format.raw/*4.29*/("""
    """),format.raw/*5.5*/("""<p class="lead">Add a new employee</p>
    """),_display_(/*6.6*/form(action=routes.HomeController.addEmployeeSubmit(), 'class-> "form-horizontal",
         'role -> "form", 'method -> "POST", 'enctype -> "multipart/form-data")/*7.80*/ {_display_(Seq[Any](format.raw/*7.82*/("""
        """),_display_(/*8.10*/CSRF/*8.14*/.formField),format.raw/*8.24*/("""

        """),_display_(/*10.10*/inputText(userForm("name"), '_label -> "Name", 'class -> "form_control")),format.raw/*10.82*/("""
        """),_display_(/*11.10*/inputText(userForm("email"), '_label -> "E-mail", 'class -> "form_control")),format.raw/*11.85*/("""
        """),_display_(/*12.10*/inputText(userForm("password"), '_label -> "Password", 'class -> "form_control")),format.raw/*12.90*/("""

        """),_display_(/*14.10*/inputText(userForm("role").copy(value=Some("employee")), '_label -> "", 'hidden -> "hidden")),format.raw/*14.102*/("""

        """),format.raw/*16.9*/("""<label>Image Upload</label>
        <input class="btn-sm btn-default" type="file" name="upload">

        <div class="actions">
            <input type="submit" value="Add/Update Employee" class="btn btn-primary">
            <a href=""""),_display_(/*21.23*/routes/*21.29*/.HomeController.employee),format.raw/*21.53*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
        """)))}),format.raw/*25.10*/("""
""")))}))
      }
    }
  }

  def render(userForm:Form[models.users.Employee],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(userForm,user)

  def f:((Form[models.users.Employee],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (userForm,user) => apply(userForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 15:12:22 GMT 2019
                  SOURCE: /home/wdd/BASE_CODE/projectListDone/app/views/addEmployee.scala.html
                  HASH: 7b4db13cce4dff7afbd78b45017f6e55b3a3f5d5
                  MATRIX: 993->1|1129->66|1174->64|1201->82|1228->84|1261->109|1300->111|1331->116|1400->160|1570->322|1609->324|1645->334|1657->338|1687->348|1725->359|1818->431|1855->441|1951->516|1988->526|2089->606|2127->617|2241->709|2278->719|2541->955|2556->961|2601->985|2754->1107
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|38->6|39->7|39->7|40->8|40->8|40->8|42->10|42->10|43->11|43->11|44->12|44->12|46->14|46->14|48->16|53->21|53->21|53->21|57->25
                  -- GENERATED --
              */
          