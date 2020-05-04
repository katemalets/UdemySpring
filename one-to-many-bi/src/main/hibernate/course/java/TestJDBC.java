package hibernate.course.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBC {
    public static void main(String[] args) throws SQLException {
        String jdbcURL = "jdbc:mysql://127.0.0.1:3306/?user=hbstudent"+
                "&serverTimezone=UTC";
        String user = "hbstudent";
        String pass = "hbstudent";
        Connection connection = null;
        try{
            System.out.println("Connecting to SQL : " + jdbcURL);
            connection = DriverManager.getConnection(jdbcURL, user, pass);
            System.out.println("Connection successful!!!");
        } catch (Exception exc) {
            connection.close();
        }
    }
}
