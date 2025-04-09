/*Create a BankAccount class with a default constructor and a parameterized constructor. 
The default constructor should initialize with a balance of 0,
while the parameterized one should allow the user to specify the balance. */


class Q14_BankAccount {
    private double balance;

    public Q14_BankAccount() {
        this.balance = 0; 
    }

    public Q14_BankAccount(double balance) {
        this.balance = balance; 
    }

    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Q14_BankAccount account1 = new Q14_BankAccount();
        Q14_BankAccount account2 = new Q14_BankAccount(1000);
        account1.displayBalance(); // Should show 0
        account2.displayBalance(); // Should show 1000
    }
}