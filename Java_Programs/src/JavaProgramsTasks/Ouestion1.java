package JavaProgramsTasks;

import java.util.Scanner;

//Reverse a string
public class Ouestion1 { 
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Original Value: ");
	String original=sc.nextLine();
	String reverse="";
	
	for(int i=original.length()-1;i>=0;i--) {
		reverse=reverse+original.charAt(i);
	}
	
	System.out.println("Reversed String: "+reverse);
}
}
