package JavaProgramsTasks;

//add number in a string.
// Ex: input: a="asc123bsd4" output: sum=10

public class Question5 {
public static void main(String[] args) {
	String s1="asc123bsd4";
	int output=0;
	
	for(int i=0;i<s1.length();i++) {
		if(s1.charAt(i)>=48 && s1.charAt(i)<=57) {
			output=output+s1.charAt(i)-48;
		}
	}
	System.out.println(output);
}
}
