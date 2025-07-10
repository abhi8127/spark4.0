import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectUsingPreparedDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/mystd","root","Abhishek@123");
             String query="select * from student where id>=?";

            PreparedStatement pstmt=con.prepareStatement(query);
            pstmt.setInt(1,10);
            ResultSet rs= pstmt.executeQuery();

            System.out.println("Start fetching data from DataBase_____");
            System.out.println("------------------------------------------------");
            while(rs.next())
            {
                System.out.println(rs.getInt("id")+" | "+ rs.getString("stdName")
                        +" | "+rs.getInt("age"));
            }
            System.out.println("---------------------------------------------------");
            System.out.println("All Data from DataBase Fetch Successfully");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
