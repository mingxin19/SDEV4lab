
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User )(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">

<head>
        <link rel="icon" type="image/png" href=""""),_display_(/*8.50*/routes/*8.56*/.Assets.versioned("images/favicon.png")),format.raw/*8.95*/("""">
    <meta charset="utf-8">
    <title>Fishbone - """),_display_(/*10.24*/title),format.raw/*10.29*/("""</title>
    <!-- Bootstrap Core CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />
    <!-- Custom CSS -->
    <link href=""""),_display_(/*14.18*/routes/*14.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.65*/("""" rel="stylesheet" />
</head>

<body>

    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href=""""),_display_(/*22.48*/routes/*22.54*/.HomeController.index()),format.raw/*22.77*/("""">Fishbone</a>
            </div>

            <ul class="nav navbar-nav">

                <li """),_display_(/*27.22*/if(title=="Projects" )/*27.44*/{_display_(Seq[Any](format.raw/*27.45*/("""class="active"""")))}),format.raw/*27.60*/(""">
                    <a href=""""),_display_(/*28.31*/routes/*28.37*/.HomeController.index()),format.raw/*28.60*/("""">Projects</a>
                </li>

                """),_display_(/*31.18*/if(user != null)/*31.34*/{_display_(Seq[Any](format.raw/*31.35*/("""
                """),format.raw/*32.17*/("""<li """),_display_(/*32.22*/if(title=="My Profile" )/*32.46*/{_display_(Seq[Any](format.raw/*32.47*/("""class="active"""")))}),format.raw/*32.62*/(""">
                    <a href=""""),_display_(/*33.31*/routes/*33.37*/.HomeController.profile()),format.raw/*33.62*/("""">My Profile</a>
                </li>
                """)))}),format.raw/*35.18*/("""

                """),_display_(/*37.18*/if((user != null) && ("admin".equals(user.getRole())))/*37.72*/{_display_(Seq[Any](format.raw/*37.73*/("""
                    """),format.raw/*38.21*/("""<div class="dropdown">
                        <button class="dropbtn">User</button>
                        <div class="dropdown-content">
                            <li """),_display_(/*41.34*/if(title=="Admin" )/*41.53*/{_display_(Seq[Any](format.raw/*41.54*/("""class="active"""")))}),format.raw/*41.69*/(""">
                                <a href=""""),_display_(/*42.43*/routes/*42.49*/.HomeController.admin()),format.raw/*42.72*/("""">Admin</a>
                            </li>
                            <li """),_display_(/*44.34*/if(title=="Manager" )/*44.55*/{_display_(Seq[Any](format.raw/*44.56*/("""class="active"""")))}),format.raw/*44.71*/(""">
                                <a href=""""),_display_(/*45.43*/routes/*45.49*/.HomeController.manager()),format.raw/*45.74*/("""">Manager</a>
                            </li>
                            <li """),_display_(/*47.34*/if(title=="Employee" )/*47.56*/{_display_(Seq[Any](format.raw/*47.57*/("""class="active"""")))}),format.raw/*47.72*/(""">
                                    <a href=""""),_display_(/*48.47*/routes/*48.53*/.HomeController.employee()),format.raw/*48.79*/("""">Employee</a>
                            </li>
                        </div>
                      </div>
                    <!-- <li """),_display_(/*52.31*/if(title=="Admin" )/*52.50*/{_display_(Seq[Any](format.raw/*52.51*/("""class="active"""")))}),format.raw/*52.66*/(""">
                        <a href=""""),_display_(/*53.35*/routes/*53.41*/.HomeController.admin()),format.raw/*53.64*/("""">Admin</a>
                    </li>
                    <li """),_display_(/*55.26*/if(title=="Manager" )/*55.47*/{_display_(Seq[Any](format.raw/*55.48*/("""class="active"""")))}),format.raw/*55.63*/(""">
                        <a href=""""),_display_(/*56.35*/routes/*56.41*/.HomeController.manager()),format.raw/*56.66*/("""">Manager</a>
                    </li>
                    <li """),_display_(/*58.26*/if(title=="Employee" )/*58.48*/{_display_(Seq[Any](format.raw/*58.49*/("""class="active"""")))}),format.raw/*58.64*/(""">
                            <a href=""""),_display_(/*59.39*/routes/*59.45*/.HomeController.employee()),format.raw/*59.71*/("""">Employee</a>
                    </li> -->
                """)))}),format.raw/*61.18*/("""
                
                
                """),format.raw/*64.17*/("""<li """),_display_(/*64.22*/if(title=="Login")/*64.40*/{_display_(Seq[Any](format.raw/*64.41*/("""class="active"""")))}),format.raw/*64.56*/(""">
                    """),_display_(/*65.22*/if(user != null)/*65.38*/ {_display_(Seq[Any](format.raw/*65.40*/("""
                        """),format.raw/*66.25*/("""<a href=""""),_display_(/*66.35*/routes/*66.41*/.LoginController.logout()),format.raw/*66.66*/("""">Logout """),_display_(/*66.76*/user/*66.80*/.getName()),format.raw/*66.90*/("""</a>
                    """)))}/*67.23*/else/*67.28*/{_display_(Seq[Any](format.raw/*67.29*/("""
                        """),format.raw/*68.25*/("""<a href=""""),_display_(/*68.35*/routes/*68.41*/.LoginController.login()),format.raw/*68.65*/("""">Login</a>
                    """)))}),format.raw/*69.22*/("""

                """),format.raw/*71.17*/("""</li>
            
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*82.18*/content),format.raw/*82.25*/("""
            """),format.raw/*83.13*/("""</div>
        </row>
    </container>
<br>
    <container>
        <footer>
        <row>
            <div class="col-md-12">
                Copyright
                <strong>Fishbone</strong>
            </div>
        </row>
    </footer>
    </container>
    <script src=""""),_display_(/*97.19*/routes/*97.25*/.Assets.versioned("javascripts/main.js")),format.raw/*97.65*/(""""></script>
</body>

</html>
"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 15:12:22 GMT 2019
                  SOURCE: /home/wdd/BASE_CODE/projectListDone/app/views/main.scala.html
                  HASH: 63d7a4a8ee87c7f4550e025173f20e8d6c645205
                  MATRIX: 970->1|1121->57|1149->59|1266->150|1280->156|1339->195|1419->248|1445->253|1657->438|1672->444|1734->485|1965->689|1980->695|2024->718|2148->815|2179->837|2218->838|2264->853|2323->885|2338->891|2382->914|2464->969|2489->985|2528->986|2573->1003|2605->1008|2638->1032|2677->1033|2723->1048|2782->1080|2797->1086|2843->1111|2930->1167|2976->1186|3039->1240|3078->1241|3127->1262|3327->1435|3355->1454|3394->1455|3440->1470|3511->1514|3526->1520|3570->1543|3676->1622|3706->1643|3745->1644|3791->1659|3862->1703|3877->1709|3923->1734|4031->1815|4062->1837|4101->1838|4147->1853|4222->1901|4237->1907|4284->1933|4450->2072|4478->2091|4517->2092|4563->2107|4626->2143|4641->2149|4685->2172|4775->2235|4805->2256|4844->2257|4890->2272|4953->2308|4968->2314|5014->2339|5106->2404|5137->2426|5176->2427|5222->2442|5289->2482|5304->2488|5351->2514|5444->2576|5523->2627|5555->2632|5582->2650|5621->2651|5667->2666|5717->2689|5742->2705|5782->2707|5835->2732|5872->2742|5887->2748|5933->2773|5970->2783|5983->2787|6014->2797|6059->2824|6072->2829|6111->2830|6164->2855|6201->2865|6216->2871|6261->2895|6325->2928|6371->2946|6547->3095|6575->3102|6616->3115|6921->3393|6936->3399|6997->3439
                  LINES: 28->1|33->1|35->3|40->8|40->8|40->8|42->10|42->10|46->14|46->14|46->14|54->22|54->22|54->22|59->27|59->27|59->27|59->27|60->28|60->28|60->28|63->31|63->31|63->31|64->32|64->32|64->32|64->32|64->32|65->33|65->33|65->33|67->35|69->37|69->37|69->37|70->38|73->41|73->41|73->41|73->41|74->42|74->42|74->42|76->44|76->44|76->44|76->44|77->45|77->45|77->45|79->47|79->47|79->47|79->47|80->48|80->48|80->48|84->52|84->52|84->52|84->52|85->53|85->53|85->53|87->55|87->55|87->55|87->55|88->56|88->56|88->56|90->58|90->58|90->58|90->58|91->59|91->59|91->59|93->61|96->64|96->64|96->64|96->64|96->64|97->65|97->65|97->65|98->66|98->66|98->66|98->66|98->66|98->66|98->66|99->67|99->67|99->67|100->68|100->68|100->68|100->68|101->69|103->71|114->82|114->82|115->83|129->97|129->97|129->97
                  -- GENERATED --
              */
          