/* Implement a BankAccount class with attributes accountNumber,
holderName, and balance. Provide methods to deposit(), withdraw(), and displayBalance(). */

class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Balance after " + " Depositing " + amount + " is:" + balance);
        System.out.println("-------------------------");
    }

    public void withdraw(double a) {
        balance = balance - a;
        System.out.println("Withdrawn amunt is:" + a + " After withdrawn Balnace is: " + balance);
        System.out.println("-------------------");
    }

    public void displayBalance() {

        System.out.println("Remaining Balance is : " + balance);
        System.out.println("-------------");
    }
}

public class QnOne {
    public static void main(String[] args) {
        BankAccount sc = new BankAccount(12345, "Niraj Baniya", 1000.0);
        sc.deposit(500.0);
        sc.withdraw(600.0);
        sc.displayBalance();

    }
}