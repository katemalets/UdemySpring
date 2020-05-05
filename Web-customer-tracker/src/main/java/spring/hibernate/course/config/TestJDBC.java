//package spring.hibernate.course.config;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class TestJDBC {
//    private static Connection connection;
//    public static void main(String[] args) {
//
//        String jdbcURL = "jdbc:mysql://127.0.0.1:3306/web_customer_tracker" +
//                "?requireSSL=false&serverTimezone=UTC";
//        String user = "springstudent";
//        String pass = "springstudent";
//
//        try{
//            System.out.println("Connecting to SQL : " + jdbcURL);
//            connection = DriverManager.getConnection(jdbcURL, user, pass);
//            System.out.println("Connection successful!!!");
//        } catch (Exception exc) {
//            try {
//                connection.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
