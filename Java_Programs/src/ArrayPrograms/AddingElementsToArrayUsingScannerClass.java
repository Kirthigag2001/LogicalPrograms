package ArrayPrograms;

import java.util.Scanner;

public class AddingElementsToArrayUsingScannerClass {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size: ");
	int size=sc.nextInt();
	int arr[]=new int[size];

	System.out.println("Enter the elements of array: ");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
}
}
