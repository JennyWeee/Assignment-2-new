package dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
	private static Connection connection;
    
    // Initialize the database connection in a static block or constructor
    static {
        try {

        	Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:dahp.db");
        } catch (Exception e) {
        	// Handle any initialization errors
            
            System.err.println(e);
        }
    }
    
    // Other database-related methods
    public static Connection getConnection() {
        return connection;
    }
    
    // Close the database connection
    public static void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle any closure errors
        }
    }
}
