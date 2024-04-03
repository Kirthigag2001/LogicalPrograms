package JavaProgramsTasks;

//Write a program to convert uppercase into lower case and lower case into upper case
//Ex: input: My Name is Arun
//    output:mY nAME IS aRUN

public class Question12 {
public static void main(String[] args) {
	String s1="My Name is Arun";
	char ch[]=s1.toCharArray();
	String s2="";
	
	for(int i=0;i<ch.length;i++) {
		if(ch[i]>=65 && ch[i]<=90){
			String temp="";
			temp=temp+ch[i];
			temp=temp.toLowerCase();
			s2+=temp;
		}
		else {
			String temp="";
			temp=temp+ch[i];
			temp=temp.toUpperCase();
			s2+=temp;
		}
	}
	System.out.println(s2);
}

}
