import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDeleteDemo {
    public static void main(String[] args) {
     try{
         Class.forName("com.mysql.cj.jdbc.Driver");

         Connection con= DriverManager.getConnection(
                 "jdbc:mysql://127.0.0.1:3306/mystd","root","Abhishek@123");

         Statement st= con.createStatement();

         String query="DELETE FROM STUDENT WHERE Id=6";
         int delete=st.executeUpdate(query);

         System.out.println("Deleted "+delete+" Row");

     } catch (Exception e) {
         e.printStackTrace();
     }
    }
}
