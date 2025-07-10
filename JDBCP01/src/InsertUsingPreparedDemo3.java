import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertUsingPreparedDemo3 {
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

            Scanner sc=new Scanner(System.in);

            System.out.println("please enter the id");
            int id=sc.nextInt();
            System.out.println("please enter the name of the student");
            sc.nextLine();
            String name=sc.nextLine();
            System.out.println("please enter the age of the student");
            int age=sc.nextInt();

            // Set values for the placeholders (1-based indexing)
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setInt(3, age);

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
