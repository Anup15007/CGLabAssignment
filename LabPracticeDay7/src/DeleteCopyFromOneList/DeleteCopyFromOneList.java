package DeleteCopyFromOneList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class DeleteCopyFromOneList {
	public static void main(String [] args){
		ArrayList<Integer> arrayList1 = new ArrayList<>();
		ArrayList<Integer> arrayList2 = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st List number of elements : ");
		int noOfElementList1 =sc.nextInt();
		int item = 0;
		int i=1;
		while(i<=noOfElementList1){
			System.out.println("Enter "+i+" element.");
			item = sc.nextInt();
			arrayList1.add(item);
			i++;
		}
		System.out.println("\n");
		System.out.println("Enter 2nd List number of elements :");
		int noOfElementList2 = sc.nextInt();
		int j=1;
		while(j<=noOfElementList2){
			System.out.println("Enter "+j+" element.");
			item = sc.nextInt();
			arrayList2.add(item);
			j++;
		}
		arrayList1.removeAll(arrayList2);
		System.out.println("Elements in List1 without duplicate are :  ");
		for(Integer element:arrayList1)
			System.out.println(element);
	}
}
