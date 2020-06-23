package JavaTest;

import java.util.Scanner;

public class logical {

	public static void main(String[] args) {
		//	2.Take a number from user and Print if the number is less than 200 and even number 
	    //otherwise print invalid number using Logical Operator
			int a;
		Scanner ab=new Scanner(System.in);
		System.out.println("enter the number");
		a=ab.nextInt();
			
			
		if(a<200 & a%2==0) {
			System.out.println("true"); }
		else 
			System.out.println("invalid number");
			
			
			
			
		}

	}
	

