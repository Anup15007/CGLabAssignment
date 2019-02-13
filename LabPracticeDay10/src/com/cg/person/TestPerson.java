package com.cg.person;
import org.junit.Assert;
import org.junit.Test;
public class TestPerson {
	@Test
	public void testGetFirstName(){
		Person per = new Person("PATIT PAWAN","BARIK", 'M');
		Assert.assertEquals("PATIT PAWAN",per.getFirstName());
	}
	@Test
	public void testGetLastName(){
		Person per = new Person("PRADUMNA","BARIK", 'M');
		Assert.assertEquals("BARIK",per.getLastName());
	}
	@Test
	public void testGetGender(){
		Person per = new Person("PRADUMNA","BARIK",'M');
		Assert.assertEquals('M',per.getGender());
	}
	public void testToString(){
		Person per = new Person("PATIT PAWAN","BARIK",'M');
		Assert.assertEquals("Person [firstName= PATIT PAWAN , lastName= BARIK , gender= M ]",per.toString());
	}
}


