import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.TimeZone;


public class DateTimeZone 
{
	public static void main(String[] args) 
	{		
		Scanner sc = new Scanner(System.in);;
		String timeZoneId = sc.nextLine();
		getTime(timeZoneId);		
	}
	private static void getTime(String timeZoneId) 
	{
		Calendar calTz = new GregorianCalendar(TimeZone.getTimeZone(timeZoneId));
		calTz.setTimeInMillis(new Date().getTime());
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, calTz.get(Calendar.YEAR));
		cal.set(Calendar.MONTH, calTz.get(Calendar.MONTH));
		cal.set(Calendar.DAY_OF_MONTH, calTz.get(Calendar.DAY_OF_MONTH));
		cal.set(Calendar.HOUR_OF_DAY, calTz.get(Calendar.HOUR_OF_DAY));
		cal.set(Calendar.MINUTE,calTz.get(Calendar.MINUTE));
		cal.set(Calendar.SECOND, calTz.get(Calendar.SECOND));
		cal.set(Calendar.MILLISECOND, calTz.get(Calendar.MILLISECOND));
		System.out.println(cal.getTime());
	}
	public static void getAllTimeZone() 
	{		
		String[] zonId = TimeZone.getAvailableIDs();
		for(int i=0; i<zonId.length;i++)
		{
			TimeZone tzon = TimeZone.getTimeZone(zonId[i]);
			System.out.println(tzon.getID()+" "+tzon.getDisplayName());
		}		
	}

}
