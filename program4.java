// Java Program to find the sum of all odd number.
import java.util.Scanner;
public class program4
{
	public static void main(String[] args) 
	{
		int number, i, oddSum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter any Number : ");
		number = sc.nextInt();
		for(i = 1; i <= number; i++)
		{
			if(i % 2 != 0)
			{
				oddSum = oddSum + i; 
			}
		}
		System.out.println("\n The Sum of Odd Numbers upto " + number + "  =  " + oddSum);
	}
}
