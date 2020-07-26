// Java program to find the sum of all prime numbers in the range n to m.
import java.util.Scanner;
public class program5
{ 
	static boolean checkPrime(int numberToCheck) 
	{ 
		if(numberToCheck == 1) { 
			return false; 
		} 
		for (int i = 2; i*i <= numberToCheck; i++) { 
			if (numberToCheck % i == 0) { 
				return false; 
			} 
		} 
		return true; 
	} 
	static int primeSum(int l, int r) 
	{ 
		int sum = 0; 
		for (int i = r; i >= l; i--) { 

			boolean isPrime = checkPrime(i); 
			if (isPrime) {  
				sum = sum + i; 
			} 
		} 
		return sum; 
	} 
	public static void main(String[] args) 
	{ 
		int n , m ; 
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter the range n and m : ");
		n = sc.nextInt();
		m = sc.nextInt();
		System.out.println(primeSum(n, m)); 
	} 
}