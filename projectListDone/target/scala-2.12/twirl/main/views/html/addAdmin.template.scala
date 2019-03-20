
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

object addAdmin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Admin],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[models.users.Admin],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.62*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add Admin",user)/*4.24*/ {_display_(Seq[Any](format.raw/*4.26*/("""
    """),format.raw/*5.5*/("""<p class="lead">Add a new admin</p>
    """),_display_(/*6.6*/form(action=routes.HomeController.addAdminSubmit(), 'class-> "form-horizontal",
         'role -> "form", 'method -> "POST", 'enctype -> "multipart/form-data")/*7.80*/ {_display_(Seq[Any](format.raw/*7.82*/("""
        """),_display_(/*8.10*/CSRF/*8.14*/.formField),format.raw/*8.24*/("""

        """),_display_(/*10.10*/inputText(userForm("name"), '_label -> "Name", 'class -> "form_control")),format.raw/*10.82*/("""
        """),_display_(/*11.10*/inputText(userForm("email"), '_label -> "E-mail", 'class -> "form_control")),format.raw/*11.85*/("""
        """),_display_(/*12.10*/inputText(userForm("password"), '_label -> "Password", 'class -> "form_control")),format.raw/*12.90*/("""

        """),_display_(/*14.10*/inputText(userForm("role").copy(value=Some("admin")), '_label -> "", 'hidden -> "hidden")),format.raw/*14.99*/("""
        
        """),format.raw/*16.9*/("""<label>Image Upload</label>
        <input class="btn-sm btn-default" type="file" name="upload">

        <div class="actions">
            <input type="submit" value="Add/Update Admin" class="btn btn-primary">
            <a href=""""),_display_(/*21.23*/routes/*21.29*/.HomeController.admin),format.raw/*21.50*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
        """)))}),format.raw/*25.10*/("""
""")))}))
      }
    }
  }

  def render(userForm:Form[models.users.Admin],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(userForm,user)

  def f:((Form[models.users.Admin],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (userForm,user) => apply(userForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 15:12:22 GMT 2019
                  SOURCE: /home/wdd/BASE_CODE/projectListDone/app/views/addAdmin.scala.html
                  HASH: acb23b4d8b64b5e96e736b72e0dd0981b1ff2958
                  MATRIX: 987->1|1120->63|1165->61|1192->79|1219->81|1249->103|1288->105|1319->110|1385->151|1552->310|1591->312|1627->322|1639->326|1669->336|1707->347|1800->419|1837->429|1933->504|1970->514|2071->594|2109->605|2219->694|2264->712|2524->945|2539->951|2581->972|2734->1094
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|38->6|39->7|39->7|40->8|40->8|40->8|42->10|42->10|43->11|43->11|44->12|44->12|46->14|46->14|48->16|53->21|53->21|53->21|57->25
                  -- GENERATED --
              */
          