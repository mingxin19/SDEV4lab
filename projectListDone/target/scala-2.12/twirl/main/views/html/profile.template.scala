
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

object profile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[models.users.Employee,models.users.User,models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employee: models.users.Employee,userEmail: models.users.User, user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.116*/("""

"""),_display_(/*3.2*/main("My Profile",user)/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""

"""),format.raw/*5.1*/("""<p class="lead">
  """),_display_(/*6.4*/if(user.getRole.equals("admin"))/*6.36*/{_display_(Seq[Any](format.raw/*6.37*/("""Administrator""")))}),format.raw/*6.51*/("""
  """),_display_(/*7.4*/if(user.getRole.equals("manager"))/*7.38*/{_display_(Seq[Any](format.raw/*7.39*/("""Manager""")))}),format.raw/*7.47*/("""
  """),_display_(/*8.4*/if(user.getRole.equals("employee"))/*8.39*/{_display_(Seq[Any](format.raw/*8.40*/("""Employee""")))}),format.raw/*8.49*/("""
"""),format.raw/*9.1*/("""</p>

"""),_display_(/*11.2*/if(flash.containsKey("success"))/*11.34*/ {_display_(Seq[Any](format.raw/*11.36*/("""
  """),format.raw/*12.3*/("""<div class="alert alert-success">
    """),_display_(/*13.6*/flash/*13.11*/.get("success")),format.raw/*13.26*/("""
  """),format.raw/*14.3*/("""</div>
""")))}),format.raw/*15.2*/("""



"""),format.raw/*19.1*/("""<div class="row">
  
  <div class="col-sm-3">
    """),_display_(/*22.6*/if(env.resource("public/images/userImages/" + user.getEmail + "thumb.jpg").isDefined)/*22.91*/{_display_(Seq[Any](format.raw/*22.92*/("""
      """),format.raw/*23.7*/("""<td><img src="/assets/images/userImages/"""),_display_(/*23.48*/(user.getEmail +"thumb.jpg")),format.raw/*23.76*/(""""/></td>
    """)))}/*24.6*/else/*24.10*/{_display_(Seq[Any](format.raw/*24.11*/("""
      """),format.raw/*25.7*/("""<td><img src="/assets/images/userImages/noImage.png"></td>
    """)))}),format.raw/*26.6*/("""

  """),format.raw/*28.3*/("""</div>
  
</div>


<div class="row"> 
    <div class="col-sm-4">
        <h3>Name: </h3>
        <h3>"""),_display_(/*36.14*/user/*36.18*/.getName),format.raw/*36.26*/("""</h3>
    </div>
  <div class= "col-sm-4">
    <h3>Email: </h3>
    <h3>"""),_display_(/*40.10*/user/*40.14*/.getEmail),format.raw/*40.23*/("""</h3>
  </div>
  """),_display_(/*42.4*/if(user.getRole.equals("employee"))/*42.39*/{_display_(Seq[Any](format.raw/*42.40*/("""
    """),format.raw/*43.5*/("""<div class= "col-sm-4">
        <h3>Department: </h3>
        <h3>"""),_display_(/*45.14*/employee/*45.22*/.getDepartment.getName),format.raw/*45.44*/("""</h3>
      </div>
  """)))}),format.raw/*47.4*/("""
 
"""),format.raw/*49.1*/("""</div>    




""")))}),format.raw/*54.2*/("""


"""))
      }
    }
  }

  def render(employee:models.users.Employee,userEmail:models.users.User,user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(employee,userEmail,user,env)

  def f:((models.users.Employee,models.users.User,models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (employee,userEmail,user,env) => apply(employee,userEmail,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 15:12:22 GMT 2019
                  SOURCE: /home/wdd/BASE_CODE/projectListDone/app/views/profile.scala.html
                  HASH: fdea20118a616bab07e7a548b69a5c4c0bc8ff96
                  MATRIX: 1022->1|1232->115|1260->118|1291->141|1330->143|1358->145|1403->165|1443->197|1481->198|1525->212|1554->216|1596->250|1634->251|1672->259|1701->263|1744->298|1782->299|1821->308|1848->309|1881->316|1922->348|1962->350|1992->353|2057->392|2071->397|2107->412|2137->415|2175->423|2206->427|2283->478|2377->563|2416->564|2450->571|2518->612|2567->640|2599->654|2612->658|2651->659|2685->666|2779->730|2810->734|2939->836|2952->840|2981->848|3081->921|3094->925|3124->934|3168->952|3212->987|3251->988|3283->993|3377->1060|3394->1068|3437->1090|3489->1112|3519->1115|3565->1131
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|38->6|38->6|38->6|38->6|39->7|39->7|39->7|39->7|40->8|40->8|40->8|40->8|41->9|43->11|43->11|43->11|44->12|45->13|45->13|45->13|46->14|47->15|51->19|54->22|54->22|54->22|55->23|55->23|55->23|56->24|56->24|56->24|57->25|58->26|60->28|68->36|68->36|68->36|72->40|72->40|72->40|74->42|74->42|74->42|75->43|77->45|77->45|77->45|79->47|81->49|86->54
                  -- GENERATED --
              */
          