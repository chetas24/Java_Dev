package Java_Inheritance.ex6;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(String AccNumber, double AccBalance)
    {
        // super helps in distinguishing and accessing the superclass version explicitly.
        // super ensures proper initialization of superclass fields and state before subclass-specific initialization.
        super(AccNumber, AccBalance);
    }

    @Override
    public void withdraw(double amount)
    {
        if (getBalance() - amount < 1000) {
            System.out.println("Minimum Balance Required is 1000rs");            
        }
        else
        {
            super.withdraw(amount); // super can even access method of superclass in subclass
        }
    }
}
