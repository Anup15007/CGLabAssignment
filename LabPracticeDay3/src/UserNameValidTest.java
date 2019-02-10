import java.util.Scanner;


public class UserNameValidTest 
{

	public static void main(String[] args) 
	{
		String username;
		boolean flag;
		UserNameValid usernm = new UserNameValid();
		Scanner sc  = new Scanner(System.in);
		System.out.println("User Details");
		System.out.println("*************************************************");
		System.out.println("Enter Name:");
		usernm.setName(sc.nextLine());
		System.out.println("Enter Age:");
		usernm.setAge(sc.nextInt());
		System.out.println("Enter Contact:");
		usernm.setContactNo(sc.nextLong());
		System.out.println("Enter Username:");
		username = sc.next();
		flag = usernm.validUsername(username);
		if (flag==true)
		{
			usernm.setUsername(username);
			System.out.println("User Registered Succesfully.");
			System.out.println("*******************************************");
			System.out.println("Name : "+usernm.getName());
			System.out.println("Age : "+usernm.getAge());
			System.out.println("ContactNo : "+usernm.getContactNo());
			System.out.println("Username : "+usernm.getUsername());
		}
		else
			System.out.println("Username not valid.");	
		
	}

}
