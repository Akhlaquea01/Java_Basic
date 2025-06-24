
import java.util.*;

public class If_else {
	public static void main(String args[]) {
		// Write your code here
		Scanner scn = new Scanner(System.in);
		// Q1 : Check if person is eligible to vote
		int age = scn.nextInt();
		if (age >= 18) {
			System.out.print("Eligible to vote");
		} else {
			System.out.print("Not eligible to vote");
		}

		/*
		 * Q2: Given two numbers return the max of them.
		 * Ex: 4, 7
		 * ans => 7 is greater
		 */

		int x = scn.nextInt();
		int y = scn.nextInt();

		if (x > y) {
			System.out.print(x + " is greater");
		} else if (x < y) {
			System.out.print(y + " is greater");
		} else {
			System.out.print("Both are equal");
		}

		// x>y, x<y, x==y

		/*
		 * Q3: Given two numbers return the min of them.
		 * Ex: 4, 7
		 * ans => 4 is smaller than 7
		 * 
		 * Ex: 6, 6
		 */

		int a = scn.nextInt();
		int b = scn.nextInt();

		if (a < b) {
			System.out.print(a + " is smaller than " + b);
		} else if (b < a) {
			System.out.print(b + " is smaller than " + a);
		} else {
			System.out.print("Both are equal");
		}

		/*
		 * Q4: Read the temperature(Fahrenheit) of a person and
		 * print if he has fever, optimum tem or
		 * below optimum temperature.
		 * 
		 * [98.2, 98.9] => Person doesn't have fever
		 * 
		 * Ex: 101.5 => Person has fever
		 * Ex: 96.9 => Person has a low temperature
		 * 
		 * 0, 98.2,....98.9,
		 * 
		 */

		double tmp = scn.nextFloat();
		if (tmp > 98.9) {
			// // All values of tmp above 98.9 will come here
			System.out.print("Person has fever");
		} else if (tmp < 98.2) {
			// // All values of tmp below 98.2 will come here
			System.out.print("Person has low temperature");
		} else {
			// // All values of tmp from 98.2 to 98.9 will come here
			System.out.print("Person doesn't have fever");
		}

		/*
		 * Q6: Given a number. Return true if it is divisible by 4.
		 */
		int numberToCheck = scn.nextInt();
		if (numberToCheck % 4 == 0) {
			System.out.print(numberToCheck + " is divisible by 4");
		} else {
			System.out.print(numberToCheck + " is not divisible by 4");
		}

		/*
		 * Q7: Given a number check if it is odd or even.
		 * 
		 * Ex: 19 => odd
		 * 22 => even
		 */

		// x%2=0 is True -> Number is divible by 2 -> Even numbers
		// x%2=1 is True -> Number is not divisible by 2 -> Odd numbers

		int isEven = scn.nextInt();
		if (isEven % 2 == 0) {
			System.out.print(isEven + " is even");
		} else {
			System.out.print(isEven + " is odd");
		}

		/*
		 * Q8[Amazon]: FizzBuzz
		 * Given a number, print fizz if it divisible by 3,
		 * print buzz if it is divisible by 5
		 * print fizz-buzz if it is divisible by both 3 and 5
		 */

		// conditions -> True / False
		// Logical operators

		// Logical And operator
		// condition1 && condition2
		// True if both condition1 and condition2 are true
		// Else it is false
		// True && True -> True
		// True && False -> False
		// False && True -> False
		// False && False -> False

		// Logical Or operator
		// condition1 || condition2
		// True if either of condition1 or condition2 is true
		// If both are false then false
		// True || True -> True
		// True || False -> True
		// False || True -> True
		// False || False -> False

		int fizBizInput = scn.nextInt();
		if (fizBizInput % 3 == 0 && fizBizInput % 5 == 0) {
			System.out.print("fizz-buzz");
		} else if (fizBizInput % 3 == 0) {
			System.out.print("fizz");
		} else if (fizBizInput % 5 == 0) {
			System.out.print("buzz");
		}

		// 15 -> Output will be fizz
		scn.close();
	}
}
