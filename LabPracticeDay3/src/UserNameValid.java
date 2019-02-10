import java.util.Scanner;
public class UserNameValid 
{
	private String name;
	private int age;
	private long contactNo;
	private String username;
	
	public String getUsername() 
	{
		return username;
	}

	public void setUsername(String username) 
	{
		this.username = username;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public long getContactNo() 
	{
		return contactNo;
	}

	public void setContactNo(long contactNo) 
	{
		this.contactNo = contactNo;
	}

	public boolean validUsername(String str)
	{
		boolean flag = false;
		char strArr[] = str.toCharArray();
		int count  = 0;
		int length  = strArr.length;
		for(int i = 0; i<length ; i++)
		{
			count++;
		}
		if((strArr[length-4]=='_')&&(strArr[length-3]=='j')&&(strArr[length-2]=='o')&&(strArr[length-1]=='b'))
		{
			if(count>=12)
			{
				flag = true;
			}
		}
		return flag;
	}

}
