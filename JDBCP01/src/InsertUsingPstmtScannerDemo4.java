import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertUsingPstmtScannerDemo4 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
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

            System.out.println("How many student you want to insert: ");
            int count=sc.nextInt();

            for(int i=1;i<=count;i++) {
                System.out.println("please enter the details for "+i+" student");
                System.out.println("ID : ");
                int id = sc.nextInt();
                System.out.println("Student Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.println("Student Age : ");
                int age = sc.nextInt();

                // Set values for the placeholders (1-based indexing)
                pstmt.setInt(1, id);
                pstmt.setString(2, name);
                pstmt.setInt(3, age);

                // Execute the update query and get number of affected rows
                  pstmt.executeUpdate();
                System.out.println(i+ " Rows " + "Inserted");

            }
            System.out.println("Details of all "+count+" student inserted successfully----");
            con.close();

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
