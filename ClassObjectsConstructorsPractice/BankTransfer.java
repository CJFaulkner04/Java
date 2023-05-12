public class BankTransfer {
    private double balance;
    private String accountHolder;

    public BankTransfer(double balance, String accountHolder) {
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
        System.out.println(accountHolder+"'s account balance: " + balance);
    }
}

class Main1 {
    public static void main(String[] args) {
        BankTransfer account1 = new BankTransfer(5000, "Larry");
        BankTransfer account2 = new BankTransfer(300, "Mary");

        account1.withdrawal(100);
        account2.deposit(100);

        account1.printDetails();
        account2.printDetails();
    }
}