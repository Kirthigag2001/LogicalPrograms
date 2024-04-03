package JavaProgramsTasks;

import java.util.Scanner;

//WAP to print array in the reverse order in java.
//Ex: input1: [1,2,3,4,5]
//    output: 5 4 3 2 1
public class Question34 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size: ");
	int size=sc.nextInt();
	int arr[]= new int[size];
	
	System.out.println("Enter the elements in array: ");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	for(int i=arr.length-1;i>=0;i--) {
		System.out.print(arr[i]);
	}
}
}
