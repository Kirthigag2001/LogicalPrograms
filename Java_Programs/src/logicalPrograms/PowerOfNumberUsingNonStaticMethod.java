package logicalPrograms;

import java.util.Scanner;

public class PowerOfNumberUsingNonStaticMethod {
public double power(int num,int pow) {
	int prod=1;
	for(int i=1;i<=pow;i++) {
		prod=prod*num;
	}
	return prod;
}

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n=sc.nextInt();
	System.out.println("Enter the pow value: ");
	int p=sc.nextInt();
	
	PowerOfNumberUsingNonStaticMethod pw=new PowerOfNumberUsingNonStaticMethod();
	double powRes=pw.power(n, p);
	System.out.println(powRes);
	
}
}
