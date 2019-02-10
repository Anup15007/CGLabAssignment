public class PersonMain 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person();
		Person p2 = new Person("asd","sdf",PersonGender.M,23,23.4,98776587);
		p1.setDetails();
		p1.getDetails();
		p2.getDetails();
	}
}
