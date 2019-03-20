
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

object employee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.users.Employee],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employee: List[models.users.Employee], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.93*/("""

"""),_display_(/*3.2*/main("Employee",user)/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""

"""),format.raw/*5.1*/("""<p class="lead">Employee List</p>

"""),_display_(/*7.2*/if(flash.containsKey("success"))/*7.34*/ {_display_(Seq[Any](format.raw/*7.36*/("""
  """),format.raw/*8.3*/("""<div class="alert alert-success">
    """),_display_(/*9.6*/flash/*9.11*/.get("success")),format.raw/*9.26*/("""
  """),format.raw/*10.3*/("""</div>
""")))}),format.raw/*11.2*/("""

"""),format.raw/*13.1*/("""<table class="table table-bordered table-hover table-condensed">

  <thead>
    <tr>
      <th>Image</th>
      <th>Name</th>
      <th>Role</th>
      <th>Email</th>
      <th>Password</th>
      <th>Update</th>
      <th>Delete</th>    
    </tr>
  </thead>

  <tbody>
    """),_display_(/*28.6*/for(e<-employee) yield /*28.22*/ {_display_(Seq[Any](format.raw/*28.24*/("""
      """),format.raw/*29.7*/("""<tr>
        """),_display_(/*30.10*/if(env.resource("public/images/userImages/" + e.getEmail + "thumb.jpg").isDefined)/*30.92*/{_display_(Seq[Any](format.raw/*30.93*/("""
          """),format.raw/*31.11*/("""<td><img src="/assets/images/userImages/"""),_display_(/*31.52*/(e.getEmail +"thumb.jpg")),format.raw/*31.77*/(""""/></td>
        """)))}/*32.10*/else/*32.14*/{_display_(Seq[Any](format.raw/*32.15*/("""
          """),format.raw/*33.11*/("""<td><img src="/assets/images/userImages/noImage.png"></td>
        """)))}),format.raw/*34.10*/("""
        """),format.raw/*35.9*/("""<td>"""),_display_(/*35.14*/e/*35.15*/.getName),format.raw/*35.23*/("""</td>
        <td>"""),_display_(/*36.14*/e/*36.15*/.getRole),format.raw/*36.23*/("""</td>
        <td>"""),_display_(/*37.14*/e/*37.15*/.getEmail),format.raw/*37.24*/("""</td>
        <td>"""),_display_(/*38.14*/e/*38.15*/.getPassword),format.raw/*38.27*/("""</td>
        <td>
          <a href=""""),_display_(/*40.21*/routes/*40.27*/.HomeController.updateEmployee(e.getEmail)),format.raw/*40.69*/("""" class="button-xs btn-danger">
            <span class="glyphicon glyphicon-pencil"></span>
          </a>
        </td>  
        <td>
          <a href=""""),_display_(/*45.21*/routes/*45.27*/.HomeController.deleteEmployee(e.getEmail)),format.raw/*45.69*/("""" class="button-xs btn-danger"  onclick="return confirmDel()">
            <span class="glyphicon glyphicon-trash"></span>
          </a>
        </td>
      </tr>
    """)))}),format.raw/*50.6*/("""
  """),format.raw/*51.3*/("""</tbody>

</table>
<p>
  <a href=""""),_display_(/*55.13*/routes/*55.19*/.HomeController.addEmployee()),format.raw/*55.48*/("""">
    <button class="btn btn-primary">Add an employee</button>
  </a>
</p>

""")))}))
      }
    }
  }

  def render(employee:List[models.users.Employee],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(employee,user,env)

  def f:((List[models.users.Employee],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (employee,user,env) => apply(employee,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 15:12:22 GMT 2019
                  SOURCE: /home/wdd/BASE_CODE/projectListDone/app/views/employee.scala.html
                  HASH: ad85bd5b3f768c72b1f36cdfb15c6b2b175a502f
                  MATRIX: 1011->1|1197->92|1225->95|1254->116|1293->118|1321->120|1382->156|1422->188|1461->190|1490->193|1554->232|1567->237|1602->252|1632->255|1670->263|1699->265|2001->541|2033->557|2073->559|2107->566|2148->580|2239->662|2278->663|2317->674|2385->715|2431->740|2468->758|2481->762|2520->763|2559->774|2658->842|2694->851|2726->856|2736->857|2765->865|2811->884|2821->885|2850->893|2896->912|2906->913|2936->922|2982->941|2992->942|3025->954|3091->993|3106->999|3169->1041|3353->1198|3368->1204|3431->1246|3630->1415|3660->1418|3722->1453|3737->1459|3787->1488
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|45->13|60->28|60->28|60->28|61->29|62->30|62->30|62->30|63->31|63->31|63->31|64->32|64->32|64->32|65->33|66->34|67->35|67->35|67->35|67->35|68->36|68->36|68->36|69->37|69->37|69->37|70->38|70->38|70->38|72->40|72->40|72->40|77->45|77->45|77->45|82->50|83->51|87->55|87->55|87->55
                  -- GENERATED --
              */
          