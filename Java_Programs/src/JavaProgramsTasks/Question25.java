package JavaProgramsTasks;

import java.util.Scanner;

//WAJP to search an element from an array
//Ex: input1:[12,32,1,2,43] key:32    input2:[1,2,21,56,22]  key:254
//    output: Element is present	    output:Element is not present
public class Question25 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		int count=0;
		
		System.out.println("Enter the elements: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the key value: ");
		int key=sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				System.out.println("Element " +key +" is found");
				count++;
				break;
			}
		}
		
		if(count==0) {
			System.out.println("No Element found");
		}
		
	}
}
