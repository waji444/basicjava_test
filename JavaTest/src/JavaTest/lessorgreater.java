package JavaTest;

import java.util.Scanner;

public class lessorgreater {

	
	public static void main(String[] args) {
		//1.Take input from the user and Print
		//if the number is less than or greater than 100 using Ternary Operator
		int a;
		Scanner ab=new Scanner(System.in);
		System.out.println("enter the number");
		a=ab.nextInt();
		String x=a<100?"a<100":"a>100";
			System.out.println(x);
		}
			
		
}

