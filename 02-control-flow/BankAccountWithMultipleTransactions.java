import java.util.Scanner;

/**
 * This program simulates a bank account that can handle multiple transactions.
 * It demonstrates the use of loops to process a series of operations.
 */
public class BankAccountWithMultipleTransactions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get Initial Balance ---
        System.out.print("Enter the initial balance: ");
        double balance = scanner.nextDouble();

        // --- Get Number of Transactions ---
        System.out.print("Enter the number of transactions to perform: ");
        int numberOfTransactions = scanner.nextInt();

        // --- Process Each Transaction in a Loop ---
        for (int i = 1; i <= numberOfTransactions; i++) {
            System.out.println("\n--- Transaction #" + i + " ---");

            // Get transaction type.
            System.out.print("Enter transaction type (1 for credit, 2 for debit): ");
            int transactionType = scanner.nextInt();

            // Get transaction amount.
            System.out.print("Enter the amount: ");
            double amount = scanner.nextDouble();

            // Process the transaction based on its type.
            if (transactionType == 1) {
                balance += amount;
                System.out.println("Credit successful. New balance: " + balance);
            } else if (transactionType == 2) {
                if (amount <= balance) {
                    balance -= amount;
                    System.out.println("Debit successful. New balance: " + balance);
                } else {
                    System.out.println("Insufficient Funds. Transaction canceled.");
                }
            } else {
                System.out.println("Invalid transaction type. Transaction skipped.");
            }
        }

        // --- Final Balance ---
        System.out.println("\nAll transactions are complete.");
        System.out.println("The final balance is: " + balance);

        scanner.close();
    }
}
