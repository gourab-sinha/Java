package Solutions.Module1.Solutions;

import java.util.Scanner;

public class IfElseCondition {
    public static void ifElseCondition(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age to check eligibility for Vote: ");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("Eligible for Vote");
        }
        else{
            System.out.println("Not eligible for Vote");
        }

        // Positive or negative
        System.out.println("Enter number to check positive or negative:");
        int num = sc.nextInt();

        if(num >= 0) System.out.println("Positive");
        else System.out.println("Negative");

        // Extend
        System.out.println("Enter new number to check positive or negative or zero: ");
        num =  sc.nextInt();
        if(num == 0) System.out.println("Zero");
        else if(num > 0) System.out.println("Positive");
        else System.out.println("Negative");

        // Largest of two numbers
        System.out.println("Enter two numbers to find largest among them");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 < num2) System.out.println("Num 2 is larger than Num 1");
        else if(num1 > num2) System.out.println("Num 1 is larger than Num 2");
        else System.out.println("Both are equal");

        // Number is even or odd
        System.out.println("Enter number to check even or odd: ");
        num = sc.nextInt();
        if(num%2==1) System.out.println("Odd");
        else System.out.println("Even");
    }
}
