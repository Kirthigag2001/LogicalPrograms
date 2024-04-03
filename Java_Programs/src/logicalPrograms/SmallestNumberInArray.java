package logicalPrograms;

public class SmallestNumberInArray {
public static void main(String[] args) {
	int[] arr= {24,28,12,8,30,45,32};
	int temp=0;
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr.length;j++) {
			
			if(arr[i]<arr[j]) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;	
			}
		}
	}
	
	System.out.println("First smallest Number: "+arr[0]);
	System.out.println("Second smallest Number: "+arr[1]);
	System.out.println("Third smallest Number: "+arr[2]);
}
}
