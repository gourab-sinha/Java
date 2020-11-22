package Module6.SQLQueries;

import Module6.Connections.DBConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLQueries {
    private DBConnection dbConnection = null;
    public SQLQueries(){
        dbConnection = DBConnection.getInstance();
    }

    public void insertQuery() throws SQLException {
        System.out.println("Insert Query");
        Connection connection = dbConnection.getConnection();
        Statement statement=  connection.createStatement();
        String sql = "Insert into users values(1,'Gourab_Sinha', 'gourab@gmail.com', 'LPU')";
        statement.execute(sql);

//        connection.close();
    }

    public void updateQuery() throws SQLException{
        System.out.println("Update Query");
        Connection connection = dbConnection.getConnection();
        Statement statement = connection.createStatement();

        String sql = "Update users set email='Gourab@gourab.com' where id=1";
        int rows = statement.executeUpdate(sql);
        System.out.println(rows);

//        connection.close();
    }

    public void selectQuery() throws Exception{
        System.out.println("Select Query");
        Connection connection=dbConnection.getConnection();
        Statement statement = connection.createStatement();

        String sql = "Select * from users";
        ResultSet resultSet = statement.executeQuery(sql);
//        System.out.println(resultSet);
        System.out.println("Users");
        while (resultSet.next()){
            System.out.println(resultSet.getRow() + " -> Id " + resultSet.getInt(1) + " Email "
                    + resultSet.getString("email"));
            Thread.sleep(500);
        }
    }
}
