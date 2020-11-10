package Module3;

import Module3.ClassObjects.Employee;

public class Main {
    static {
        System.out.println("Print Value");
    }
    public static void main(String[] args) {
        // Creating object with default constructor.
        Employee employee = new Employee();
        employee.setName("Gourab");
        employee.setAccountNo("1234567");
        employee.setAddress("Dalkhola, WB, India, 733201");

        System.out.println("Display Employee Details");
        System.out.println(employee.getName());
        System.out.println(employee.getAccountNo());
        System.out.println(employee.getAddress());

        // Creating object with parameterized constructor
        Employee employee1=new Employee("Gourab", "123123", "Dalkhola, WB");
        System.out.println("Display Employee Details");
        System.out.println(employee1.getName());
        System.out.println(employee1.getAccountNo());
        System.out.println(employee1.getAddress());
    }
}
