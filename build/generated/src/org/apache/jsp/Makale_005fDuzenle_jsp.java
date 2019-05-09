package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Makale_005fDuzenle_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>YAZAR-MAKALE-GÖNDERME</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- styles -->\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: url('images/arkaplan.jpg')\">\n");
      out.write("       <div class=\"header\">\n");
      out.write("\t     <div class=\"container\">\n");
      out.write("\t        <div class=\"row\">\n");
      out.write("\t           <div class=\"col-md-5\">\n");
      out.write("\t              <!-- Logo -->\n");
      out.write("\t              <div class=\"logo\">\n");
      out.write("\t                 <h1><a href=\"index.jsp\">YAZAR SAYFASI</a></h1>\n");
      out.write("\t              </div>\n");
      out.write("\t           </div>\n");
      out.write("\t           <div class=\"col-md-5\">\n");
      out.write("\t              <div class=\"row\">\n");
      out.write("\t                <div class=\"col-lg-12\">\n");
      out.write("\t                  <div class=\"input-group form\">\n");
      out.write("\t                       <input type=\"text\" class=\"form-control\" placeholder=\"Search...\">\n");
      out.write("\t                       <span class=\"input-group-btn\">\n");
      out.write("\t                         <button class=\"btn btn-primary\" type=\"button\">Search</button>\n");
      out.write("\t                       </span>\n");
      out.write("\t                  </div>\n");
      out.write("\t                </div>\n");
      out.write("\t              </div>\n");
      out.write("\t           </div>\n");
      out.write("\t           <div class=\"col-md-2\">\n");
      out.write("\t              <div class=\"navbar navbar-inverse\" role=\"banner\">\n");
      out.write("\t                  <nav class=\"collapse navbar-collapse bs-navbar-collapse navbar-right\" role=\"navigation\">\n");
      out.write("\t                    <ul class=\"nav navbar-nav\">\n");
      out.write("\t                      <li class=\"dropdown\">\n");
      out.write("\t                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Hesabım <b class=\"caret\"></b></a>\n");
      out.write("\t                        <ul class=\"dropdown-menu animated fadeInUp\">\n");
      out.write("\t                          <li><a href=\"profile.html\">Profilim</a></li>\n");
      out.write("                                  <form method=\"POST\" action=\"logout\">\n");
      out.write("                                      <li><a href=\"Login_Secim.jsp\">Çıkış</a></li>\n");
      out.write("                                  </form>\n");
      out.write("\t                        </ul>\n");
      out.write("\t                      </li>\n");
      out.write("\t                    </ul>\n");
      out.write("\t                  </nav>\n");
      out.write("\t              </div>\n");
      out.write("\t           </div>\n");
      out.write("\t        </div>\n");
      out.write("\t     </div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("        <div class=\"page-content\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-2\">\n");
      out.write("                    <div class=\"sidebar content-box\" style=\"display: block;\">\n");
      out.write("                        <ul class=\"nav\">\n");
      out.write("                            <!-- Main menu -->\n");
      out.write("                            <li ><a href=\"Makale_Gonder.jsp\"><i class=\"glyphicon glyphicon-home\"></i>AnaSayfa</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <li class=\"current\"><a href=\"Makale_Duzenle.jsp\"><i class=\"glyphicon glyphicon-list\"></i> Makalelerim</a></li>\n");
      out.write("\n");
      out.write("                            <li><a href=\"Makale_Goster.jsp\"><i class=\"glyphicon glyphicon-pencil\"></i>Makale Düzenle</a></li>\n");
      out.write("\n");
      out.write("                            <li class=\"submenu\">\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <i class=\"glyphicon glyphicon-list\"></i> Sayfaya git\n");
      out.write("                                    <span class=\"caret pull-right\"></span>\n");
      out.write("                                </a>\n");
      out.write("                                <!-- Sub menu -->\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"login.jsp\">Giriş</a></li>\n");
      out.write("                                    <li><a href=\"signup.html\">Üye Ol</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"container row\"style=\"width:700px; height: 350px;  margin:0px auto; background-image: url('images/arama.png')\">\n");
      out.write("                    \n");
      out.write("               \n");
      out.write("                <form class=\"form-group\"id=\"Makale_ara_sql_kodu\" name=\"Makale_ara_sql_kodu\"\n");
      out.write("          \n");
      out.write("                      method=\"post\" action=\"Makale_ara_sonuc.jsp\" style=\"padding-top: 350px; padding-right: 0px; padding-left: 150px; width: 300px\">\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    \n");
      out.write("    <input type=\"text\" class=\"form-control\" id=\"Makale_Adi\" name=\"Makale_Adi\" placeholder=\"Makale Adı\" style=\"width: 300px\">\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\" name=\"onayla\" id=\"onayla\" value=\"Onayla\" style=\"width: 300px\">Ara</button>\n");
      out.write("</form>\n");
      out.write("                    \n");
      out.write("                        <div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("      <footer style=\"position: relative; bottom: -215px;\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("                <div class=\"copy text-center\">\n");
      out.write("                    Copyright 2014 <a href='#'>Website</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery.js\"></script>\n");
      out.write("        <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("        <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/custom.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
