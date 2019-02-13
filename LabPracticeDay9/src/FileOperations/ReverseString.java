package FileOperations;
public class ReverseString {
	public static String reverseString(String s) {
		String s1 = "";
		for(int i=s.length()-1;i>=0;i--)
			s1 +=s.charAt(i);
		return s1;

	}
}