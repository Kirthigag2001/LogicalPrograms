package JavaProgramsTasks;

import java.util.Scanner;

//Remove duplicate from string
public class Question_3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string: ");
	String s=sc.nextLine();
	char c[]=s.toCharArray();
	String res="";
	
	for(int i=0;i<c.length;i++) {
		if(res.indexOf(c[i])==-1) {
			res=res+c[i];

		}
	}
	System.out.println(res);
}
}
