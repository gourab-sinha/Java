package Solutions.Module3;

import Solutions.Module3.Solutions.AccountType;
import Solutions.Module3.Solutions.BankAccount;
import Solutions.Module3.Solutions.CurrentAccount;
import Solutions.Module3.Solutions.SBAccount;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        int bankAccountNumberStart = 0;
        System.out.println("Which type of account you want to create?");
        System.out.println("Options are - 1. SBAccount 2. CurrentAccount 3. Exit");
        Scanner sc = new Scanner(System.in);
        int userChoice = sc.nextInt();
        while (true){
            if(userChoice==1 || userChoice==2) break;
            else if(userChoice==3) System.exit(0);
            else System.out.println("Invalid option");
            userChoice = sc.nextInt();
        }

        sc.nextLine();
        System.out.println("Enter your name");
        String userName = sc.nextLine();
        System.out.println("Enter month");
        int month = sc.nextInt();
        System.out.println("Enter year");
        int year = sc.nextInt();

        BankAccount userAccount;
        if(userChoice==1) userAccount = new SBAccount(userName,bankAccountNumberStart+"", month,year);
        else userAccount = new CurrentAccount(userName,bankAccountNumberStart+"", month,year);



        while(true){
            System.out.println("Here are the options that you can follow");
            System.out.println("1. Deposit amount");
            System.out.println("2. Withdraw amount");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");

            int choices = sc.nextInt();
            switch (choices){
                case 1:
                    System.out.println("Enter amount that you want to deposit");
                    double amount = sc.nextDouble();
                    userAccount.deposit(amount);
                    break;
                case 2:
                    System.out.println("Enter amount that you want to withdraw");
                    amount = sc.nextDouble();
                    System.out.println("Enter month");
                    month = sc.nextInt();
                    System.out.println("Enter year");
                    year = sc.nextInt();
                    System.out.println("Withdraw amount: " + userAccount.withdrawal(amount,month,year));
                    break;

                case 3:
                    System.out.println(userAccount.getTotalAmount());
                    break;

                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid option selected");
                    break;
            }
        }

    }
}
