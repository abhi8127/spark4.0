import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCUpdateDemo {
    public static void main(String[] args) {
        try{
            //use for load my sql jdbc driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //use for established a connection to the mysql data base
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/mystd","root","Abhishek@123");

            //create a statment object which is used to send sql command to the my sql database
            Statement statement= con.createStatement();

             // define a sql query to update  database
            String query="update student set age=26 where id=5";

            //execute the update query using executeUpdate() which return no of row updated
            int update= statement.executeUpdate(query);
            System.out.println("Updated "+update+" row");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
