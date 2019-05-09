
package editorlogin;


import java.io.IOException;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
 
 
@WebServlet("/editor")
public class edıtorloginservlet extends HttpServlet{
 
 @Override
 protected void doGet(HttpServletRequest req, HttpServletResponse resp)
 throws ServletException, IOException {
 doPost(req, resp);
 }
 @Override
 protected void doPost(HttpServletRequest req, HttpServletResponse resp)
 throws ServletException, IOException {
 String username=req.getParameter("username");
 String password=req.getParameter("password");
 edıtorler k=new editorDao().getiredıtor(username, password);
 
 if(k!=null){
 req.getSession().setAttribute("username", k);
 resp.sendRedirect("editorgiris.jsp");
 }
 else{
 req.getRequestDispatcher("editorlogin.jsp").forward(req, resp);
 
 }
 }
 
}