package leapyear;
//5.Take a year as input and Print the year is leap year or not a 
//leap year using Nested-if else statement
//year is divisible by 400
import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		 int year;
	        boolean leap = false;
	        Scanner ab=new Scanner(System.in);
	        System.out.println("enter year");
	        year=ab.nextInt();

	        if(year % 4 == 0)
	        {
	            if( year % 100 == 0)
	            {
	               
	                if ( year % 400 == 0)
	                    leap = true;
	                else
	                    leap = false;
	            }
	            else
	               System.out.println("yes");
	        }
	        else
	        	System.out.println("No");

	    }
	
	}


