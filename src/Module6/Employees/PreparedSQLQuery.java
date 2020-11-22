package Module6.Employees;

import Module6.Connections.DBConnection;
import Module6.DAO.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PreparedSQLQuery {
    private Connection connection = null;
    private PreparedStatement saveEmployeeInDB = null;
    private PreparedStatement searchEmployeeInDB = null;
    private PreparedStatement deleteEmployeeFromDB = null;
    private PreparedStatement updateEmployeeInDB = null;
    private PreparedStatement getEmployeesFromDB = null;
    public PreparedSQLQuery() throws Exception{
        connection = DBConnection.getInstance().getConnection();
        saveEmployeeInDB = connection.prepareStatement("insert into employees values(?,?,?)");
        searchEmployeeInDB = connection.prepareStatement("select * from employees where id=?");
        deleteEmployeeFromDB = connection.prepareStatement("delete from employees where id=?");
        updateEmployeeInDB = connection.prepareStatement("update employees set name=? where id=?");
        getEmployeesFromDB = connection.prepareStatement("select * from employees");

    }
    public void saveEmployee(Employee employee) throws Exception{
        System.out.println("Employee saved");
        saveEmployeeInDB.setInt(1,employee.getEmpId());
        saveEmployeeInDB.setString(2,employee.getName());
        saveEmployeeInDB.setFloat(3,employee.getSalary());
        int row = saveEmployeeInDB.executeUpdate();
        if(row>0){
            System.out.println("Record saved in DB");
        }
    }

    public Employee searchEmployee(int employeeID) throws Exception{
        System.out.println("Search employee");
        searchEmployeeInDB.setInt(1,employeeID);
        ResultSet resultSet = searchEmployeeInDB.executeQuery();
        if(resultSet.next()){
            return new Employee(resultSet.getInt(1),resultSet.getString(2),resultSet.getFloat(3));
        }
        return null;
    }

    public void updateEmployee(Employee employee) throws Exception{
        System.out.println("Update employee");
        updateEmployeeInDB.setString(1,employee.getName());
        updateEmployeeInDB.setInt(2,employee.getEmpId());

        int row = updateEmployeeInDB.executeUpdate();
        if(row>0){
            System.out.println("Updated successfully");
        }
    }

    public List<Employee> getEmployeeList() throws Exception{
        System.out.println("Employee list");
        ResultSet resultSet = getEmployeesFromDB.executeQuery();
        List<Employee> employees = new ArrayList<Employee>();
        while(resultSet.next()){
            employees.add(new Employee(resultSet.getInt(1),resultSet.getString(2),resultSet.getFloat(3)));
        }
        return employees;
    }

    public void deleteEmployee(int employeeId) throws Exception{
        System.out.println("Delete employee");
        deleteEmployeeFromDB.setInt(1,employeeId);
        int row = deleteEmployeeFromDB.executeUpdate();
        if(row>0){
            System.out.println("Successfully deleted");
        }
    }
}
