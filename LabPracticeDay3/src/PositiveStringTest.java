import java.util.Scanner;

public class PositiveStringTest 
{
	public static void main(String[] args) 
	{
		PositiveString obj1 = new PositiveString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		obj1.setString(sc.next());
		boolean res = obj1.getString();
		if(res==true)
		{
			System.out.println("Positive String");
		}
		else System.out.println("Negative String");
	}
	
}
