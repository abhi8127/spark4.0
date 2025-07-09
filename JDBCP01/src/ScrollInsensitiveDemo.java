import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScrollInsensitiveDemo {
    public static void main(String[] args) {
        try{
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Establish connection to MySQL database named 'mystd'
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/mystd","root","Abhishek@123");

            //Create a Statement with scroll-insensitive & read-only ResultSet
            // TYPE_SCROLL_INSENSITIVE - allows moving ResultSet cursor in both directions,
            // but changes to the database after executing the query won't reflect.
            // CONCUR_READ_ONLY - prevents updates to the data through the ResultSet.
            Statement statement= con.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);

            // SQL query to select all records from 'student' table
            String query="select * from student";

            // Execute query and get a scrollable ResultSet
            ResultSet rs= statement.executeQuery(query);

            System.out.println("---------Fetch data is not in live update mode----------");

           // Pause the execution for 10 seconds (simulate a delay)
            Thread.sleep(10000);
            //Move cursor before the first row so we can iterate through the entire ResultSet
           rs.beforeFirst();
           //Iterate over all records and print each row
           while (rs.next())
           {
               System.out.println(rs.getInt("id")
                       +" | " +rs.getString("stdName")
                       +" | "+rs.getInt("age"));
           }

           //Close the database connection
           con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
