package JavaProgramsTasks;

//WAJP to check if the given number is armstrong number
//Ex: input1: 153			input2: 221
public class Question18 {
public static void main(String[] args) {
	int num=153;
	int temp=num;
	int count=0;
	int arm=0;
	
	
	//Counting the number of digits
	while(temp!=0) {
		int rem=temp%10;
		count++;
		temp=temp/10;
	}
	
	int temp1=num;
	while(temp1!=0) {
		int rem1=temp1%10;
		int pow=1;
		for(int i=1;i<=count;i++) {
			pow=pow*rem1;
		}
		arm=arm+pow;
		temp1=temp1/10;
	}
	System.out.println(arm);
	
	if(arm==num) {
		System.out.println("Armstrong");
	}
	else
	{
		System.out.println("Not Armstrong");
	}
}
}
