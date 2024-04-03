package JavaProgramsTasks;

//WAJP to print 10th prime number
//Ex: input1: n=10
//    output: 23
public class Question41 {
public static void main(String[] args) {
	int n=10;
	int count=0;
	boolean flag=true;
	for(int i=2;i<=100;i++) {
		if(i%2==0) {
			flag=false;
		}
		else {
			count++;
		}
		if(count==10) {
			System.out.println(i);
			break;
		}
	}
	
}
}