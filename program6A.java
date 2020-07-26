// Java program to generate the following series 4, 16, 36, 64, 100, …, N.
import java.util.Scanner;
public class program6A
{
	public static void main(String[] args)
	{	
		int i,sq,n;
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter any Number : ");
		n = sc.nextInt();
		for(i=2;i<=n;i++)
		{
			sq=i*i;
			System.out.println(" "+sq);
			i++;
		}
	}

}
