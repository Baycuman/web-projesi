package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import hakemred.DB4;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class yazarredmakale1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


                            Connection con = null;
                            PreparedStatement ps = null;
                            ResultSet rs = null;
                        
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            tr,td,th{\n");
      out.write("                background:green;\n");
      out.write("                padding: 20px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    <title>YAZAR SAYFASI</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- styles -->\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("            <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("            <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("            <!--[if lt IE 9]>\n");
      out.write("              <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("              <script src=\"https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js\"></script>\n");
      out.write("            <![endif]-->\n");
      out.write("\n");
      out.write("            </head>\n");
      out.write("\n");
      out.write("            <body background=\"https://i.pinimg.com/originals/03/a7/d0/03a7d08d24c8bc925c70604c6310cd3c.jpg\">\n");
      out.write("            <div class=\"header\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-5\">\n");
      out.write("                            <!-- Logo -->\n");
      out.write("                            <div class=\"logo\">\n");
      out.write("                                <h1><a href=\"index.jsp\">YAZAR GİRİŞ SAYFASI</a></h1>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-5\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-2\">\n");
      out.write("                            <div class=\"navbar navbar-inverse\" role=\"banner\">\n");
      out.write("                                <nav class=\"collapse navbar-collapse bs-navbar-collapse navbar-right\" role=\"navigation\">\n");
      out.write("                                    <ul class=\"nav navbar-nav\">\n");
      out.write("                                        <li class=\"dropdown\">\n");
      out.write("                                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Hesabım <b class=\"caret\"></b></a>\n");
      out.write("                                            <ul class=\"dropdown-menu animated fadeInUp\">\n");
      out.write("\n");
      out.write("                                                <form method=\"POST\" action=\"logout\">\n");
      out.write("                                                    <li><a href=\"login.jsp\">Çıkış</a></li>\n");
      out.write("                                                </form>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </nav>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"page-content\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-2\">\n");
      out.write("                        <div class=\"sidebar content-box\" style=\"display: block;\">\n");
      out.write("                            <ul class=\"nav\">\n");
      out.write("                                <!-- Main menu -->\n");
      out.write("\n");
      out.write("                                <li class=\"current\"><a href=\"index.jsp\"><i class=\"glyphicon glyphicon-home\"></i> ANASAYFA</a></li>\n");
      out.write("                                <li><a href=\"yazaronaymakale.jsp\"><i class=\"glyphicon glyphicon-ok\"></i>ONAYLANAN MAKALELERİM</a></li>\n");
      out.write("                                <li><a href=\"yazarredmakale.jsp\"><i class=\"glyphicon glyphicon-remove\"></i>EDİTÖR TARAFINDAN REDDEDİLEN MAKALELERİM</a></li>\n");
      out.write("                                <li><a href=\"yazarredmakale1.jsp\"><i class=\"glyphicon glyphicon-remove\"></i>HAKEM TARAFINDAN REDDEDİLEN MAKALELERİM</a></li>\n");
      out.write("                                <li><a href=\"Upload.jsp\"><i class=\" glyphicon glyphicon-upload\"></i>MAKALE YÜKLE</a></li>                  \n");
      out.write("\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-10\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <center>\n");
      out.write("                        ");
      out.write("\n");
      out.write("\n");
      out.write("                        <h1 style=\"color:white\"><strong>YÜKLEDİĞİM MAKALELER<strong></h1>\n");
      out.write("\n");
      out.write("                                    <table border=\"2\">\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>ID</th><th>AD</th><th>SOYAD</th><th>DOSYA ADI</th><th>DOSYA YOLU</th><th>EKLENME TARİHİ</th><th>İNDİR</th>\n");
      out.write("                                        </tr>\n");
      out.write("\n");
      out.write("                                        ");

                                            con = DB4.getConnection();
                                            String sql = "select * from hakemred";
                                            ps = con.prepareStatement(sql);
                                            rs = ps.executeQuery();
                                            while (rs.next()) {
                                        
      out.write("\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>");
      out.print(rs.getInt(1));
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(rs.getTimestamp(6));
      out.write("</td>\n");
      out.write("                                            <td ><a href=\"DownloadServlet4?fileName=");
      out.print(rs.getString(4));
      out.write("\">Download</a></td>\n");
      out.write("\n");
      out.write("                                        </tr>\n");
      out.write("                                        ");

                                            }
                                        
      out.write("\n");
      out.write("\n");
      out.write("                                    </table><br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </center>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("                                    <script src=\"https://code.jquery.com/jquery.js\"></script>\n");
      out.write("                                    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("                                    <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("                                    <script src=\"js/custom.js\"></script>\n");
      out.write("                                    </body>\n");
      out.write("                                    </html>");
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
