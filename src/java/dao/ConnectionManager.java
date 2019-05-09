package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {
    
    public static Connection getDatabase(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/akademikdergi?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","1234");
            return connection;
        } catch (Exception e) {
        }
        
        return null;
    }
    
    
}
