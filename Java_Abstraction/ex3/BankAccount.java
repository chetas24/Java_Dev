package Java_Abstraction.ex3;

public abstract class BankAccount {
    private String accNumber;
    private double balance;

    public BankAccount(String accNumber, double balance)
    {
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public String getAccNumber()
    {
        return accNumber;
    }

    public double getBalance()
    {
        return balance;
    }

    protected void setBalance(double balance)
    {
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}
