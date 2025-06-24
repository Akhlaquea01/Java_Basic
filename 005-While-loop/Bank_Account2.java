import java.util.*;

public class Bank_Account2 {
    /**
     * You are given a Bank account having N amount and you are asked to perfrom
     * ADD(credit) and SUBTRACT(debit) operations.
     * 
     * After each operation print the amount left in the Bank account. If the debit
     * amount is greater than current balance print "Insufficient Funds"(without
     * quotes) and the operation is skipped.
     * 
     * @Input First line contains a single integer N denoting the balance in bank
     *        account.
     * 
     *        Second line contains a single integer M denoting the number of
     *        operations.
     * 
     *        Each of next M lines contains two space separated integers Type
     *        and Amount(X).
     * 
     *        If Type == 1, Perform ADD operation.
     *        If Type == 2, Perform SUBTRACT operation.
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long Amount = scn.nextLong();
        long operations = scn.nextLong();
        int i = 1;
        while (i <= operations) {
            long type = scn.nextLong();
            long sum = scn.nextLong();
            if (type == 1) {
                Amount = Amount + sum;
                System.out.println(Amount);
            } else if (type == 2) {
                // Amount=Amount-sum;
                if (Amount >= sum) {
                    Amount = Amount - sum;
                    System.out.println(Amount);
                } else {
                    System.out.println("Insufficient Funds");
                }
            }
            i++;
        }
        scn.close();
    }
}
