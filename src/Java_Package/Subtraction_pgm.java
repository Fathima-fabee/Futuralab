package Java_Package;

import java.util.Scanner;

public class Subtraction_pgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Enter the first number");
		num1 = sc.nextInt();
		System.out.println("Enter the second number");
		num2 = sc.nextInt();
		num3 = num1 - num2;
		System.out.println("The diffrenece is "+num3);
	}

}
