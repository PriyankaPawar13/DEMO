package DAY3;

import java.util.Scanner;

public class Swap_1 {
	
	public static void main(String args[])
	{
		//wap to swap values variables without using 3rd variable
		//without using arithmatic
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("before swapped a : "+a);
		System.out.println("before swapped b :"+b);
				
      
        a = a ^ b; 
        b = a ^ b; 
        a = a ^ b;  
  
        System.out.println("After swapping a = "
                           + a + ", b = " + b); 
    } 
	}
	
