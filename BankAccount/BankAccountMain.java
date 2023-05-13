import java.util.ArrayList;
import java.util.Scanner;

class BankAccountContinued {
    private double balance;
    private String accountHolder;
    private int accountNum;

    public BankAccountContinued(double balance, String accountHolder, int accountNum) {
        this.balance = balance;
        this.accountHolder = accountHolder;
        this.accountNum = accountNum;
    }

    public BankAccountContinued(){

    }
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        balance -= amount;
    }

    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getAccountHolder(){
        return accountHolder;
    }
    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }

    public int getAccountNum(){
        return accountNum;
    }
    public void setAccountNum(int accountNum){
        this.accountNum = accountNum;
    }

    public void transfer(BankAccountContinued a, double amount) {
        this.withdrawal(amount);
        a.deposit(amount);
    }
}

public class BankAccountMain {
    public static ArrayList<BankAccountContinued> accounts = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        accounts.add(new BankAccountContinued(5090, "Carlos", 0));
        accounts.add(new BankAccountContinued(9127, "Jerome", 1));
        accounts.add(new BankAccountContinued(6000, "Mia", 2));

        System.out.println("Hello world! Welcome to the Bank of Carlos!");
        System.out.println("Are you an existing costumer? (-1 to exit)");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int ans = input.nextInt();
        input.nextLine();

        while (true){
            if(ans != -1 && ans != 1 && ans != 2){
                System.out.println("Please enter a valid option");
                System.out.println("Are you an existing costumer? (-1 to exit)");
                System.out.println("1. Yes");
                System.out.println("2. No");
            } else {
                break;
            }
        }

        switch (ans) {
            case 1:
                System.out.println("What is your account number?");
                int accountNum = input.nextInt();
                if(accountNum > accounts.size()-1 || accountNum < 0) System.out.println("Sorry this account does not exist");
                mainMenu(accounts.get(accountNum));
            case 2:
                System.out.println("Let's make a new account!");
                BankAccountContinued a = new BankAccountContinued();
                accounts.add(a);
                a.setAccountNum(accounts.size()-1);
                System.out.println("What is the name for the account?");
                a.setAccountHolder(input.nextLine());
                System.out.println("What is the beginning balance for the account?");
                a.setBalance(input.nextDouble());
                mainMenu(a);
        }

    }

    public static void mainMenu(BankAccountContinued a){
        System.out.println("Hello " +a.getAccountHolder());
        System.out.println("Welcome to the Main Menu, what would you like to do today?");

        while (true) {
            System.out.println("1. To check account balance");
            System.out.println("2. To make a withdrawal");
            System.out.println("3. To make a deposit");
            System.out.println("4. To make a transfer to another account");
            System.out.println("0. To exit.");
            int answer = input.nextInt();
            input.nextLine();
            while(true){
                try {
                    if (answer != 0 && answer != 1 && answer != 2 && answer != 3 && answer != 4) {
                        System.out.println("Please enter a valid option");
                    } else {
                        break;
                    }
                } catch (Exception e){
                    System.out.println("Please enter a valid option");
                }
            }

            switch (answer){
                case 0:
                    break;
                case 1:
                    System.out.println("Account balance: " + a.getBalance());
                    break;
                case 2:
                    System.out.print("Withdrawal amount: ");
                    double amount;

                    while(true){
                        try{
                             amount = input.nextDouble();
                            break;
                        } catch (Exception e){
                            System.out.println("Enter a valid amount");
                        }
                    }
                    a.withdrawal(amount);
                    System.out.println("Withdrawal Successful!");
                    System.out.println("Your current balance is: " + a.getBalance());
                    break;
                case 3:
                    System.out.print("Deposit amount: ");
                    double depAmount;

                    while(true){
                        try{
                            depAmount = input.nextDouble();
                            break;
                        } catch (Exception e){
                            System.out.println("Enter a valid amount");
                        }
                    }
                    a.deposit(depAmount);
                    System.out.println("Deposite Successful!");
                    System.out.println("Your current balance is: " + a.getBalance());
                    break;
                case 4:
                    System.out.print("Enter the account number you would like to transfer to: ");
                    int num = input.nextInt();
                    input.nextLine();
                    double transAmount;

                    while (true){
                        try{
                            if(num > accounts.size()-1 || num < 0){
                                System.out.println("This account does not exist");
                                break;
                            }
                            System.out.print("Transfer amount: " );
                            while(true){
                                try{
                                    transAmount = input.nextDouble();
                                    input.nextLine();
                                    break;
                                } catch (Exception e){
                                    System.out.println("Enter valid amount");
                                }
                            }
                            a.transfer(accounts.get(num), transAmount);
                            System.out.println( a.getAccountHolder() + " Successfully transfered " + transAmount);
                            break;
                        }catch (Exception e){
                            System.out.println("Please enter a valid response.");
                        }
                    }

            }
        }
    }
}
