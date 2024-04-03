package JavaProgramsTasks;

import java.util.Scanner;

//WAJP to check if the given number is palindrome
//Ex: input1: 123			input2: 121
public class Question15 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number :");
	int num=sc.nextInt();
	int temp=num;
	int rev=0;
	
	while(num!=0) {
		int rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	
	//System.out.println(rev);
	
	if(temp==rev) {
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("Not Palindrome");
	}
}
}
