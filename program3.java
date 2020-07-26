// Java program to find the largest and second largest of 3 numbers.
import java.util.Scanner;
public class program3
{
    	public static void main(String[] args) 
    	{
        	int x, y, z;
        	Scanner s = new Scanner(System.in);
        	System.out.print("Enter the first number:");
        	x = s.nextInt();
        	System.out.print("Enter the second number:");
        	y = s.nextInt();
        	System.out.print("Enter the third number:");
        	z = s.nextInt();
        	if(x > y && x > z)
        	{
            		System.out.println("Largest number is:"+x);
        	}
        	else if(y > z)
        	{
            		System.out.println("Largest number is:"+y);
        	}
        	else
        	{
            		System.out.println("Largest number is:"+z);
        	}
        	if(x>=y && x>=z)
        	{
        		if(y>=z)
        			System.out.println("Second largest is:"+y);
        		else
        			System.out.println("Second largest is:"+z);
        	}
        	else if(y>=x && y>=z)
        	{
        		if(x>=z)
        			System.out.println("Second largest is:"+x);
        		else
				System.out.println("Second largest is:"+z);
        	}
        	else if(x>=y)
       		{
        		System.out.println("Second largest is:"+x);
        	}
        	else
        	{
        		System.out.println("Second largest is:"+y);
        	}
 
    	}
}