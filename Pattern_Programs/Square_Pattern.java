package DAY1;

import java.util.Scanner;

public class Square_Pattern {
	
	// Square Pattern 
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Size : ");
		int size = scan.nextInt();
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}

/* OutPut 
 
**** 
**** 
**** 
****         
          
          
 */
