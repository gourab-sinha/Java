package ModuleOne.Assignment;

import java.util.Scanner;

public class ForLoop {
    public static void forLoop(){
        System.out.println("10 Even numbers");
        for(int i=1; i<=20;i++){
            if(i%2==0) System.out.println(i);
        }

        System.out.println("10 Odd numbers");
        for(int i=1; i<=20;i++){
            if(i%2==1) System.out.println(i);
        }

        System.out.println("Enter number to find factorial: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long factorial = 1;
        for(int i=1;i<=num;++i){
            factorial*=i;
        }
        System.out.println("Factorial of " + num + " is " + factorial);

        System.out.println("Table of 10");
        for(int i=1;i<=10;i++){
            System.out.println(10 + " x " + i + " = " + (10*i));
        }

        System.out.println("Enter number to see the digit sum");
        num = sc.nextInt();
        int digitSum = 0;
        int currNum = num;
        for(int i=10; num >0;){
            digitSum += num%i;
            num /= i;
        }
        System.out.println("Digit sum of " + currNum + " is " + digitSum);

        System.out.println("Enter number to reverse its digit");
        num = sc.nextInt();
        int newNum = 0;
        currNum = num;
        for(int i=10; num > 0;){
            newNum = newNum*i + num%i;
            num /= i;
        }
        System.out.println("Digit reverse of num " + currNum + " is " + newNum);

        System.out.println("10 Fibonacci numbers");
        int firstNumber = 0;
        int secondNumber = 1;
        for(int i=1; i<=10; i++){
            System.out.println("Fibonacci " + i + " is " + secondNumber);
            int temp = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }
    }
}
