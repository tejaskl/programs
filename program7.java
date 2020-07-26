// Java Program to Reverse a string.
import java.util.Scanner;
public class program7
{
	public static void main(String args[])
  	{
    		String string, r = "";
    		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string to be reversed");
    		string = in.nextLine();
		int length = string.length();
		for (int i = length - 1 ; i >= 0 ; i--)
      			r = r + string.charAt(i);
		System.out.println("Reverse of the string: " + r);
  	}
}