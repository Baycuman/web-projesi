package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import editoronay.DB1;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class editorfile_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\"/>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            tr,td,th{\n");
      out.write("                background:green;\n");
      out.write("                padding: 20px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"gray\">\n");
      out.write("        <br><br><br>\n");
      out.write("    <center>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <table border=\"2\">\n");
      out.write("            <tr>\n");
      out.write("                <th>ID</th><th>AD</th><th>SOYAD</th><th>DOSYA ADI</th><th>DOSYA YOLU</th><th>EKLENME TARİHİ</th><th>İNDİR</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                con = DB1.getConnection();
            String sql = "select * from onaylanan";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(rs.getInt(1));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getTimestamp(6));
      out.write("</td>\n");
      out.write("                <td><a href=\"DownloadServlet1?fileName=");
      out.print(rs.getString(4));
      out.write("\">Download</a></td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("            \n");
      out.write("        </table><br>\n");
      out.write("        <a href=\"Gonderme_Formu.jsp\">ANASAYFA</a>\n");
      out.write("    </center>\n");
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
