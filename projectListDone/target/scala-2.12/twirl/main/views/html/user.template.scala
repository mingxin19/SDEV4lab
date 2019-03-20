
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

object user extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.users.User],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userList: List[models.users.User], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.62*/("""
"""),_display_(/*2.2*/main("User",user)/*2.19*/ {_display_(Seq[Any](format.raw/*2.21*/("""

"""),format.raw/*4.1*/("""<p class="lead">User Catalogue</p>
    """),_display_(/*5.6*/if(flash.containsKey("success"))/*5.38*/ {_display_(Seq[Any](format.raw/*5.40*/("""
      """),format.raw/*6.7*/("""<div class="alert alert-success">
      """),_display_(/*7.8*/flash/*7.13*/.get("success")),format.raw/*7.28*/("""
    """),format.raw/*8.5*/("""</div>
    """)))}),format.raw/*9.6*/("""
  
    """),format.raw/*11.5*/("""<table class="table table-bordered table-hover table-condensed">
     
      <thead>
        <tr>
          
          <th>Name</th>
          <th>Role</th>
          <th>Email</th>
          
          <th colspan="2"></th>      
        </tr>
      </thead>

      <tbody>
        """),_display_(/*25.10*/for(p<-userList) yield /*25.26*/ {_display_(Seq[Any](format.raw/*25.28*/("""
          """),format.raw/*26.11*/("""<tr>
            
            <td>"""),_display_(/*28.18*/p/*28.19*/.getName),format.raw/*28.27*/("""</td>
            <td>"""),_display_(/*29.18*/p/*29.19*/.getRole),format.raw/*29.27*/("""</td>      
            <td>"""),_display_(/*30.18*/p/*30.19*/.getEmail),format.raw/*30.28*/("""</td>
            
          
            <td>
                <a href=""""),_display_(/*34.27*/routes/*34.33*/.HomeController.updateUser(p.getEmail)),format.raw/*34.71*/("""" class="button xs btn-danger">
                  <span class="glyphicon glyphicon-pencil"></span>
                </a>
              </td>        <td>
                <a href=""""),_display_(/*38.27*/routes/*38.33*/.HomeController.deleteUser(p.getEmail)),format.raw/*38.71*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                  <span class="glyphicon glyphicon-trash"></span>
                </a>
              </td>
          
            
          </tr>
        """)))}),format.raw/*45.10*/("""
      """),format.raw/*46.7*/("""</tbody>

    </table>
    
    <p>
      <a href=""""),_display_(/*51.17*/routes/*51.23*/.HomeController.addUser()),format.raw/*51.48*/("""">
        <button class="btn btn-primary">Add an user</button>
      </a>
    </p>
  
  

""")))}),format.raw/*58.2*/("""
"""))
      }
    }
  }

  def render(userList:List[models.users.User],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(userList,user)

  def f:((List[models.users.User],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (userList,user) => apply(userList,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 15 23:51:14 GMT 2019
                  SOURCE: /home/wdd/SDEV4lab/projectListDone/app/views/user.scala.html
                  HASH: 22aeb86f8a14fe34a0920e1a0e640449b2d50def
                  MATRIX: 982->1|1137->61|1164->63|1189->80|1228->82|1256->84|1321->124|1361->156|1400->158|1433->165|1499->206|1512->211|1547->226|1578->231|1619->243|1654->251|1965->535|1997->551|2037->553|2076->564|2138->599|2148->600|2177->608|2227->631|2237->632|2266->640|2322->669|2332->670|2362->679|2462->752|2477->758|2536->796|2741->974|2756->980|2815->1018|3065->1237|3099->1244|3178->1296|3193->1302|3239->1327|3361->1419
                  LINES: 28->1|33->1|34->2|34->2|34->2|36->4|37->5|37->5|37->5|38->6|39->7|39->7|39->7|40->8|41->9|43->11|57->25|57->25|57->25|58->26|60->28|60->28|60->28|61->29|61->29|61->29|62->30|62->30|62->30|66->34|66->34|66->34|70->38|70->38|70->38|77->45|78->46|83->51|83->51|83->51|90->58
                  -- GENERATED --
              */
          