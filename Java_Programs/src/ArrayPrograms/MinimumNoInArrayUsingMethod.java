package ArrayPrograms;

import java.util.Scanner;

public class MinimumNoInArrayUsingMethod {
	public int arrayOperation(int a[]) {
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		return min;
	}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size: ");
	int size=sc.nextInt();
	int arr[]=new int[size];
	
	//enter elements in array
	System.out.println("Enter the array elements: ");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=sc.nextInt();
	}
	MinimumNoInArrayUsingMethod a1=new MinimumNoInArrayUsingMethod();
	System.out.println("Minimum number in array: "+a1.arrayOperation(arr));
}
}
