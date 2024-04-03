package JavaProgramsTasks;

import java.util.Scanner;

//WAJP to find largest number from an array
//Ex: input:[1,2,0,45,89]
//    output: 89
public class Question23 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size: ");
	int size=sc.nextInt();
	int arr[]=new int[size];

	System.out.println("Enter the elements of array: ");
	for(int i=0;i<size;i++) {
		arr[i]=sc.nextInt();
	}
	int max=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	System.out.println("Largest Number: "+max);
}
}
