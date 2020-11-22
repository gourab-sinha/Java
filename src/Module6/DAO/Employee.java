package Module6.DAO;

public class Employee {
    private String name;
    private int empId;
    private float salary;

    public Employee(){}

    public Employee(int empId, String name, float salary){
        this.name=name;
        this.empId=empId;
        this.salary=salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public int getEmpId() {
        return empId;
    }

    @Override
    public String toString() {
        return empId + " | " + name + " | " + salary;
    }
}
