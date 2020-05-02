package hibernate.course.java;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/?user=root"+
//                "?verifyServerCertificate=false"+
//                "&useSSL=false"+
//                "&requireSSL=false"+
//                "&useLegacyDatetimeCode=false"+
//                "&amp"+
                "&serverTimezone=UTC";
        String user = "hbstudent";
        String pass = "hbstudentt";

        try{
            System.out.println("Connecting to SQL : " + jdbcURL);
            Connection connection = DriverManager.getConnection(jdbcURL, user, pass);
            System.out.println("Connection successful!!!");
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
