import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertUsingPreparedDemo {
    public static void main(String[] args) {
        try{

            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection to MySQL DB 'mystd'
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/mystd","root","Abhishek@123");

            // Define parameterized SQL query with placeholders (?)
            String query="insert into student (id,stdName,age) values (?,?,?)";

            // Create PreparedStatement object
            PreparedStatement pstmt=con.prepareStatement(query);

            // Set values for the placeholders (1-based indexing)
            pstmt.setInt(1, 9);             // Set id = 8
            pstmt.setString(2, "shiva"); // Set stdName = "shivansh"
            pstmt.setInt(3, 28);            // Set age = 12

            // Execute the update query and get number of affected rows
            int update= pstmt.executeUpdate();
            System.out.println(update+" Rows "+"Updated");
            con.close();


        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
