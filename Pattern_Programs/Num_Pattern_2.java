package DAY1;

import java.util.Scanner;

public class Num_Pattern_2 {

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Size : ");
		int size = scan.nextInt();
		
		
		for(int i=1;i<=size;i++)
		{
			int count = i;
			for(int j=1;j<=size;j++)
			{
				System.out.print(count++  +  " ");
			}
		System.out.println();
	   }
	}
}

		

/* OutPut :
		
	1 2 3 4 5 
	2 3 4 5 6 
	3 4 5 6 7 
	4 5 6 7 8 
	5 6 7 8 9 
			         
 */
