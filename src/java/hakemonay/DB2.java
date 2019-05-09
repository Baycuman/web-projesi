package hakemonay;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB2 {

    static String URL = "localhost:3306/";
    static String DATABASE_NAME = "akademikdergi";
    static String USERNAME = "root";
    static String PASSWORD = "1234";

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/akademikdergi?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","1234");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return con;
    }
}