package banking_system;

public class BankAccount {
    private static int nextAccountNumber = 10001;

    private int accountNumber;
    private String accountHolder;
    private String mobileNumber;
    private String email;
    private String address;
    private double balance;

    public BankAccount(String accountHolder, String mobileNumber, String email, String address, double initialDeposit) {
        this.accountNumber = nextAccountNumber++;
        this.accountHolder = accountHolder;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.address = address;
        this.balance = initialDeposit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " successfully. Current balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " successfully. Current balance: " + balance);
        }
    }

    public void transfer(BankAccount recipient, double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            recipient.balance += amount;
            System.out.println("Transferred " + amount + " successfully to " + recipient.accountHolder + ". Current balance: " + balance);
        }
    }
}