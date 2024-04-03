package JavaProgramsTasks;

import java.util.Scanner;

//Print first 10 numbers in fibonacci series
//Ex: input1: n=10
//    output: 0 1 1 2 3 5 8 13 21 34
public class Question40 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n=sc.nextInt();
	int v1=0;
	int v2=1;
	int v3=v1+v2;
	
	while(n>0) {
		System.out.print(v1+" ");
		v1=v2;
		v2=v3;
		v3=v1+v2;
		n--;
	}
}
}
