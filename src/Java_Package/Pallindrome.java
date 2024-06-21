package Java_Package;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner sc = new Scanner(System.in);
	int a,b,r,sum=0;
	System.out.println("Enter the number");
	a = sc.nextInt();
	b = a;
	while(b>0)
	{
		r = b%10;
		sum = sum*10 + r;
		b=b/10;
	}
	System.out.println("The palindrome number is " +sum);
}
}