package package1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/fwstudydb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        Connection connection;

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if (!connection.isClosed()) {
                System.out.println("DB connection established!");
            }
            connection.close();
            if (connection.isClosed()) {
                System.out.println("DB connection closed!");
            }
        } catch (SQLException e) {
            System.err.println("Failed load driver class!");
        }
    }
}
