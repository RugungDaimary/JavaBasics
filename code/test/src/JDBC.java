import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {
    public static void main(String[] args) {
        try {
            // 1) Load the MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2)Establish the connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "password");

            // 2)Create a statement object
            Statement stmt = con.createStatement();

            // 4)Execute a query and retrieve the result
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            //5) Process the result
            while (rs.next()) {
                System.out.println("User ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
            }

            // 6)Close the connection
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
