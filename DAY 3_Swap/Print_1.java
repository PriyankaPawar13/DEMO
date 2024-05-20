package DAY3;

import java.util.Scanner;

public class Print_1 {
	
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println(" enter float and double value");
		float f = sc.nextFloat();
		double d = sc.nextDouble();
		
		System.out.printf("%.2f %.2f", f ,d );
		
	}

}
