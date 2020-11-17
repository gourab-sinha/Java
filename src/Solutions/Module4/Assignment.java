package Solutions.Module4;

import Solutions.Module4.Exceptions.ArrayIndexOutOfBounds;
import Solutions.Module4.Interfaces.Queue;
import Solutions.Module4.PackageOperations.Operations;
import Solutions.Module4.ThreadsOperations.EvenNumbers;
import Solutions.Module4.ThreadsOperations.TableOfFive;

public class Assignment {
    public static void main(String[] args) {

        System.out.println("---------------------------------------------------");
        System.out.println("Queue Implementation");
        System.out.println("---------------------------------------------------");
        Queue q = new Queue(3);
        q.insert(5);
        System.out.println(q.delete());
        System.out.println(q.delete());
        q.insert(4);
        q.insert(5);
        q.insert(6);
        q.insert(7);
        System.out.println(q.delete());
        q.insert(8);
        System.out.println(q.delete());
        System.out.println(q.delete());
        System.out.println(q.delete());

        System.out.println("---------------------------------------------------");
        System.out.println("Package implementation");
        System.out.println("---------------------------------------------------");
        Operations operations = new Operations();
        System.out.println(operations.reverseNumber(1223));
        System.out.println(operations.divide(10, 6));
        System.out.println(operations.factorial(5));
        System.out.println(operations.multiply(5,5));
        System.out.println(operations.subtract(10,12));

        System.out.println("---------------------------------------------------");
        System.out.println("Array Index Out Of Bounds Exception");
        System.out.println("---------------------------------------------------");
        ArrayIndexOutOfBounds array = new ArrayIndexOutOfBounds(5);
        array.insert(1);
        array.printElements();
        array.insert(2);
        array.printElements();
        array.insert(3);
        array.printElements();
        array.insert(4);
        array.printElements();
        array.insert(5);
        array.printElements();
        array.insert(6);
        array.printElements();
        System.out.println("---------------------------------------------------");
        System.out.println("Thead Implementation");
        System.out.println("---------------------------------------------------");
        EvenNumbers evenNumbers = new EvenNumbers();
        TableOfFive tableOfFive = new TableOfFive();
        evenNumbers.start();
        tableOfFive.start();
    }
}
