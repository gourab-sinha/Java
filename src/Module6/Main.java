package Module6;

import Module6.DAO.Employee;
import Module6.Employees.NormalSQLQuery;
import Module6.Employees.PreparedSQLQuery;
import Module6.SQLQueries.SQLQueries;

import java.sql.PreparedStatement;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------");
        System.out.println("SQL Insert Query");
        System.out.println("---------------------------------------------------");
        try{
            SQLQueries sqlQueries = new SQLQueries();
            sqlQueries.insertQuery();
            sqlQueries.updateQuery();
            sqlQueries.selectQuery();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("---------------------------------------------------");
        System.out.println("Employee Normal CRUD");
        System.out.println("---------------------------------------------------");
        try{
            NormalSQLQuery normalSQLQuery = new NormalSQLQuery();

            Employee employee = new Employee(1, "Gourab", 2500f);
            normalSQLQuery.saveEmployee(employee);

            Employee employee1 = normalSQLQuery.searchEmployee(1);
            System.out.println("Employee: " + employee1.getEmpId() + " | " + employee1.getName() + " | "
                    + employee1.getSalary());

            List<Employee> employeeList = normalSQLQuery.getEmployees();
            for (Employee emp: employeeList){
                System.out.println(emp.getEmpId() + " | " + emp.getName() + " | " + emp.getSalary());
            }

            normalSQLQuery.deleteEmployee(1);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("---------------------------------------------------");
        System.out.println("Employee PreparedStatement CRUD");
        System.out.println("---------------------------------------------------");
        try {
            PreparedSQLQuery preparedSQLQuery = new PreparedSQLQuery();

            preparedSQLQuery.saveEmployee(new Employee(2,"Sourav", 2005f));
            preparedSQLQuery.searchEmployee(2);
            preparedSQLQuery.updateEmployee(new Employee(2,"Game", 4500f));
            List<Employee> employeeList = preparedSQLQuery.getEmployeeList();
            for (Employee emp: employeeList){
                System.out.println(emp.getEmpId() + " | " + emp.getName() + " | " + emp.getSalary());
            }

            preparedSQLQuery.deleteEmployee(2);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
