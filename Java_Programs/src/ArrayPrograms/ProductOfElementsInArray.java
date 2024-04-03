package ArrayPrograms;

import java.util.Scanner;

public class ProductOfElementsInArray {
public int product(int a[]) {
	int prod=1;
	for(int i=0;i<a.length;i++) {
		prod=prod*a[i];
	}
	return prod;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size: ");
	int size=sc.nextInt();
	int arr[]=new int[size];
	
	System.out.println("Enter the elements: ");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	
	ProductOfElementsInArray pa=new ProductOfElementsInArray();
	System.out.println("Product of elements: "+pa.product(arr));
}
}
