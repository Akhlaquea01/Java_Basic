import java.util.*;

public class Bank_Account {
    /**
     * You are given a Bank account having N amount and you are asked to perform
     * ADD(credit) or SUBTRACT(debit) operation of an amount X.
     * 
     * After the operation print the amount left in the Bank account. If the debit
     * amount is greater than current balance print "Insufficient Funds"(without
     * quotes) and the operation is skipped.
     * 
     * @Input First line contains a single integer N denoting the balance in bank
     *        account.
     *        Next line contains two space separated integers Type and Amount(X).
     *        If Type == 1, Perform ADD operation.
     *        If Type == 2, Perform SUBTRACT operation.
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int Amount = scn.nextInt();
        int operation = scn.nextInt();
        int sum = scn.nextInt();
        if (operation == 1) {
            System.out.print(Amount + sum);
        } else {
            if ((Amount - sum) < 0) {
                System.out.print("Insufficient Funds");
            } else {
                System.out.print(Amount - sum);
            }
        }
        scn.close();
    }
}
