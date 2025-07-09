import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCInsertDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");// load mysql JDBC Driver

            // established a connection to the data base
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/mystd", "root", "Abhishek@123");

            // its create a statment object to execute sql query
            Statement statement = con.createStatement();

            String query = "insert into student (id,stdName,age) values (5,'sanju',22)";

            //execute the insert sql query using executeUpdate() which return no of row affected
            int update = statement.executeUpdate(query);

            System.out.println("Inserted "+update+" Row");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }




    }
}
