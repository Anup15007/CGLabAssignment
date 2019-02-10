package Transaction;
public class Person 
{
	String name;
	float age;
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public float getAge() 
	{
		return age;
	}
	public void setAge(float age) throws AgeException
	{
		if(age>15)
		{
			this.age = age;
		}
		else
		{
			try
			{
				throw new AgeException();
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("Age below 15");
			}
		}
	}
	
}
