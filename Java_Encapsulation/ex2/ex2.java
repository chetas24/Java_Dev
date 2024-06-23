package Java_Encapsulation.ex2;

public class ex2 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(null, 0);
        bankAccount.setaccNum("SB-1723");
        bankAccount.setBalance(20000.0);

        String accountNumber = bankAccount.getaccNum();
        double balance = bankAccount.getBalance();
        System.out.println("Account Number - " + accountNumber);
        System.out.println("Balance - " + balance);
    }
}
