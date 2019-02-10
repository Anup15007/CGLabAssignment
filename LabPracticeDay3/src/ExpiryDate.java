import java.util.Scanner;
public class ExpiryDate 
{
	public static void main(String[] args) 
	{
		findWarranty();
	}
	public static void findWarranty()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day of Purchase:");
		int dayPurchase = sc.nextInt();
		System.out.println("Enter Month of Purchase:");
		int monthPurchase = sc.nextInt();
		System.out.println("Enter Year of Purchase:");
		int yearPurchase = sc.nextInt();
		System.out.println("Enter Month of Warranty:");
		int monthWarranty = sc.nextInt();
		System.out.println("Enter Year of Warranty:");
		int yearWarranty = sc.nextInt();
		int yearExpiry = yearPurchase+yearWarranty;
		int monthExpiry = monthPurchase+monthWarranty;
		if(monthExpiry>12)
		{
			yearExpiry=yearExpiry+(monthExpiry/12);
			monthExpiry=monthExpiry%12;			
		}
		System.out.println("Month Expiry : "+monthExpiry +" Year Expiry : "+ yearExpiry);
	}
}
