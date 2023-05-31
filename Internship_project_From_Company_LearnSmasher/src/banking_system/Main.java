package banking_system;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        BankingSystem bankingSystem = new BankingSystem();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Create Account");
            System.out.println("2. View All Accounts");
            System.out.println("3. Deposit Balance");
            System.out.println("4. Withdraw Balance");
            System.out.println("5. Transfer Balance");
            System.out.println("6. Balance Inquiry");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bankingSystem.createAccount();
                    break;
                case 2:
                    bankingSystem.viewAllAccounts();
                    break;
                case 3:
                    bankingSystem.depositBalance();
                    break;
                case 4:
                    bankingSystem.withdrawBalance();
                    break;
                case 5:
                    bankingSystem.transferBalance();
                    break;
                case 6:
                    bankingSystem.balanceInquiry();
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
