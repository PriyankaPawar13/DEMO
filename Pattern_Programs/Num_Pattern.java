package DAY1;

import java.util.Scanner;

public class Num_Pattern {

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Size : ");
		int size = scan.nextInt();
		
		int count = 1;
		
		for(int i=1;i<=size;i++)
		{
			for(int j=1;j<=size;j++)
			{
				if(count < 10)
				{
					System.out.print("0");
				}
				
				System.out.print(count++  +  " ");
			}
		System.out.println();
	   }
	}
}

		

/* OutPut :
		
		01 02 03 04 05 
		06 07 08 09 10 
		11 12 13 14 15 
		16 17 18 19 20 
		21 22 23 24 25 
			         
 */
