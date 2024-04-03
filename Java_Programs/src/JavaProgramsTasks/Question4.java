package JavaProgramsTasks;

//Write a program to check if a string are anagram or not.
//Ex: input: input1-Race input2-Care output-String is anagram

public class Question4 {
public static void main(String[] args) {
	String s1="abcd";
	String s2="dcab";
	
	if(s1.length()==s2.length()) {
		char[] c1=s1.toCharArray();
		for(int i=0;i<s1.length();i++) {
			for(int j=1;j<s1.length();j++) {
				if(c1[i]>c1[j]) {
					char temp1=c1[i];
					c1[i]=c1[j];
					c1[j]=temp1;
				}
			}
		}
		
		char[] c2=s2.toCharArray();
		for(int i=0;i<s2.length();i++) {
			for(int j=1;j<s2.length();j++) {
				if(c2[i]>c2[j]) {
				char temp2=c2[i];
				c2[i]=c2[j];
				c2[j]=temp2;
			}
		}
	}
		boolean anagram=true;
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s2.length();j++) {
				if(c1[i]==c2[j]) {
					anagram=true;
				}
				else {
					anagram=false;
				}
			}
		}
		if(anagram==true) {
			System.out.println("It's an anagram");
		}
		else
		{
			System.out.println("Not an anagram");
		}
}
	else
	{
		System.out.println("String length not matches");
	}
}
}
