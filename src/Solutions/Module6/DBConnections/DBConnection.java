package Solutions.Module6.DBConnections;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static DBConnection dbConnection = null;
    private static Connection connection = null;

    private DBConnection(){
        if(dbConnection != null){
            throw new RuntimeException("Use getInstance method");
        }
    }

    public static DBConnection getInstance(){
        if(dbConnection == null){
            dbConnection = new DBConnection();
        }

        return dbConnection;
    }

    public Connection getConnection(){
        if(connection == null){
            try{
                String connectionUrl = "jdbc:mysql://localhost:3306/development";
                connection = DriverManager.getConnection(connectionUrl,"root","mysql@123");
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        return connection;
    }
}
