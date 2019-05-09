package editorlogin;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class editorDao {
     //Kullanıcı adı ve sifre doğruysa o kullanıcıyı getirir
public edıtorler getiredıtor(String username, String password) {
 edıtorler k = null;
    
 try {
  Class.forName("com.mysql.cj.jdbc.Driver");
  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/edıtor?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","1234");
              
 String query = "select * from editorlogin where username=? and password=?";
 PreparedStatement psmt = conn.prepareStatement(query);
 psmt.setString(1, username);
 psmt.setString(2, password);
 
ResultSet rs = psmt.executeQuery();
 
while (rs.next()) {
 k=new edıtorler(rs.getString("username"), rs.getString("password"));
 
 }
 
} catch (Exception e) {
 e.printStackTrace();
 }
 return k;
 }
}
