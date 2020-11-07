package Solutions.Module1.Solutions;

import java.util.Scanner;

public class DoWhileLoop {
    public static void doWhileLoop(){
        System.out.println("10 Even numbers");
        int i = 1;
        do{
            if(i%2==0) System.out.println(i);
            i++;
        }while(i<=20);

        System.out.println("10 Odd numbers");
        i = 1;
        do{
            if(i%2==1) System.out.println(i);
            i++;
        }while(i<=20);

        System.out.println("Enter number to find factorial: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long factorial = 1;
        i = 1;
        do{
            factorial*=i;
            i++;
        }while(i<=num);
        System.out.println("Factorial of " + num + " is " + factorial);

        System.out.println("Table of 10");
        i = 1;
        do{
            System.out.println(10 + " x " + i + " = " + (10*i));
            i++;
        }while(i<=10);

        System.out.println("Enter number to see the digit sum");
        num = sc.nextInt();
        int digitSum = 0;
        int currNum = num;
        i = 10;
        do{
            digitSum += num%i;
            num /= i;
        }while(num > 0);
        System.out.println("Digit sum of " + currNum + " is " + digitSum);

        System.out.println("Enter number to reverse its digit");
        num = sc.nextInt();
        int newNum = 0;
        currNum = num;
        i = 10;
        do{
            newNum = newNum*i + num%i;
            num /= i;
        }while(num > 0);
        System.out.println("Digit reverse of num " + currNum + " is " + newNum);

        System.out.println("10 Fibonacci numbers");
        int firstNumber = 0;
        int secondNumber = 1;
        i = 1;
        do{
            System.out.println("Fibonacci " + i + " is " + secondNumber);
            int temp = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
            i++;
        }while(i<=10);
    }
}
