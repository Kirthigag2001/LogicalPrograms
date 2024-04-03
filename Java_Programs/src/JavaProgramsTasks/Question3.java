package JavaProgramsTasks;

//Remove duplicate from string
public class Question3 {
public static void main(String[] args) {
	String original="Java is a programming language";
	String output="";
	for(int i=0;i<original.length();i++) {
		if(output.indexOf(original.charAt(i))==-1){
			output=output+original.charAt(i);			
		}
			}
	System.out.println("After removing duplicate: "+output);
}
}
