package JavaProgramsTasks;

import java.util.Scanner;

//WAJP to check if a given string is palindrome or not
//Ex: input1: Malayalam			input2: Manoj
//    output: String is palindrome        output: String is not palindrome

public class Question22 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the data: ");
	String s1=sc.nextLine();
	String s2="";
	
	for(int i=s1.length()-1;i>=0;i--) {
		s2=s2+s1.charAt(i);
	}
	//System.out.println(s2);
	
	if(s1.equals(s2)) {
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("Not Palindrome");
	}
}
}
