package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import editoronay.DB1;

public final class hakemmakalereddet_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<link href=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("    <script src=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("    <!------ Include the above in your HEAD tag ---------->\n");
      out.write("\n");
      out.write("    <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("              tr,td,th{\n");
      out.write("                background:#00FFFF;\n");
      out.write("                padding: 20px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navbar-inverse\n");
      out.write("            {\n");
      out.write("                background:#00796B;\n");
      out.write("                border-bottom-color: #004D40;\n");
      out.write("            }\n");
      out.write("            .navbar-inverse .navbar-nav>li>a,.navbar-inverse .navbar-brand,.navbar-inverse .navbar-nav>.dropdown>a .caret\n");
      out.write("            {\n");
      out.write("                color: #fff;\n");
      out.write("            }\n");
      out.write("            .navbar-inverse .navbar-nav>.open>a, .navbar-inverse .navbar-nav>.open>a:hover, .navbar-inverse .navbar-nav>.open>a:focus,\n");
      out.write("            .navbar-nav>li>.dropdown-menu\n");
      out.write("            {\n");
      out.write("                background:#4DB6AC;\n");
      out.write("            }\n");
      out.write("            .nav-pills>li>a,\n");
      out.write("            {\n");
      out.write("                color: #303F9F;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .nav>li>a:hover, .nav>li>a:focus\n");
      out.write("            {\n");
      out.write("                background-color: #EEEEEE;\n");
      out.write("            }\n");
      out.write("        </style>    \n");
      out.write("\n");
      out.write("        <title>HAKEM GİRİŞ SAYFASI</title>   \n");
      out.write("        <div id=\"top-nav\" class=\"navbar navbar-inverse navbar-static-top\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\"  href=\"#\">HAKEM</a>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <div class=\"navbar-collapse collapse\">\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"hakemlogin.jsp\"><i class=\"fa fa-sign-out\"></i> ÇIKIŞ </a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    \n");
      out.write("                       <p><font face=\"tahoma\" size=\"6\" color=\"white\">\n");
      out.write("                            <b>Editör Tarafından Onaylanan Makaleler</b></font></p>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- /container -->\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("         \n");
      out.write("        \n");
      out.write("        <!-- /Header -->\n");
      out.write("\n");
      out.write("        <!-- Main -->\n");
      out.write("\n");
      out.write("        <div class=\"col-lg-2 col-md-2 col-sm-3 col-xs-12\">\n");
      out.write("\n");
      out.write("            <ul class=\"nav nav-pills nav-stacked\" style=\"border-right:1px solid black\">\n");
      out.write("                <!--<li class=\"nav-header\"></li>-->\n");
      out.write("                <li><a href=\"hakemgiris.jsp\"><i class=\"glyphicon glyphicon-home\"></i><strong>ANASAYFA</strong></a></li>\n");
      out.write("                <li><a href=\"hakemmakaleonayla.jsp\"><i class=\"glyphicon glyphicon-ok\"></i><strong>EDİTÖRDEN GELEN MAKALEYİ ONAYLA</strong></a></li>\n");
      out.write("                <li><a href=\"hakemmakalereddet.jsp\"><i class=\"glyphicon glyphicon-ok\"></i><strong>EDİTÖRDEN GELEN MAKALEYİ REDDET</strong></a></li>\n");
      out.write("                <li><a href=\"yayınlanacakmakale.jsp\"><i class=\"glyphicon glyphicon-ok-sign\"></i><strong>YAYINLANACAK MAKALELER</strong></a></li>\n");
      out.write("                <li><a href=\"#\"><i class=\"glyphicon glyphicon-remove-sign\"></i><strong>REDDEDİLMİŞ MAKALELER </strong></a></li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </div><!-- /span-3 -->\n");
      out.write("        <div class=\"col-lg-10 col-md-10 col-sm-9 col-xs-12\">\n");
      out.write("            <!-- Right -->\n");
      out.write("\n");
      out.write("          \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <hr>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
