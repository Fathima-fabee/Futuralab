package Java_Package;

import java.util.Scanner;

public class Full_name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String fn,mn,ln;
		
		System.out.println("Enter your first name");
		fn= sc.nextLine();
		
		System.out.println("Enter your middle name");
		mn= sc.nextLine();
		
		System.out.println("Enter your last name");
		ln= sc.nextLine();
		
		System.out.println("Your Full Name is :"+fn+" " +mn+ " " +ln);
		
		

	}

}
