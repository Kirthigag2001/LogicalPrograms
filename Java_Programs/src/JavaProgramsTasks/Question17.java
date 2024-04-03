package JavaProgramsTasks;

//WAJP to check if a given number is strong number
//Ex: input1: 145			input2: 100
public class Question17 {
public static void main(String[] args) {
	int n=145;
	int temp=n;
	int strong=0;
	
	while(temp!=0) {
		int rem=temp%10;
		int fact=1;
		while(rem>0) {
		fact=fact*rem;
		rem--;
	}
	
	strong=strong+fact;
	temp=temp/10;
	}
	if(strong==n) {
		System.out.println("Strong Number");
	}
	else
	{
		System.out.println("Not Strong Number");
	}
}
}
