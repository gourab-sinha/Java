package Solutions.Module3.Solutions;

public abstract class BankAccount {
    public String name;
    public String accountNo;
    public double totalAmount;


    public BankAccount(String name, String accountNo){
        this.name=name;
        this.accountNo=accountNo;
        this.totalAmount=0;
    }

    public abstract void deposit(double amount);
    public abstract double withdrawal(double amount, int month, int year);


    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getName() {
        return name;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

}

