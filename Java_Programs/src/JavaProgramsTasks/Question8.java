package JavaProgramsTasks;

//reverse a words in sentence
public class Question8 {
public static void main(String[] args) {
	String s1="Hello am a good girl";
	String arr[]=s1.split(" ");
	String reverse="";
	for(int i=arr.length-1;i>=0;i--) {
		reverse= reverse+arr[i]+" ";
	}
	System.out.println("Reversed words: "+reverse);
}
}
