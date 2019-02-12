package ProductName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ProductNames {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of products you want to enter:-");
		int numberOfProducts = sc.nextInt();
		ArrayList<String> productNames = new ArrayList<>();
		System.out.println("Enter the product names:-");
		for(int i=0;i<numberOfProducts;i++){
			productNames.add(sc.next());
		}
		Collections.sort(productNames);
		System.out.println("Sorted List of products is :-");
		for(String string : productNames){
			System.out.println(string);
		}
	}
}
