import java.util.Scanner;

/**
 * This program simulates a simple bank account transaction (credit or debit).
 * It demonstrates conditional logic (if-else) to handle different outcomes.
 */
public class BankAccount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get Initial Balance ---
        System.out.print("Enter the initial balance of the bank account: ");
        double balance = scanner.nextDouble();

        // --- Get Transaction Type ---
        System.out.print("Enter transaction type (1 for credit, 2 for debit): ");
        int transactionType = scanner.nextInt();

        // --- Get Transaction Amount ---
        System.out.print("Enter the transaction amount: ");
        double amount = scanner.nextDouble();

        // --- Process the Transaction ---
        if (transactionType == 1) {
            // Credit operation: Add the amount to the balance.
            balance += amount;
            System.out.println("Transaction successful.");
            System.out.println("The new balance is: " + balance);
        } else if (transactionType == 2) {
            // Debit operation: Subtract the amount if funds are sufficient.
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Transaction successful.");
                System.out.println("The new balance is: " + balance);
            } else {
                // If funds are not sufficient, print an error message.
                System.out.println("Insufficient Funds. The transaction was canceled.");
                System.out.println("The current balance is: " + balance);
            }
        } else {
            // Handle invalid transaction types.
            System.out.println("Invalid transaction type. Please enter 1 for credit or 2 for debit.");
        }

        scanner.close();
    }
}
