package JavaProgramsTasks;

//Write a program to reverse a sentence
public class Question7 {
public static void main(String[] args) {
	String s1="Hello My name is Ram";
	String arr[]=s1.split(" ");
	String reverse="";
	
	for(int i=arr.length-1;i>=0;i--) {
		String s2="";
	for(int j=arr[i].length()-1;j>=0;j--) {
		s2=s2+arr[i].charAt(j);
	}
	reverse=reverse+s2+" ";		
	}
	System.out.println(reverse);
}
}
