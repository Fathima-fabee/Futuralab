package Java_Package;

import java.util.Scanner;

public class Addition_pgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		
		System.out.println("Enter Second number");
		int b = sc.nextInt();
	
		int Sum = a + b;
		
 System.out.println("Sum of two number is " + Sum);
	}

}
