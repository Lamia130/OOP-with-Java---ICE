/*Write a Java program that takes a number from the user and generates an integer between 1 to 7. It displays the weekday name.*/
import java.util.Scanner;
public class Lamia
{
	public static void main(String[] args)
	{
	int n;
	System.out.println("Write any number between 1 to 7:");
	Scanner Number=new Scanner(System.in);
	n=Number.nextInt();
	if(n==1)
	{
		System.out.println("Saturday");
	}
	else if(n==2)
	{
		System.out.println("Sunday");
	}
	else if(n==3)
	{
		System.out.println("Monday");
	}
	else if(n==4)
	{
		System.out.println("Tuesday");
	}
	else if(n==5)
	{
		System.out.println("Wednesday");
	}
	else if(n==6)
	{
		System.out.println("Thursday");
	}
	else if(n==7)
	{
		System.out.println("Friday");
	}
	else
	{
		System.out.println("Invalid Input");
	}
	Number.close();
	}
}
