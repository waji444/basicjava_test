package JavaTest;

import java.util.Scanner;

public class weird {

	/*Given an integer, n, perform the following conditional actions : 1. 
	if n is odd, print 'Weird' 2. if n is even and in the inclusive range of 2 
	to 5 print 'Not Weird' 3. if n is even and in the inclusive range of 6 to 20 
	print 'Weird' 4.if n is even and greater than 20 print 'Not Weird'*/

public static void main(String[] args) {
int n;
Scanner ab=new Scanner(System.in);
n=ab.nextInt();
if(n%2!=0) {

System.out.println("weird"); }
 
else if (n>=2&&n<=5)
{
    System.out.println("Not Weird");
    }
else if(n>=6&&n<=20)
{
System.out.println(" Weird");}


}
}