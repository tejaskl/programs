// Java program to generate the following series 1, 1, 2, 3, 5, 8, 13, 21, 34, …., N.
import java.util.Scanner;
public class program6B
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of terms");
		int n=sc.nextInt();
		int i=0,j=1,nextTerm;
		System.out.println("Fibonacci series is ");
		for(int k=1;k<n;k++)
		{
			if(k<=1)
				nextTerm=k;
			else
			{
				nextTerm=i+j;
				i=j;
				j=nextTerm;
			}
			System.out.println(nextTerm);
		}
	}

}
