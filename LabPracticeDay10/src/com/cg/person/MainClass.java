package com.cg.person;
public class MainClass {
	public static void main(String...args)
	{   
		Person person = new Person();
		person.setFirstName("Bibek");
		person.setLastName("Kumar");
		person.setGender('M');
		String name = person.getFirstName();
		String last = person.getLastName();
		char gender = person.getGender();
		Person person2 = new Person(name,last,gender);
		person2.toString();
	}
}