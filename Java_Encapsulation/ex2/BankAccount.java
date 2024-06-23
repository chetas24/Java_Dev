package Java_Encapsulation.ex2;

public class BankAccount {
    private String accountNum;
    private double balance;

    public BankAccount(String accountNum, double balance)
    {
        this.accountNum = accountNum;
        this.balance = balance;
    }

    public String getaccNum()
    {
        return accountNum;
    }

    public void setaccNum(String accountNum)
    {
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }                                           
}
