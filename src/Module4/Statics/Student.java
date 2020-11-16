package Module4.Statics;

public class Student {
    static String collegeName="LPU"; // only one copy which is shared by all objects of Student class
    private String name;
    private int roll;

    public Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public static String getCollegeName() {
        return collegeName;
    }

    public static void setCollegeName(String collegeName) {
        Student.collegeName = collegeName;
    }

    public String getUniversityName(){
        return getCollegeName();
    }
}
