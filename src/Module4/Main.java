package Module4;

import Module4.Inheritances.Circle;
import Module4.Inheritances.Rectangle;
import Module4.Inheritances.Shape;
import Module4.Inheritances.Square;
import Module4.Interfaces.ButtonType;
import Module4.Interfaces.GameRemote;
import Module4.Interfaces.Remote;
import Module4.Interfaces.TVRemote;
import Module4.Statics.Student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Remote tvRemote = new TVRemote();

        System.out.println("TV Remote");
        ArrayList<String> detail = tvRemote.control(ButtonType.Down);
        for (String value: detail) {
            System.out.println(value);
        }
        tvRemote.control(ButtonType.Up);
        for (String value: detail) {
            System.out.println(value);
        }
        tvRemote.control(ButtonType.Down);
        for (String value: detail) {
            System.out.println(value);
        }
        tvRemote.setOn(false);

        System.out.println("Game Remote");
        Remote gameRemote = new GameRemote();
        detail= gameRemote.control(ButtonType.Down);
        System.out.println(detail.get(0));

        printData(gameRemote.control(ButtonType.Up).get(0));
        printData(gameRemote.control(ButtonType.Down).get(0));
        printData(gameRemote.control(ButtonType.Down).get(0));
        printData(gameRemote.control(ButtonType.Down).get(0));
        printData(gameRemote.control(ButtonType.Right).get(0));
        printData(gameRemote.control(ButtonType.Right).get(0));
        printData(gameRemote.control(ButtonType.Right).get(0));

        System.out.println("Inheritance Example");
        System.out.println("Circle");
        Shape shape = new Circle(4,0);
        System.out.println(shape.getColor());
        System.out.println(shape.getArea());

        System.out.println("Rectangle");
        shape = new Rectangle(4,4,1);
        System.out.println(shape.getColor());
        System.out.println(shape.getArea());

        System.out.println("Square");
        shape = new Square(5,3);
        System.out.println(shape.getColor());
        System.out.println(shape.getArea());

        System.out.println("Static instance attributes");
        Student s1 = new Student("Gourab", 1);
        Student s2 = new Student("Sinha", 2);
        System.out.println(s1.getUniversityName());
        System.out.println(s1.getUniversityName());

        System.out.println("College Name: " + Student.getCollegeName());
        Student.setCollegeName("Lovely Professional University");
        System.out.println(s1.getUniversityName());
        System.out.println(s2.getUniversityName());
    }

    public static void printData(String detail){
        System.out.println(detail);
    }
}
