package JavaProgramsTasks;

//Write a program to remove duplicates from a string
//Ex: input: My name is Khan
//    ouput: My nae is Kh

public class Question9 {
public static void main(String[] args) {
	String s1="my name is khan";
	char arr[]=s1.toCharArray();
	String org="";
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==' ' || org.indexOf(arr[i])==-1){
			org=org+arr[i];
		}
	}
	
	System.out.println(org);
}
}
