package logicalPrograms;

import java.util.Scanner;

public class ProductOfNumberUsingMethod {
public static int product(int num) {
	int prod=1;
	
	while(num!=0) {
		int rem=num%10;
		prod=prod*rem;
		num=num/10;
	}
	return prod;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n=sc.nextInt();
	int result=product(n);
	System.out.println("Product of digit: "+result);
}
}
