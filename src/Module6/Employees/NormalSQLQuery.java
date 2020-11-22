package Module6.Employees;

import Module6.Connections.DBConnection;
import Module6.DAO.Employee;
import Module6.DTO.IEmployee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class NormalSQLQuery implements IEmployee {
    private Statement statement = null;

    public NormalSQLQuery() throws Exception{
        Connection connection = DBConnection.getInstance().getConnection();
        statement = connection.createStatement();
    }
    @Override
    public void saveEmployee(Employee employee) throws Exception {
        System.out.println("Save Employee");
        String sql = "insert into employees values("+employee.getEmpId() + ",'" + employee.getName()
                + "'," + employee.getSalary() + ")";

        int row = statement.executeUpdate(sql);
        if(row > 0){
            System.out.println("Inserted successfully");
        }
    }

    @Override
    public void updateEmployee(Employee employee) throws Exception {
        System.out.println("Update employee");
        String sql = "update employees set salary="+employee.getSalary()+" where id=" + employee.getEmpId();

        int row = statement.executeUpdate(sql);
        if(row > 0){
            System.out.println("Updated successfully");
        }
    }

    @Override
    public void deleteEmployee(int employeeId) throws Exception {
        System.out.println("Delete employee");
        String sql = "delete from employees where id=" + employeeId;

        int row = statement.executeUpdate(sql);
        if(row > 0){
            System.out.println("Deleted successfully");
        }
    }

    @Override
    public Employee searchEmployee(int employeeId) throws Exception {
        System.out.println("Search Employee");
        String sql = "select * from employees where id=" +employeeId;

        ResultSet row = statement.executeQuery(sql);
        while (row.next()){
            int empID = row.getInt(1);
            float salary = row.getFloat("salary");
            String name = row.getString("name");
            return new Employee(empID,name,salary);
        }
        return null;
    }

    @Override
    public List<Employee> getEmployees() throws Exception {
        System.out.println("Get employee");
        String sql = "select * from employees";
        ResultSet rows = statement.executeQuery(sql);
        List<Employee> employees = new ArrayList<Employee>();
        while(rows.next()){
            int empId = rows.getInt(1);
            float salary = rows.getFloat(3);
            String name  = rows.getString("name");
            employees.add(new Employee(empId,name,salary));
        }
        return employees;
    }
}
