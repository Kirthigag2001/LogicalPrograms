package JavaProgramsTasks;

//WAJP to swap numbers without using extra variable
//Ex: input1: a=10, b=20
//    output: a=20, b=10
public class Question20 {
public static void main(String[] args) {
	int firstNum=50;
	int secondNum=30;
	firstNum=firstNum+secondNum;
	secondNum=firstNum-secondNum;
	firstNum=firstNum-secondNum;
	System.out.println("First Number: "+firstNum);
	System.out.println("Second Number: "+secondNum);
	
}
}
