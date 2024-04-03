package JavaProgramsTasks;

import java.util.Scanner;

//WAJP to check if a given number is prime number
//Ex: input1: 7			input: 4
public class Question16 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number :");
	int n=sc.nextInt();
	int count=0;
	
	for(int i=2;i<=n;i++) {
		if(n%i==0) {
			count++;
		}
	}
	if(count==1) {
		System.out.println("Prime");
	}
	else {
		System.out.println("Not Prime");
	}
}
}
