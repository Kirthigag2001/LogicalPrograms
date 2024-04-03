package JavaProgramsTasks;

//WAJP to find second largest elements from an array
//Ex: input1: [2,11,5,1,6]
//    output: 6
import java.util.Scanner;

public class Question26 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array: ");
	int size=sc.nextInt();
	int arr[]=new int[size];
	
	System.out.println("Enter the elements: ");
	for(int i=0;i<size;i++) {
		arr[i]=sc.nextInt();
	}
	
	int temp=0;
	for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr.length;j++) {
		if(arr[i]<arr[j]) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	}
	System.out.println("Second Largest Number: "+arr[1]);
}
}
