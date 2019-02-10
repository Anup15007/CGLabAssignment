public class PositiveString 
{
	String str;
	public void setString(String str)
	{
		this.str=str;
	}
	public Boolean getString()
	{
		char strIn[] = str.toCharArray();
		int flag=0;
		for(int i = 0;i<(strIn.length)-1;i++)
		{
			strIn[i]= Character.toUpperCase(strIn[i]);
		}
		for(int i = 0;i<(strIn.length)-1;i++)
		{
			for(int j=i+1;j<strIn.length;j++)
			{
				if(strIn[j]-'A'<strIn[i]-'A')
				{
					flag = 1;
					break;
				}
			}
		}
		if(flag==0)
		{
			return true;
		}
		else
		{
			return false;
		}		
	}
}
