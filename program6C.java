// Java program to generate the following series 1, 4, 7, 12, 23, 42, 77, …., N.
import java.util.Scanner;
public class program6C 
{
	public static void main(String[] args) 
	{
		int arr[] = new int[18];
		arr[0] = 1;
		arr[1] = 4;
		arr[2] = 7;
		int i;
		for(i=3;i<15;i++) {
			arr[i] = arr[i-1]+arr[i-2]+arr[i-3];
		}
		for(i=0;i<10;i++)
			System.out.print(arr[i]+" ");
	}
}
