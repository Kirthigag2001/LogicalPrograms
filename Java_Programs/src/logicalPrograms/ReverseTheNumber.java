package logicalPrograms;

import java.util.Scanner;

public class ReverseTheNumber {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int num=sc.nextInt();
	
	/* while(num!=0) {
		int rem=num%10;
		System.out.print(rem);
		num=num/10;
	} */
	
	int rev=0;
	while(num!=0) {
		int rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	
	System.out.println(rev);
	
}
}
