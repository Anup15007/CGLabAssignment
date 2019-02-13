package com.cg.date;
import org.junit.Test;
import junit.framework.Assert;

public class dateTest {
	@Test
	public void testGetDay()
	{
		System.out.println("from dateTest");
		Date per = new Date(01,06,2018);
		Assert.assertEquals(01,per.getDay());
	}
	@Test
	public void testGetMonth(){
		System.out.println("from dateTest");
		Date per = new Date(01,06,2018);
		Assert.assertEquals(06,per.getMonth());
	}
	@Test
	public void testGetYear(){
		System.out.println("from dateTest");
		Date per = new Date(01,06,2018);
		Assert.assertEquals(2018,per.getYear());
	}
	@Test
	public void testToString()
	{
		System.out.println("from dateTest");
		Date per = new Date(01,06,2018);
		Assert.assertEquals("Date is 01/06/2018",per.toString());
	}
}
