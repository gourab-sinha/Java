package Solutions.Module3.Solutions;

public class CurrentAccount extends BankAccount{
    private int month=-1;
    private int year=-1;
    private final double minimalAmount = 10.0;

    public CurrentAccount(String name, String accountNo, int month, int year) {
        super(name, accountNo);
        if(month<=0 || year<2020){
            throw new RuntimeException("You cannot set have month as 0 or year less than 2020");
        }
        this.month=month;
        this.year=year;
    }

    @Override
    public void deposit(double amount) {
        if(amount>0){
            this.totalAmount+=amount;
            System.out.println("Successfully added to your account!!!");
        }
        System.out.println("You cannot deposit 0 or negative amount!!!");
    }

    @Override
    public double withdrawal(double amount, int month, int year) {
        if(amount>0 && (this.month>month && this.year<year) || (this.month<=month && this.year<=year)){
            if(this.totalAmount-amount >= this.minimalAmount){
                System.out.println("Amount debited");
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
