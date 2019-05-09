package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginanasayfa_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <title>ANASAYFA</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">Akademik Dergi Yönetim Sistemi</a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                <ul class=\"navbar-nav mr-auto\">\n");
      out.write("            </div>\n");
      out.write("            <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("                <a href=\"register_page.jsp\"  <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"button\">KAYIT OL</button></a>\n");
      out.write("            </form>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("    <div class=\"card-group\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("            <img class=\"card-img-top\" src=\"http://kmit.in/emagazine/wp-content/uploads/2015/04/editor.gif\" alt=\"Card image cap\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h5 class=\"card-title\"><strong>YAZAR</strong></h5>\n");
      out.write("                    <p class=\"card-text\"><font color=\"blue\" size=\"4\">Yazar olarak makalenizi sisteme yükleyebilir , yayınlanıp yayınlanmayacağını görebilirsiniz.</font></p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-footer\">\n");
      out.write("                    <a href=\"login.jsp\"   <button type=\"button\" class=\"btn btn-primary\">Yazar Girişi</button> </a>\n");
      out.write("                </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"card\">\n");
      out.write("            <img class=\"card-img-top\" src=\"https://4.bp.blogspot.com/-WlM6OFnEqqw/VwEKo411ImI/AAAAAAAABNo/axPaC1xSBZMWJkku9kuTiz_DbCCPawFeA/s1600/ED%25C4%25B0T%25C3%2596R.tif\" alt=\"Card image cap\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h5 class=\"card-title\"><strong>EDİTÖR</strong></h5>\n");
      out.write("                    <p class=\"card-text\"><font color=\"black\" size=\"4\">Editör yazarların sisteme yüklediği makaleleri uygun görürse hakeme yönlendirmek ile sorumludur.Aynı zamanda hakemden gelecek sonucu da yazara bildirir.</font>  </p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-footer\">\n");
      out.write("                    <a href=\"editorlogin.jsp\"   <button type=\"button\" class=\"btn btn-dark\">Editör Girişi</button> </a>\n");
      out.write("                </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"card\">\n");
      out.write("            <img class=\"card-img-top\" src=\"https://emlakkulisi.com/resim/orjinal/MjEyNDc1Mj-tuketici-hakem-heyeti-gorev-alani.jpg\" alt=\"Card image cap\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h5 class=\"card-title\"><strong>HAKEM HEYETİ</strong></h5>\n");
      out.write("                    <p class=\"card-text\"><font color=\"green\" size=\"4\">Hakemler editör tarafından uygun görülen makaleler üzerinde incelemeler yapar ve uygun gördükleri takdirde makale yayınlanır.Karar editöre bildirilir ve ardından yazara ulaşır.</font> </p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-footer\">\n");
      out.write("                    <a href=\"hakemlogin.jsp\" <button type=\"button\" class=\"btn btn-success\">Hakem Girişi</button></a>\n");
      out.write("                </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
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
