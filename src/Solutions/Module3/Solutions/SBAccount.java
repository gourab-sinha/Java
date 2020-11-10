package Solutions.Module3.Solutions;

import java.time.LocalDateTime;

public class SBAccount extends BankAccount{
    private final double minimalAmount = 5.0;
    private final double interestRate = 4.0;
    private int month = -1;
    private int year = -1;

    public SBAccount(String name, String accountNo, int month, int year){
        super(name,accountNo);
        if(month<=0 || year<2020){
            throw new RuntimeException("You cannot set have month as 0 or year less than 2020");
        }
        this.month=month;
        this.year=year;
    }

    @Override
    public void deposit(double amount) {
        if(amount < 0){
            System.out.println("You cannot deposit negative amount");
            return;
        }

        this.totalAmount+=amount;
        System.out.println("Thank you, your account has been credited with " + amount);
    }

    @Override
    public double withdrawal(double amount, int month, int year) {
        if(amount>0 && (this.month>month && this.year<year) || (this.month<=month && this.year<=year)){
            if(this.year<=year){
                int monthDifference = 0;
                if(this.month <= month){
                    monthDifference = (month - this.month) + (year - this.year)*12;
                }
                else if(month < this.month ){
                    month += 12;
                    year-=1;
                    monthDifference = (month - this.month) + (year - this.year)*12;

                }
                this.totalAmount += (this.interestRate*this.totalAmount*monthDifference)/100;
            }

            if(this.totalAmount-amount>=this.minimalAmount){
                System.out.println("Amount  from your account");
                this.totalAmount-=amount;
                return amount;
            }
            else{
                System.out.println("You cannot withdraw amount as minimum balance " + this.minimalAmount
                        + " should be available in your account");
                return 0.0;
            }
        }
        System.out.println("Amount cannot be debited as you may have entered " +
                "negative amount or invalid month and year");
        return 0.0;
    }

}
