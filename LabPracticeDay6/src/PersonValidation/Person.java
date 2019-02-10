package PersonValidation;
import java.util.Scanner;
public class Person 
{
	String fname;
	String lname;
	PersonGender gender;
	int age;
	double weight;
	long contact;
	Person()
	{
		fname=null;
		lname=null;
		gender=PersonGender.U;
		age=0;
		weight=0;
		contact=0;
	}
	Person(String fname, String lname, PersonGender gender, int age, double weight, long contact)
	{
		this.fname=fname;
		this.lname = lname;
		this.gender=gender;
		this.age = age;
		this.weight = weight;
		this.contact = contact;
	}
	String getFname()
	{
		return fname;
	}
	void setFname(String fn) 
	{
		if(fn=="")
		{
			try
			{
				throw new EmptyNameException();
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("First Name Empty.");
			}
		}
		else{
				fname = fn;
			}
	}
	String getLname()
	{
		return lname;
	}
	void setLname(String ln)
	{
		if(ln=="")
		{
			try
			{
				throw new EmptyNameException();
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("Last Name Empty.");
			}
		}
		else
		{
			lname = ln;
		}
	}
	PersonGender getGender()
	{
		return gender;
	}
	void setGender(PersonGender gn)
	{
		gender = gn;
	}
	int getAge()
	{
		return age;
	}
	void setAge(int ag)
	{
		age = ag;
	}
	double getWeight()
	{
		return weight;
	}
	void setWeight(double wt)
	{
		weight = wt;
	}
	long getContact()
	{
		return contact;
	}
	void setContact(long cont)
	{
		contact = cont;
	}
	public void setDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Fill Person Details:");
		System.out.println("_____________________");
		System.out.println("First Name : ");
		setFname(sc.next());
		System.out.println("Last Name : ");
		setLname(sc.next());
		System.out.println("Gender : 1: Male   2: Female");
		int index = sc.nextInt();
		switch(index)
		{
			case 1:
				setGender(PersonGender.M);
			default : 
				setGender(PersonGender.F);
		}		
		System.out.println("Age : ");
		setAge(sc.nextInt());
		System.out.println("Weight : ");
		setWeight(sc.nextDouble());
		System.out.println("Contact : ");
		setContact(sc.nextLong());
	}
	
	public void getDetails()
	{
		System.out.println("Person Details:");
		System.out.println("_____________________");
		System.out.println("First Name : "+ getFname());
		System.out.println("Last Name : "+ getLname());
		System.out.println("Gender : "+ getGender());
		System.out.println("Age : "+ getAge());
		System.out.println("Weight : "+ getWeight());
		System.out.println("Contact : "+ getContact());
	}
}
