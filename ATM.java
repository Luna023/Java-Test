package JavaTest1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class ATM {
    private Map<String, Account> accounts;

    public ATM() {
        accounts = new HashMap<>();
    }

    public void addAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
    }

    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    public void start() {
        try (Scanner scanner = new Scanner(System.in)) {  
            while (true) {
                System.out.println("ATM Management System");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");

                int choice = scanner.nextInt();
                if (choice == 4) {
                    break;
                }

                System.out.print("Enter Account Number: ");
                String accountNumber = scanner.next();

                Account account = getAccount(accountNumber);
                if (account == null) {
                    System.out.println("Account not found.");
                    continue;
                }

                // Use accountHolderName here
                System.out.println("Account Holder: " + account.getAccountHolderName());

                switch (choice) {
                    case 1:
                        System.out.println("Current Balance: " + account.checkBalance());
                        break;
                    case 2:
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                        System.out.println("Deposited successfully.");
                        break;
                    case 3:
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = scanner.nextDouble();
                        if (account.withdraw(withdrawAmount)) {
                            System.out.println("Withdrawal successful.");
                        } else {
                            System.out.println("Insufficient funds.");
                        }
                        break;
                    default:
                        System.out.println("Invalid choice, please try again.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
