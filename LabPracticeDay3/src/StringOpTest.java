import java.util.Scanner;


public class StringOpTest {

	public static void main(String[] args) 
	{
		StringOp str = new StringOp();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String");
		str.setString(sc.next());
		System.out.println("Enter Choice : 1:Add 2:Replace with # 3:Remove Duplicate 4:Odd Characters to Uppercase");
		int index = sc.nextInt();
		switch(index)
		{
		case 1 : System.out.println("Concat Output : " + str.getConcatString());
		break;
		case 2 : System.out.println("Replace Output : " + str.getReplaceString());
		break;
		case 3 : System.out.println("Remove Duplicate Output : " + str.getRemDuplString());
		break;
		case 4 : System.out.println("Odd Uppercase Output : " + str.getOddUpString());
		break;
		default: System.out.println("Not an Option.");
		}
		
		
	}

}
