package hibernate.course.java.demo;

import com.mysql.cj.Session;
import org.hibernate.SessionFactory;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentDemo {
    public static final String jdbcURL = "jdbc:mysql://127.0.0.1:3306/hb_student_tracker?requireSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC";

    public static void main(String[] args) {
        String user = "hbstudent";
        String pass = "hbstudent";
        try{
            System.out.println("Connecting to SQL : " + jdbcURL);
            Connection connection = DriverManager.getConnection(jdbcURL, user, pass);
            System.out.println("Connection successful!!!");
            connection.close();
        } catch (Exception exc) {
            exc.printStackTrace();
        }


    }
}
