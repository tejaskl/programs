// Java Program to perform Linear Search.
import java.util.Scanner;
public class program8
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N value : ");
		int N = sc.nextInt();
		int[] arr = new int[N];
		int i;
		System.out.println("Enter "+N+" Integers :");
		for(i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element that has to be searched.");
		int elem = sc.nextInt();
		for(i=0;i<N;i++) {
			if(arr[i] == elem) {
				System.out.println("Element found at position "+(i+1));
			}
		}
	}
}