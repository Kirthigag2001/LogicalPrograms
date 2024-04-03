package JavaProgramsTasks;

//Write a program to find digital sum of a number
public class Question6 {
public static void main(String[] args) {
	int num=432;
	int sum=0;
	
	while(num!=0) {
		int rem=num%10;
		sum+=rem;
		num=num/10;
	}
	
	System.out.println("Sum Of Digits: "+sum);
}
}
