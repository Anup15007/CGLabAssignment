import java.util.Arrays;
import java.util.Scanner;
public class StringObjects 
{
	public static void main(String [] args)
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total Number of Strings: ");
		num = sc.nextInt();
		String strObj[] = new String[num];
		System.out.println("Enter String Objects");
		for(int i=0;i<num;i++)
		{
			strObj[i] = sc.next();
		}
		Arrays.sort(strObj);
		int range;
		if(num%2==1)
		{
			range = num/2+1;
		}
		else range  = num/2;
		for(int i=0;i<range;i++)
		{
			strObj[i]= strObj[i].toUpperCase();
		}
		System.out.println("Sorted String Objects: \n");
		for(int i=0;i<num;i++)
		{
			System.out.println(strObj[i]);
		}
	}
}
