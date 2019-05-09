
import dao.UserDAO;
import dao.userDAOImp;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/kullaniciEkle")
public class Ekle extends HttpServlet{    
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
        req.setCharacterEncoding("UTF-8");
        
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        
        UserDAO userDAO = new userDAOImp();
        userDAO.kullaniciEkle(name,email,username, password);
        
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("login.jsp");
        requestDispatcher.forward(req, resp);
        
        
        
    }
    
    
    
    
}
