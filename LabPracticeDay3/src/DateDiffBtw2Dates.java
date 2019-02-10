import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class DateDiffBtw2Dates 
{
	public static void main(String[] args) 
	{
		checkDuration();
	}
	public static void checkDuration()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Date(dd/mm/yyyy) :");
		String date1Str = sc.nextLine();
		System.out.println("Enter 2nd Date(dd/mm/yyyy) :");
		String date2Str = sc.nextLine();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
		try
		{
			java.util.Date date1 = null;
			try
			{
				date1 = dateFormat.parse(date1Str);
			}
			catch(java.text.ParseException e)
			{
				e.printStackTrace();
			}
			java.util.Date date2 = null;
			try
			{
				date2 = dateFormat.parse(date2Str);
			}
			catch(java.text.ParseException e)
			{
				e.printStackTrace();
			}
			long diff = date2.getTime() - date1.getTime();
			System.out.println("Days : "+TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}
	}

}
