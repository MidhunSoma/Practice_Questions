//Write a Java program to check if a given year is a leap year using the ternary operator? //
 
import java.util.Scanner;
class Leapyear
{
 public static void main(String args[])
 {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter year:");
	int y=sc.nextInt();
	String s= ((y%4==0 && y%100!=0)||y%400==0)?"LeapYear":"NotLeapYear";
	System.out.println(s);
	
 }
}


