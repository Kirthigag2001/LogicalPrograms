package logicalPrograms;


import java.util.Scanner;

public class WorkingWithBreakStatement {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the starting number: ");
	int start=sc.nextInt();
	System.out.println("Enter the enfing number: ");
	int end=sc.nextInt();
	System.out.println("Enter the number to be stopped");
	int stop=sc.nextInt();
	
	/* while(start<=end) {
		if(start==stop) {
			break;
		}
		System.out.println(start);
		start++;
	} */
	
	for(int i=start;i<=end;i++) {
		if(i==stop) {
			break;
		}
		System.out.println(i);
	}
}
}
