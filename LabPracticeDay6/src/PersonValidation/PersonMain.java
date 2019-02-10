package PersonValidation;

import java.util.Scanner;

public class PersonMain 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person();
		Person p2 = new Person();
		Scanner sc = new Scanner(System.in);
		System.out.println("Fill Person Details:");
		System.out.println("_____________________");
		System.out.println("First Name : ");
		p1.setFname(sc.next());
		System.out.println("Last Name : ");
		p1.setLname(sc.next());
		p1.setDetails();
		p1.getDetails();
		System.out.println("Fill Person Details:");
		System.out.println("_____________________");
		System.out.println("First Name : ");
		p2.setFname(sc.next());
		System.out.println("Last Name : ");
		p2.setLname(sc.next());
		p2.setDetails();
		p2.getDetails();
	}
}
