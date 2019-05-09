package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class userDAOImp implements UserDAO {

    private static final String KULLANICI_EKLE = "insert into person(name,email,username,password) values (?,?,?,?)";

    Connection connection;

    public userDAOImp() {
        connection = ConnectionManager.getDatabase();
    }

    @Override
    public void kullaniciEkle(String name, String email, String username, String password) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(KULLANICI_EKLE);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, username);
            preparedStatement.setString(4, password);
            preparedStatement.execute();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
