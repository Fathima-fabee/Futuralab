package Java_Package;

import java.util.Scanner;

public class Multiplication_pgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Enter the value of a");
		a = sc.nextInt();
		
		System.out.println("Enter the value of b");
		b = sc.nextInt();
		
		c = a*b;
		
		System.out.println("Product is : "+c);
	}

}
