package JavaProgramsTasks;

//Count the number of lowercase, uppercase letters in a string
//Ex: input: I am a traVeLLer output: uppercase:4 lowercase:9
public class Question11 {
public static void main(String[] args) {
	String s1="I am a traVeLLer";
	char arr[]=s1.toCharArray();
	int lower=0;
	int upper=0;
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>=65 && arr[i]<=90){
			upper++;
		}
		else if(arr[i]>=97 && arr[i]<=122) {
			lower++;
		}
	}
	
	System.out.println("Number of lower case letters: "+lower);
	System.out.println("Number of upper case letters: "+upper);
}
}
