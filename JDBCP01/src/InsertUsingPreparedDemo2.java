import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertUsingPreparedDemo2 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/mystd","root","Abhishek@123");
             String query="insert into student (id,stdName,age) values(?,?,?)";
            PreparedStatement pstmt=con.prepareStatement(query);

            pstmt.setString(2,"shivani");
            pstmt.setInt(3,24);
            pstmt.setInt(1,10);
            pstmt.executeUpdate();

            pstmt.setString(2,"shimran");
            pstmt.setInt(1,11);
            pstmt.setInt(3,17);
            pstmt.executeUpdate();

            System.out.println("Multiple row inserted into mysql DataBase");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
