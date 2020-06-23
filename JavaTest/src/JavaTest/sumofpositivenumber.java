package JavaTest;
import java.util.Scanner;


public class sumofpositivenumber {

	
	//Write a program to input indefinite numbers and then calculate the sum of only the positive numbers.
	//The program terminates when negative numbers is input

	


		public static void main(String[] args) {
		int a=1,s=0,n;
		Scanner ob=new Scanner(System.in);
		
		while(a<100000) {
		
		       System.out.println("print any number");
		       n=ob.nextInt();
		       if (n<0)
		    	   break;

