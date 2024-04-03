package JavaProgramsTasks;

import java.util.Scanner;

//WAJP to find factorial of a number.
//Ex: input: 5
//    output: 120

public class Question14 {
public static void main(String[] args) {
	int num=1;
	int fact=1;
	
	while(num<=5) {
		fact=fact*num;
		num++;
	}
	System.out.println(fact);
}
}
