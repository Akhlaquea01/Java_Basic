import java.util.*;

public class Percentage_and_Grade {
    /*
     * Write a program to calculate the percentage (according to marks of a student)
     * and grade (according to the percentage of a student). Five numbers(A, B, C, D
     * & E) represent the marks of a student in 5 subjects which are out of 100.
     * Print the percentage and the grade of the student.
     * 
     * If percentage >= 90% : Grade A
     * If percentage >= 80% but <90 : Grade B
     * If percentage >= 70% but <80: Grade C
     * If percentage >= 60% but <70: Grade D
     * If percentage >= 40% but <60: Grade E
     * If percentage < 40%: Grade F
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int B = scn.nextInt();
        int C = scn.nextInt();
        int D = scn.nextInt();
        int E = scn.nextInt();
        int sum = A + B + C + D + E;
        int percentage = (sum / 5);
        System.out.println(percentage);
        if (percentage >= 90) {
            System.out.println("A");
        } else if (percentage >= 80 && percentage < 90) {
            System.out.println("B");
        } else if (percentage >= 70 && percentage < 80) {
            System.out.println("C");
        } else if (percentage >= 60 && percentage < 70) {
            System.out.println("D");
        } else if (percentage >= 40 && percentage < 60) {
            System.out.println("E");
        } else {
            System.out.println("F");
        }
        scn.close();
    }
}
