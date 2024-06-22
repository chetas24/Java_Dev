package Java_Inheritance.ex6;

public class BankAccount {
    @SuppressWarnings("unused")
    private String AccNumber;
    private double AccBalance;

    public BankAccount(String AccNumber, double AccBalance)
    {
        this.AccNumber = AccNumber;
        this.AccBalance = AccBalance;
    }

    public void deposit(double amount)
    {
        AccBalance += amount;
    }

    public void withdraw(double amount)
    {
        if (AccBalance >= amount) { 
            AccBalance -= amount;
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }

    public double getBalance()
    {
        return AccBalance;
    }
}
