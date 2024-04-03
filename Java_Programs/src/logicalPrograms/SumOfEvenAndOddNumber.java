package logicalPrograms;

import java.util.Scanner;

public class SumOfEvenAndOddNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the numbers: ");
	int n=sc.nextInt();
	
	int sumEven=0;
	int sumOdd=0;
	
	while(n!=0) {
		int rem=n%10;
		if(rem%2==0) {
			sumEven=sumEven+rem;
		}
		else {
			sumOdd=sumOdd+rem;
		}
		n=n/10;
	}
	
	System.out.println("Sum of even numbers: "+sumEven);
	System.out.println(("Sum of odd numbers: "+sumOdd));
}
}
