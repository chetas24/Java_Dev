package Java_Abstraction.ex3;

public class ex3 {
    public static void main(String[] args) {
        double ibal, damt, wamt;
        ibal = 1000.0;
        SavingsAccount savingsAccount = new SavingsAccount("SA12345", ibal);
        System.out.println("Saving A/c: Initial Balance: $" + ibal);

        damt = 500;
        savingsAccount.deposit(damt);
        wamt = 250;
        savingsAccount.withdraw(wamt);
        wamt = 10000;
        savingsAccount.withdraw(wamt);

        System.out.println();
        ibal = 1500.0;
        CurrentAccount currentAccount = new CurrentAccount("CA12345", ibal);
        System.out.println("Current A/c: Initial Balance: $" + ibal);

        damt = 500;
        currentAccount.deposit(damt);
        wamt = 1000;
        currentAccount.withdraw(wamt);
    }
}
