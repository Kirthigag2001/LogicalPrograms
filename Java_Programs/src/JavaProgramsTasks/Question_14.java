package JavaProgramsTasks;

import java.util.Scanner;

//factorial
public class Question_14 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number :");
	int num=sc.nextInt();
	int fact=1;
//	
//	while(num>0) {
//		fact=fact*num;
//		num--;
//	}
//	
//	System.out.println(fact);
	
	for(int i=num;num>0;num--) {
		fact=fact*num;
	}
	System.out.println(fact);
}
}
