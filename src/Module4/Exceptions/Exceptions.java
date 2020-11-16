package Module4.Exceptions;

import java.text.ParseException;
import java.util.Scanner;

public class Exceptions {
    public static void ArithmeticExceptionMethod(){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first no");
            int firstNo = sc.nextInt();
            System.out.println("Enter second No");
            int secondNo = sc.nextInt();
            System.out.println(firstNo/secondNo);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
    }

    public static void ArrayIndexOutOfBoundExceptionMethod(){
        try{
            int arr[] = new int[]{1,2,3,4};
            System.out.println("First " + arr[0]);
            System.out.println("second " + arr[1]);
            System.out.println("third " + arr[2]);
            System.out.println("fourth " + arr[3]);
            System.out.println("fifth " + arr[4]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bound");
        }
    }

    public static void NumberFormatExceptionMethod(){
        try{
            String n = "625q";
            int value = Integer.parseInt(n);
            System.out.println(value+5);
        }
        catch (NumberFormatException e){
            System.out.println("Number format exception");
        }
    }

    public static void ThrowableMethod(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        try{
            if(isEligible(age)){
                System.out.println("Vote please!!!");
            }
            else{
                System.out.println("Next time!!!");
            }
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    private static boolean isEligible(int age){
        if(age>=18){
            System.out.println("Eligible");
            return true;
        }
        else if(age>=0){
            System.out.println("Not eligible");
            return false;
        }
        throw new RuntimeException("Age cannot be negative value");
    }
}
