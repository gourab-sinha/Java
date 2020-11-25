package Solutions.Module6.Students;

import java.util.Objects;

public class Student {
    private int studentId;
    private String name;
    private String className;
    private int marks;

    public Student(){}

    public Student(int studentId, String name, String className, int marks){
        this.studentId=studentId;
        this.className=className;
        this.name=name;
        this.marks=marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", marks=" + marks +
                '}';
    }
}
