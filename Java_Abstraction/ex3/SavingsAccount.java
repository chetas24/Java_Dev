package Java_Abstraction.ex3;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(String accNumber, double balance)
    {
        super(accNumber, balance);
    }

    @Override
    public void deposit(double amount)
    {
        setBalance(getBalance() + amount);
        System.out.println("Deposit of $" + amount + " Successful. Current balance: $" + getBalance());
    }

    @Override
    public void withdraw(double amount)
    {
        if(getBalance() >= amount)
        {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal of $" + amount + " Successful. Current Balance: $" + getBalance());
        }
        else
        {
            System.out.println("Insufficient Balance....");
        }
    }
}
