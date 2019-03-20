
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

object admin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.users.Admin],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(admin: List[models.users.Admin], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.87*/("""

"""),_display_(/*3.2*/main("Admin",user)/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""

"""),format.raw/*5.1*/("""<p class="lead">Administrator List</p>

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
    """),_display_(/*28.6*/for(e<-admin) yield /*28.19*/ {_display_(Seq[Any](format.raw/*28.21*/("""
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
          <a href=""""),_display_(/*40.21*/routes/*40.27*/.HomeController.updateAdmin(e.getEmail)),format.raw/*40.66*/("""" class="button-xs btn-danger">
            <span class="glyphicon glyphicon-pencil"></span>
          </a>
        </td>  
        <td>
          <a href=""""),_display_(/*45.21*/routes/*45.27*/.HomeController.deleteAdmin(e.getEmail)),format.raw/*45.66*/("""" class="button-xs btn-danger"  onclick="return confirmDel()">
            <span class="glyphicon glyphicon-trash"></span>
          </a>
        </td>
      </tr>
    """)))}),format.raw/*50.6*/("""
  """),format.raw/*51.3*/("""</tbody>

</table>
<p>
  <a href=""""),_display_(/*55.13*/routes/*55.19*/.HomeController.addAdmin()),format.raw/*55.45*/("""">
    <button class="btn btn-primary">Add an admin</button>
  </a>
</p>

""")))}))
      }
    }
  }

  def render(admin:List[models.users.Admin],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(admin,user,env)

  def f:((List[models.users.Admin],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (admin,user,env) => apply(admin,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 15:12:22 GMT 2019
                  SOURCE: /home/wdd/BASE_CODE/projectListDone/app/views/admin.scala.html
                  HASH: 8fc4f9d36143268c31915a22c17aae0e11e6903d
                  MATRIX: 1005->1|1185->86|1213->89|1239->107|1278->109|1306->111|1372->152|1412->184|1451->186|1480->189|1544->228|1557->233|1592->248|1622->251|1660->259|1689->261|1992->538|2021->551|2061->553|2095->560|2136->574|2227->656|2266->657|2305->668|2373->709|2419->734|2456->752|2469->756|2508->757|2547->768|2646->836|2682->845|2714->850|2724->851|2753->859|2799->878|2809->879|2838->887|2884->906|2894->907|2924->916|2970->935|2980->936|3013->948|3079->987|3094->993|3154->1032|3338->1189|3353->1195|3413->1234|3612->1403|3642->1406|3704->1441|3719->1447|3766->1473
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|45->13|60->28|60->28|60->28|61->29|62->30|62->30|62->30|63->31|63->31|63->31|64->32|64->32|64->32|65->33|66->34|67->35|67->35|67->35|67->35|68->36|68->36|68->36|69->37|69->37|69->37|70->38|70->38|70->38|72->40|72->40|72->40|77->45|77->45|77->45|82->50|83->51|87->55|87->55|87->55
                  -- GENERATED --
              */
          