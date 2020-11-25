package Solutions.Module6;

import Solutions.Module6.DBConnections.DBConnection;
import Solutions.Module6.Students.Registry;
import Solutions.Module6.Students.Student;

import java.sql.Connection;

public class Assignment {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------");
        System.out.println("Student");
        System.out.println("---------------------------------------------------");
        try {
            Registry registry = new Registry();
            registry.createTable();
            registry.clearEntries();

            registry.addStudent(new Student(1,"Gourab","Java",90));

            Student student = registry.getStudent(1);
            System.out.println(student);

            student.setMarks(100);
            student.setClassName("Math");
            registry.updateStudentInformation(student);
            student = registry.getStudent(1);
            System.out.println(student);

            registry.deleteStudent(1);

            registry.addStudentInBatch();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
