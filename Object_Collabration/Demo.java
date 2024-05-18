package DAY6;

import java.util.Scanner;

public class Demo {
	
	public static void main(String args[])
	{
	
	Student student =new Student();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Student name");
    student.setName(sc.nextLine());
    System.out.println("Enter Student roll number ");
    student.setRollno(sc.nextInt());
    System.out.println("Enter student Section");
    student.setSection(sc.nextLine());
    student.setSchool(new School("AbcSchool","Pune"));
    student.setSubject(new Subject("math","123"));
    System.out.println(student.toString());
    

}
	

}
