// Java program to generate the following series 1, -2, 4, -6, 7, -10, 10, -14, …., N.
import java.util.Scanner;
public class program6D 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of terms");
		int n=sc.nextInt();
		int a[],b[];
		a=new int[20];
		b=new int[20];
		int val=1;
		for(int i=0;i<=n/2;i++)
		{
			a[i]=val;
			val=val+3;
		}
		int val1=-2;
		for(int i=0;i<=n/2;i++)
		{
			b[i]=val1;
			val1=val1-4;
		}
		for(int i=0;i<=n;i++)
		{	
			System.out.println(a[i]);
			System.out.println(b[i]);
		}	
	}
}
