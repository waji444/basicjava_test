package JavaTest;

import java.util.Scanner;
//6.Check whether an alphabet is vowel or consonant using switch statement
public class vowel {

	
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter a character : ");
	char ch=scanner.next().charAt(0); 
	scanner.close();
	
	
	        switch(ch)
	    	{
	    	   case 'a' :
	    	   case 'e' :
	           case 'i' :
	    	   case 'o' :
	    	   case 'u' :
	    	   case 'A' :
	    	   case 'E' :
	    	   case 'I' :
	    	   case 'O' :
	    	   case 'U' :
	    	   
	            System.out.println(ch + " is vowel");
	        default:
	            System.out.println(ch + " is consonant");}
}

}


