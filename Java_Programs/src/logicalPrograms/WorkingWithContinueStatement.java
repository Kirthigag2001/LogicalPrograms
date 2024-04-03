package logicalPrograms;

import java.util.Scanner;

public class WorkingWithContinueStatement {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the starting number: ");
	int start=sc.nextInt();
	System.out.println("Enter the ending number: ");
	int end=sc.nextInt();
	System.out.println("Enter the number to be stopped");
	int stop=sc.nextInt();
	
	for(int i=start;i<=end;i++) {
		if(i==stop) {
			continue;
		}
		System.out.println(i);
	}
}
}
