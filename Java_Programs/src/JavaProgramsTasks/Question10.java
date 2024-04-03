package JavaProgramsTasks;

//Write a program to display the number of unrepeated characters from a string
//Ex: input: I am a good boy output: 9
public class Question10 {
public static void main(String[] args) {
	String s1="I am a good boy";
	int count=0;
	String res="";
	
	for(int i=0;i<s1.length();i++) {
		if(res.indexOf(s1.charAt(i))==-1){
			count++;
			res+=s1.charAt(i);
		}
	}
	System.out.println("Number of original letters:"+count);
}
}
