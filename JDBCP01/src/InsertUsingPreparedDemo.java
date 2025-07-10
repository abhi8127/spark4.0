import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertUsingPreparedDemo {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/mystd","root","Abhishek@123");

            String query="insert into student (id,stdName,age) values (?,?,?)";

            PreparedStatement pstmt=con.prepareStatement(query);
            pstmt.setInt(1,8);
            pstmt.setString(2,"shivansh");
            pstmt.setInt(3,12);

            int update= pstmt.executeUpdate();
            System.out.println(update+" Rows "+"Updated");
            con.close();


        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
