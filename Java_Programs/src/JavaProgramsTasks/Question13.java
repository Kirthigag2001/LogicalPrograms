package JavaProgramsTasks;

//Write a program to remove numbers from string
//Ex: input: Ab2hishek12 
//    output: Abhishek
public class Question13 {
public static void main(String[] args) {
	String s1="Ab2hishek12";
	char ch[]=s1.toCharArray();
	String result="";
	
	for(int i=0;i<ch.length;i++) {
		if(!(ch[i]>=48 && ch[i]<=57)) {
			result+=ch[i];
		}
	}
	System.out.println(result);
}
}
