package ArrayPrograms;

public class MaximumNoInArrayUsingOneLoop {
public static void main(String[] args) {
	int arr[]= {23,12,46,28,25,10};
	int max=arr[0];
	
	for(int i=0;i<arr.length;i++) {
		if(max<arr[i]) {
			max=arr[i];
		}
	}
	System.out.println("Maximum Number: "+max);
}
}
