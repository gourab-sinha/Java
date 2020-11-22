package Module6.Connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection connection = null;
    private static DBConnection dbConnection = null;
    private DBConnection(){
        if(dbConnection!=null){
            throw new RuntimeException("Use getInstance method");
        }
    }

    public static DBConnection getInstance(){
        if(dbConnection==null){
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }
    public Connection getConnection(){
        if(connection==null){
            String connectionUrl = "jdbc:mysql://localhost:3306/development";
            try{
                connection = DriverManager.getConnection(connectionUrl,"root", "mysql@123");
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }
        return connection;
    }
}
