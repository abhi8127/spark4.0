import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScrollInsensitive {
    public static void main(String[] args) {
        try{
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
             //Establish connection to MySQL database named 'mystd'
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/mystd","root","Abhishek@123");

            //Create a Statement with scroll-insensitive & read-only ResultSet
            Statement statement= con.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,// Allows cursor to move in both directions
                    ResultSet.CONCUR_READ_ONLY);// Data is read-only (no updates allowed)

            // SQL query to select all records from 'student' table
            String query="select * from student";

            // Execute query and get a scrollable ResultSet
            ResultSet rs= statement.executeQuery(query);

            System.out.println("---------Scroll Insensitive ,read only----------");

            // Move cursor to the last row
            rs.last();// Moves to the last row of the result
            //System.out.println("   id"+" | " + "StdName"+" | " +"age");
            System.out.println("Last Row "+rs.getInt("id")+" | "+rs.getString("stdName")+" | "+rs.getInt("age"));

            // Move cursor to the first row
            rs.first();
            System.out.println("First Row "+rs.getInt("id")+" | "+rs.getString("stdName")+" | "+rs.getInt("age"));

            // Move cursor to the 3rd row
            rs.absolute(3);
            System.out.println("absolute "+rs.getInt("id")+" | "+rs.getString("stdName")+" | "+rs.getInt("age"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
