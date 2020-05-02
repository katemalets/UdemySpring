package sql;

import java.sql.*;

public class JavaToMySQL {

    private static final String url = "jdbc:mysql://127.0.0.1:3306/?user=hbstudent"+
            "&serverTimezone=UTC";
    private static final String user = "hbstudent";
    private static final String password = "hbstudent";

    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    public static void main(String[] args) {

//        String query = "select count(*) from books.book";       //counting
//        String query = "select id, name, author from books.book";  //reading
        String query = "INSERT INTO books.book (id, name, author) \n" +  //writing
                " VALUES (3, 'Head First Java', 'Kathy Sieara');";
        try {
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();      //counting + writing
            stmt.executeUpdate(query);
   //         rs = stmt.executeQuery(query);

//            while (rs.next()) {                                 // counting
//                int count = rs.getInt(1);
//                System.out.println("Total number of books in the table : " + count);
//            }
//            while (rs.next()) {
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//                String author = rs.getString("author");
//                System.out.printf("id: %d, name: %s, author: %s %n", id, name, author);
//            }

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException se) { /*can't do anything */ }
//            try {
//                stmt.close();
//            } catch (SQLException se) { /*can't do anything */ }
//            try {
//                rs.close();
//            } catch (SQLException se) { /*can't do anything */ }
        }
    }
}
