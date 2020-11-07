package Module3.ClassObjects;

public class Employee {
    private String name;
    private String accountNo;
    private String address;

    public Employee(){}
    public Employee(String name, String accountNo, String address){
        this.name=name;
        this.accountNo=accountNo;
        this.address=address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getAddress() {
        return address;
    }
}
