package DAY1;

import java.util.Scanner;

public class Triangle_Pattern_1 {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Size : ");
		int size = scan.nextInt();
		
		for(int i=0;i<size;i++)
		{
			for(int j=i;j<size;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

/* OutPut :

 		****
 		***
 		**
 		*
         
 */
