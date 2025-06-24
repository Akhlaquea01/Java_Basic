import java.util.*;

class Main {
	public static void main(String args[]) {

		System.out.print("Hello World!"); // English, Syntax
		System.out.print(10); // Numbers, Syntax

		// Case-sensitive
		System.out.print("5+10");
		System.out.print("20+3");

		// Predict the output
		// system.out.print(5+10)
		// 15 -> Wrong
		// 5+10 -> Wrong
		// Error -> Correct

		System.out.print("Hello" + "World");
		// HelloWorld -> Concatenation

		System.out.print("Hello " + "World");
		// Hello World

		System.out.print("Hello" + 10);
		// Hello10

		System.out.print("Hello " + 10);

		System.out.println("Name : Aarnav");
		System.out.print("Age : 50");

		System.out.print("10");

		System.out.println(10 + 20 + "Hello");
		// 10 + 20 -> 30
		// 30 + Hello
		// 30Hello
		System.out.println("Hello" + 10 + 20);
		// "Hello" + 10
		// "Hello10" + 20
		// "Hello1020"

		// int x;
		// x = 10;
		int x = 10;
		System.out.println(x);

		double y;
		y = 1.58;
		System.out.println(y);

		float f;
		f = 1.4f;
		System.out.println(f);

		long l;
		l = 1000000000000l;
		System.out.println(l);

		// Scanner is used to take input from user
		Scanner scn = new Scanner(System.in);
		int inputX;
		// Input
		inputX = scn.nextInt();
		// Otutput
		System.out.print(inputX);

		long inputY;
		inputY = scn.nextLong();
		System.out.print(inputY);

		float v;
		v = scn.nextFloat();
		System.out.print(v);

		double z;
		z = scn.nextDouble();
		System.out.print(z);

		int a;
		float b;
		a = scn.nextInt();
		b = scn.nextFloat();
		System.out.println(a);
		System.out.println(b);

		// Close the scanner when finished
		scn.close();
	}
}