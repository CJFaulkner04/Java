public class BankAccount {
    private double balance;
    private String accountHolder;

    public BankAccount(double balance, String accountHolder) {
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        balance -= amount;
    }

    public void printDetails() {
        System.out.println("My Account Balance: $" + balance);
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(500, "John Smith");
        myAccount.deposit(100);
        myAccount.printDetails();
    }
}