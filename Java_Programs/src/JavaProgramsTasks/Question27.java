package JavaProgramsTasks;

import java.util.Scanner;

//WAJP to find nth smallest/largest element from an array
//Ex: input1: [22,3,1,5,6,8] n: 4th largest    input2: [22,34,7,4,2,11] n:3rd smallest
//    output: 5                                output: 7
public class Question27 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array: ");
	int size=sc.nextInt();
	int arr[]=new int[size];
		
	System.out.println("Enter the elements: ");
	for(int i=0;i<size;i++) {
		arr[i]=sc.nextInt();
	}
	
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println("Enter the index number: ");
	int n=sc.nextInt();
	System.out.println(n+" largest number "+arr[n-1]);
}
}
