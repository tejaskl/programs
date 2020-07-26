// Java Program to store elements into M * N matrix of integer  and its TRANSPOSE.
import java.util.Scanner;
public class program9 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N value : ");
		int N = sc.nextInt();
		System.out.println("Enter the M value : ");
		int M = sc.nextInt();
		int[][] mat = new int[N][M];
		System.out.println("Enter the matrix : ");
		int i,j;
		for(i=0;i<N;i++) {
			for(j=0;j<M;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("The entered Matrix is : ");
		for(i=0;i<N;i++) {
			for(j=0;j<M;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.print("\n");
		}
		System.out.println("The Transpose of the Matrix is : ");
		for(i=0;i<N;i++) {
			for(j=0;j<M;j++) {
				System.out.print(mat[j][i]+" ");
			}
			System.out.print("\n");
		}
		
	}
}