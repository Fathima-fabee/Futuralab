package Java_Package;

import java.util.Scanner;

public class largest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter the first number:");
		a = sc.nextInt();
		System.out.println("Enter the second number: ");
		b = sc.nextInt();
		if (a>=b) {
			System.out.println(a+" is the largest number");
		}else {
			System.out.println(b+ " is the largest number");
		}
	}

}
