package SortArray;

import java.util.*;
public class SortArrayDemo {
	public static void main(String[] args) {
		int numberOfInteger=0;
		ArrayList<String> arrlist = new ArrayList<>();
		System.out.println("Enter length of array");
		Scanner sc = new Scanner(System.in);
		numberOfInteger = sc.nextInt();
		int userInput[] = new int[numberOfInteger];
		System.out.println("Enter Integers");
		for(int i=0;i<numberOfInteger;i++)
		{
			userInput[i]=sc.nextInt();
			String input = String.valueOf(userInput[i]);
			StringBuilder strbuilder = new StringBuilder(input);
			strbuilder.reverse();
			input = String.valueOf(strbuilder);
			int str = Integer.parseInt(input);
			arrlist.add(input);
		}
		Collections.sort(arrlist);
		System.out.println("numbers are");
		System.out.println(arrlist);
	}

}
