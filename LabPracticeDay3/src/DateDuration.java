import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.sql.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class DateDuration
{
	public static void main(String [] args)
	{
		checkDuration();
	}
	public static void checkDuration()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date(dd/mm/yyyy) :");
		String dateStr = sc.nextLine();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime now = LocalDateTime.now();
		String sysDate = dtf.format(now);
		System.out.println("Local Date:"+sysDate);
		try
		{
			java.util.Date date1 = null;
			try
			{
				date1 = dateFormat.parse(dateStr);
			}
			catch(java.text.ParseException e)
			{
				e.printStackTrace();
			}
			java.util.Date date2 = null;
			try
			{
				date2 = dateFormat.parse(sysDate);
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
