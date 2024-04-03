package JavaProgramsTasks;

//WAJP to find smallest number from an array
//Ex: input:[1,2,0,45,89]
//    output: 0
import java.util.Scanner;

public class Question24 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array: ");
	int size=sc.nextInt();
	int arr[]=new int[size];
	
	System.out.println("Enter the elements: ");
	for(int i=0;i<size;i++) {
		arr[i]=sc.nextInt();
	}
	
	int min=0;
	for(int i=0;i<arr.length;i++) {
		if(min>arr[i]) {
			min=arr[i];
		}
	}
	System.out.println("minimum num "+min);
}
}
