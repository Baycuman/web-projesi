package hakemlogin;



import java.io.IOException;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
 
 
@WebServlet("/hakem")
public class hakemloginservlet extends HttpServlet{
 
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
 hakemler k=new hakemDao().getiryazar(username, password);
 
 if(k!=null){
 req.getSession().setAttribute("username", k);
 resp.sendRedirect("hakemgiris.jsp");
 }
 else{
 req.getRequestDispatcher("hakemlogin.jsp").forward(req, resp);
 
 }
 }
 
}