
package hakemlogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class hakemDao {
  
public hakemler getiryazar(String username, String password) {
 hakemler k = null;
    
 try {
  Class.forName("com.mysql.cj.jdbc.Driver");
  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yazar?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","1234");
              
 String query = "select * from hakemlogin where username=? and password=?";
 PreparedStatement psmt = conn.prepareStatement(query);
 psmt.setString(1, username);
 psmt.setString(2, password);
 
ResultSet rs = psmt.executeQuery();
 
while (rs.next()) {
 k=new hakemler(rs.getString("username"), rs.getString("password"));
 
 }
 
} catch (Exception e) {
 e.printStackTrace();
 }
 return k;
 }
}