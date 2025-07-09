import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) {
        try {
            //  it is used to Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database (URL, username, password)
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/mystd", "root","Abhishek@123");

            // Create a Statement object to execute SQL queries
            Statement statement= con.createStatement();

            // Define SQL query to fetch all records from 'student' table
            String query="select * from student";

            // Execute the SQL query and store the result in ResultSet
            ResultSet rs=statement.executeQuery(query);

            System.out.println(" ---------------Read Data------------ ");

            while (rs.next()) {


                /* int id = rs.getInt("id"); // assuming column name is 'id'
                String name = rs.getString("stdName"); // assuming column name is 'name'
                int age = rs.getInt("age"); // assuming column name is 'age'
                System.out.println("ID: " + id + ", stdName: " + name + ", Age: " + age);

                System.out.println("------------------------------------------------------");

                 */

                System.out.println(rs.getInt("id")+" | "+ rs.getString("stdName")
                +" | "+rs.getInt("age"));
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
