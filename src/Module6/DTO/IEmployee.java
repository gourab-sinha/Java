package Module6.DTO;

import Module6.DAO.Employee;

import java.util.List;

public interface IEmployee {
    void saveEmployee(Employee employee) throws Exception;
    void updateEmployee(Employee employee) throws Exception;
    void deleteEmployee(int employeeId) throws Exception;
    Employee searchEmployee(int employeeId) throws Exception;
    List<Employee> getEmployees() throws Exception;

}
