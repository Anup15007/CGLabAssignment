package com.cg.person;
class Person
{   
	private String firstName, lastName;
	private char gender;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Person(){}
	public Person(String name,String surname,char ge)
	{
		firstName=name;
		lastName=surname;
		gender=ge;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName
				+ ", gender=" + gender + "]";
	}

}
