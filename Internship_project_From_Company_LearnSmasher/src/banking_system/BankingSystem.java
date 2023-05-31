package banking_system;

import java.util.*;

public class BankingSystem {
    private Map<Integer, BankAccount> accounts;

    public BankingSystem() {
        this.accounts = new HashMap<>();
    }

    public void createAccount() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String accountHolder = scanner.nextLine();
        System.out.print("Enter account mobile number: ");
        String mobileNumber = scanner.nextLine();
        System.out.print("Enter account email: ");
        String email = scanner.nextLine();
        System.out.print("Enter account address: ");
        String address = scanner.nextLine();
        System.out.print("Enter initial deposit amount: ");
        double initialDeposit = scanner.nextDouble();

        BankAccount account = new BankAccount(accountHolder, mobileNumber, email, address, initialDeposit);
        accounts.put(account.getAccountNumber(), account);
        System.out.println("Account created successfully. Account number: " + account.getAccountNumber());
    }

    public void viewAllAccounts() {
        System.out.println("Accounts List:");
        for (Map.Entry<Integer, BankAccount> entry : accounts.entrySet()) {
            BankAccount account = entry.getValue();
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Account Holder: " + account.getAccountHolder());
            System.out.println("Balance: " + account.getBalance());
            System.out.println();
        }
    }

    public BankAccount getAccount(int accountNumber) {
        return accounts.get(accountNumber);
    }

    public void depositBalance() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number for deposit: ");
        int accountNumber = scanner.nextInt();

        BankAccount account = getAccount(accountNumber);
        if (account != null) {
            System.out.print("Enter deposit amount: ");
            double depositAmount = scanner.nextDouble();
            account.deposit(depositAmount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdrawBalance() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number for withdrawal: ");
        int accountNumber = scanner.nextInt();

        BankAccount account = getAccount(accountNumber);
        if (account != null) {
            System.out.print("Enter withdrawal amount: ");
            double withdrawalAmount = scanner.nextDouble();
            account.withdraw(withdrawalAmount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void transferBalance() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter sender account number: ");
        int senderAccountNumber = scanner.nextInt();
        BankAccount senderAccount = getAccount(senderAccountNumber);

        if (senderAccount != null) {
            System.out.print("Enter recipient account number: ");
            int recipientAccountNumber = scanner.nextInt();
            BankAccount recipientAccount = getAccount(recipientAccountNumber);

            if (recipientAccount != null) {
                System.out.print("Enter transfer amount: ");
                double transferAmount = scanner.nextDouble();
                senderAccount.transfer(recipientAccount, transferAmount);
            } else {
                System.out.println("Recipient account not found.");
            }
        } else {
            System.out.println("Sender account not found.");
        }
    }

    public void balanceInquiry() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number for balance inquiry: ");
        int accountNumber = scanner.nextInt();

        BankAccount account = getAccount(accountNumber);
        if (account != null) {
            System.out.println("Account balance for " + account.getAccountHolder() + ": " + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }
}