package DAY7;

import java.util.Scanner;

public class Matrix_1 {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter value of m and n ");
		int m = scan.nextInt();
		int n = scan.nextInt();
		
		int arr[][] = new int[m][n];
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j || (i+j)== m-1)
				{
					System.out.print(arr[i][j]);
				}else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}

