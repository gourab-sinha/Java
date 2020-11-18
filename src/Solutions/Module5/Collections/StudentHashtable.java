package Solutions.Module5.Collections;

import java.util.ArrayList;
import java.util.Hashtable;

public class StudentHashtable {
    private Hashtable<Integer,Student> students = null;

    public StudentHashtable(){
        students = new Hashtable<Integer, Student>();
    }

    public void insertStudent(){
        System.out.println("Inserting five students");
        ArrayList<Student> registerStudents = new ArrayList<Student>();
        registerStudents.add(new Student("Gourab", 90));
        registerStudents.add(new Student("Rohan", 91));
        registerStudents.add(new Student("Rahul", 90));
        registerStudents.add(new Student("James", 70));
        registerStudents.add(new Student("Karan", 65));

        int id = 1;
        for(Student student: registerStudents){
            System.out.println(student.getName() + " | " + student.getMarks());
            students.put(id,student);
            id+=1;
        }
    }

    public void displayStudent(){
        System.out.println("Display all the student");
        for(int id: students.keySet()){
            Student student = students.get(id);
            System.out.println(student.getName() + " | " + student.getMarks());
        }
    }

    public Student getTopStudent(){
        Student topper = null;
        int marks = -1;
        for(int id: students.keySet()){
            Student student = students.get(id);
            if(student.getMarks() > marks){
                topper = student;
                marks =student.getMarks();
            }
        }
        return topper;
    }

}
