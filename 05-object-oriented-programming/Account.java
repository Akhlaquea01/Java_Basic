/**
 * This class represents a bank account and demonstrates the principles of encapsulation.
 * Encapsulation is the practice of bundling data (fields) and the methods that operate on that data
 * within a single unit (the class). It helps in hiding the internal state of an object from the outside.
 */
public class Account {

    // --- Fields (Instance Variables) ---
    // These are the properties of an Account object. They are declared as 'private'
    // to ensure they can only be accessed and modified through the methods of this class.
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    // --- Constructors ---
    // A constructor is a special method used to initialize objects.

    /**
     * A no-argument constructor that calls another constructor with default values.
     * This is an example of constructor chaining.
     */
    public Account() {
        this("56789", 2.50, "Default name", "Default address", "Default phone");
        System.out.println("Empty constructor called.");
    }

    /**
     * A constructor that initializes customer details with default balance.
     * This is useful when creating a new account with just basic customer information.
     */
    public Account(String customerName, String email, String phone) {
        this("00000", 0.0, customerName, email, phone);
        System.out.println("Account constructor with customer details called.");
    }

    /**
     * A constructor that initializes all the fields of the Account.
     */
    public Account(String number, double balance, String customerName, String email, String phone) {
        System.out.println("Account constructor with parameters called.");
        // 'this' keyword is used to refer to the current object's fields.
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = email;
        this.customerPhone = phone;
    }

    // --- Methods (Behaviors) ---
    // These define the actions that can be performed on an Account object.

    /**
     * Deposits funds into the account.
     *
     * @param depositAmount The amount to be deposited.
     */
    public void depositFunds(double depositAmount) {
        if (depositAmount > 0) {
            balance += depositAmount;
            System.out.println("Deposit of $" + depositAmount + " made. New balance is $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    /**
     * Withdraws funds from the account, with a check for sufficient balance.
     *
     * @param withdrawalAmount The amount to be withdrawn.
     */
    public void withdrawFunds(double withdrawalAmount) {
        if (withdrawalAmount > 0) {
            if (balance - withdrawalAmount < 0) {
                System.out.println("Insufficient Funds! You only have $" + balance + " in your account.");
            } else {
                balance -= withdrawalAmount;
                System.out.println("Withdrawal of $" + withdrawalAmount + " processed. Remaining balance = $" + balance);
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // --- Getters and Setters ---
    // These are public methods used to access and modify the private fields.

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
