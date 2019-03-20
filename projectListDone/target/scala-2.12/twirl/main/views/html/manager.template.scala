
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

object manager extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.users.Manager],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(manager: List[models.users.Manager], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.91*/("""

"""),_display_(/*3.2*/main("Manager",user)/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""

"""),format.raw/*5.1*/("""<p class="lead">Manager List</p>

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
    """),_display_(/*28.6*/for(e<-manager) yield /*28.21*/ {_display_(Seq[Any](format.raw/*28.23*/("""
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
          <a href=""""),_display_(/*40.21*/routes/*40.27*/.HomeController.updateManager(e.getEmail)),format.raw/*40.68*/("""" class="button-xs btn-danger">
            <span class="glyphicon glyphicon-pencil"></span>
          </a>
        </td>  
        <td>
          <a href=""""),_display_(/*45.21*/routes/*45.27*/.HomeController.deleteManager(e.getEmail)),format.raw/*45.68*/("""" class="button-xs btn-danger"  onclick="return confirmDel()">
            <span class="glyphicon glyphicon-trash"></span>
          </a>
        </td>
      </tr>
    """)))}),format.raw/*50.6*/("""
  """),format.raw/*51.3*/("""</tbody>

</table>
<p>
  <a href=""""),_display_(/*55.13*/routes/*55.19*/.HomeController.addManager()),format.raw/*55.47*/("""">
    <button class="btn btn-primary">Add a manager</button>
  </a>
</p>

""")))}))
      }
    }
  }

  def render(manager:List[models.users.Manager],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(manager,user,env)

  def f:((List[models.users.Manager],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (manager,user,env) => apply(manager,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 15:12:22 GMT 2019
                  SOURCE: /home/wdd/BASE_CODE/projectListDone/app/views/manager.scala.html
                  HASH: 977338bcea6a99e5bfef5247d5beff885cbd57fd
                  MATRIX: 1009->1|1193->90|1221->93|1249->113|1288->115|1316->117|1376->152|1416->184|1455->186|1484->189|1548->228|1561->233|1596->248|1626->251|1664->259|1693->261|1996->538|2027->553|2067->555|2101->562|2142->576|2233->658|2272->659|2311->670|2379->711|2425->736|2462->754|2475->758|2514->759|2553->770|2652->838|2688->847|2720->852|2730->853|2759->861|2805->880|2815->881|2844->889|2890->908|2900->909|2930->918|2976->937|2986->938|3019->950|3085->989|3100->995|3162->1036|3346->1193|3361->1199|3423->1240|3622->1409|3652->1412|3714->1447|3729->1453|3778->1481
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|45->13|60->28|60->28|60->28|61->29|62->30|62->30|62->30|63->31|63->31|63->31|64->32|64->32|64->32|65->33|66->34|67->35|67->35|67->35|67->35|68->36|68->36|68->36|69->37|69->37|69->37|70->38|70->38|70->38|72->40|72->40|72->40|77->45|77->45|77->45|82->50|83->51|87->55|87->55|87->55
                  -- GENERATED --
              */
          