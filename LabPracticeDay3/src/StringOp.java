
public class StringOp 
{
	String str;
	void setString(String str)
	{
		this.str = str;
	}
	String getConcatString()
	{
		String strOut = str.concat(str);
		return strOut;
	}
	String getReplaceString()
	{
		String strIn = str;
		String strOut = null;
		char strArr[] = strIn.toCharArray();
		for(int i = 0; i<strArr.length;i++)
		{
			if(i%2==0)
			{
				 strArr[i] = '#';
			}
		}
		strOut = new String(strArr);
		return strOut;
	}
	String getRemDuplString()
	{
		String strIn = str;
		String strOut = "";
		char ch;
		int i=0, l;
		l = strIn.length();
		strIn+= " ";
		ch=strIn.charAt(0);
		while(i<l)
		{
			strOut = strOut + ch;
			while(strIn.charAt(++i)==ch && i<l)
			{
				
			}
			ch = strIn.charAt(i);
		}
		return strOut;
	}
	String getOddUpString()
	{
		String strIn = str;
		String strOut = "";
		char ch;
		char strArr[] = strIn.toCharArray();
		for(int i = 0; i<strArr.length;i++)
		{
			ch = strArr[i];
			if(i%2==0)
			{
				 strArr[i]= Character.toUpperCase(ch);
			}
		}
		strOut = new String(strArr);
		return strOut;
	}
}
