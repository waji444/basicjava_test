package JavaTest;

import java.util.Scanner;
//.Calculate tips for the check(eg . Java TipCalculator < check amoiunt > <%tips>)
public class tip {


	public static void main(String[] args) {
int check,tipp;

Scanner ab=new Scanner(System.in);
System.out.println("enter the bill amount");
check=ab.nextInt();
System.out.println("enter the tipp amount");
tipp=ab.nextInt();



System.out.println(" tip amount is  "+(check*tipp/100));
	}

}


