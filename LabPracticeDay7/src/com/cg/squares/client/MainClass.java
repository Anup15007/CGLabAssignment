package com.cg.squares.client;
import java.util.HashMap;
import java.util.Scanner;
import com.cg.squares.services.FindSquares;
public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements want in array.");
		int noOfElements = sc.nextInt();
		int numberArray[]= new int[noOfElements];
		System.out.println("Please enter elements. ");
		for(int i=0;i<noOfElements;i++){
			System.out.println("element" + i);
			numberArray[i]=sc.nextInt();
		}
		FindSquares fs = new FindSquares();
		HashMap<Integer,Integer> result = fs.getSquare(numberArray);
		System.out.println("Squares are-: "); 
		System.out.println(result.values());
	}
}
