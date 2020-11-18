package Solutions.Module5.Collections;

import java.util.HashMap;

public class EmployeeHashMap {
    private HashMap<Integer, String> employees = null;
    public EmployeeHashMap(){
        employees = new HashMap<Integer, String>();
    }

    public void insertEmployees(){
        employees.put(1,"Gourab");
        employees.put(2,"Rahul");
        employees.put(3,"Rohan");
        employees.put(4,"Karan");
        employees.put(5,"James");
    }

    public void displayEmployees(){
        for(int id: employees.keySet()){
            System.out.println(employees.get(id));
        }
    }
}
