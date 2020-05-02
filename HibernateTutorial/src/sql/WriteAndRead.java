package sql;

import java.sql.*;

public class WriteAndRead {

    private static Connection con1;
    private static Statement stmt1;
    private static ResultSet rs1;

    public static void main(String[] args) {
        final String url = "jdbc:mysql://127.0.0.1:3306/?user=hbstudent" +
                "&serverTimezone=UTC";
        final String user = "hbstudent";
        final String password = "hbstudent";


        String queryWrite = "INSERT INTO books.book (id, name, author) \n " +
                "VALUES (5, 'testbook', 'someone' );";

        String queryRead = "select id, name, author from books.book";

        try {
            con1 = DriverManager.getConnection(url, user, password);
            stmt1 = con1.createStatement();

            stmt1.executeUpdate(queryWrite);
            rs1 = stmt1.executeQuery(queryRead);

            while (rs1.next()){
                int id = rs1.getInt("id");
                String name = rs1.getString("name");
                String author = rs1.getString("author");
                System.out.println(id + "   " + author + "   " + name);
            }
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            try {
                con1.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                stmt1.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                rs1.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
