package Solutions.Module5;

import Solutions.Module5.Collections.ArrayListNumbers;
import Solutions.Module5.Collections.EmployeeHashMap;
import Solutions.Module5.Collections.StudentHashtable;
import Solutions.Module5.Wrappers.Wrapper;

public class Assignment {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------");
        System.out.println("Wrapper classes");
        System.out.println("---------------------------------------------------");
        Wrapper wrapper = new Wrapper();
        wrapper.integerWrapper();
        wrapper.longWrapper();
        wrapper.charWrapper();
        wrapper.byteWrapper();
        wrapper.shortWrapper();

        System.out.println("---------------------------------------------------");
        System.out.println("ArrayList");
        System.out.println("---------------------------------------------------");
        ArrayListNumbers arrayListNumbers = new ArrayListNumbers();
        arrayListNumbers.insert();
        arrayListNumbers.display();

        System.out.println("---------------------------------------------------");
        System.out.println("Hashmap for employees");
        System.out.println("---------------------------------------------------");
        EmployeeHashMap employeeHashMap = new EmployeeHashMap();
        employeeHashMap.insertEmployees();
        employeeHashMap.displayEmployees();

        System.out.println("---------------------------------------------------");
        System.out.println("Hashtable for students");
        System.out.println("---------------------------------------------------");
        StudentHashtable studentHashtable = new StudentHashtable();
        studentHashtable.insertStudent();
        studentHashtable.displayStudent();
        System.out.println("Topper: " + studentHashtable.getTopStudent().getName());
    }
}
