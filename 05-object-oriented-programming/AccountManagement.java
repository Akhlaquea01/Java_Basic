/**
 * This class is used to demonstrate the creation and use of Account objects.
 * It serves as the entry point of the program.
 */
public class AccountManagement {

    public static void main(String[] args) {

        // --- Create an Account using the constructor with all parameters ---
        System.out.println("--- Creating Bob's Account ---");
        Account bobsAccount = new Account("12345", 500,
                "Bob Brown", "myemail@bob.com",
                "(087) 123-4567");

        // --- Accessing Account Information using Getters ---
        System.out.println("\n--- Initial Account Details ---");
        System.out.println("Account Number: " + bobsAccount.getNumber());
        System.out.println("Initial Balance: " + bobsAccount.getBalance());

        // --- Performing Transactions ---
        System.out.println("\n--- Performing Transactions ---");
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(100.0);
        bobsAccount.withdrawFunds(500.0); // This should fail due to insufficient funds.

        // --- Create another Account using a different constructor ---
        System.out.println("\n--- Creating Tim's Account ---");
        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
        System.out.println("AccountNo: " + timsAccount.getNumber() +
                "; Name: " + timsAccount.getCustomerName());
    }
}
