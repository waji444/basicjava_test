package JavaTest;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		 int year;
	        boolean leap = false;
	        Scanner ab=new Scanner(System.in);
	        System.out.println("enter year");
	        year=ab.nextInt();

	      //  if(year % 4 == 0)
	        {
	       //     if( year % 100 == 0)
	           {
	               
	                if ( year % 400 == 0) {
	                    leap = true; 
	                System.out.println("it is a leap year"); }
	                    else
	                    leap = false; {
	                System.out.println("its not a leap year");
	                    }
	            }
	        //    else
	          //     System.out.println("yes");
	        }
	     //   else
	        //	System.out.println("No");

	    }
	
	}


