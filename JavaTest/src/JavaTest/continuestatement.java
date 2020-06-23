package JavaTest;

public class continuestatement {

	
	//Write a program to print year from 1 to 4000 except leap years using Continue statement.
	
		public static void main(String[] args) {
			
			int  year;
			for(year=1;year<4000;year++) {

		            // if value of i is between 4 and 9, continue is executed 
		            if(year % 4 == 0) {
		                continue;
		                
		            }      
		            System.out.println(year);
		
		
		}
	}
	}

