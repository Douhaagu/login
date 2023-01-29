package loginda.connection;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBconn {
    private static Connection connection;


    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermache", "root","0231567");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

        public static Connection getConnection() {
            return connection;
        }



}
