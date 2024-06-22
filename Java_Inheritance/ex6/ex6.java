package Java_Inheritance.ex6;

public class ex6 {
    public static void main(String[] args) {
        BankAccount BA12345 = new BankAccount("BA12345", 5000);
        System.out.println("Deposit 10000 into account BA12345: ");
        BA12345.deposit(10000);
        System.out.println("New Balance after depositing 10000rs: " + BA12345.getBalance());
        BA12345.withdraw(6000);
        System.out.println("New Balance after Withdrawing 6000rs: " + BA12345.getBalance());

        System.out.println("\n");
        SavingsAccount SA12345 = new SavingsAccount("SA12345", 4500);
        SA12345.withdraw(3000);
        System.out.println("Balance after trying to withdraw 3000rs: " + SA12345.getBalance());
        SA12345.withdraw(2500);
        System.out.println("Balance after trying to withdraw 2500rs: " + SA12345.getBalance());
    }
}
