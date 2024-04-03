package JavaProgramsTasks;

//Find third largest number from integer array without sorting
public class Question44 {
public static void main(String[] args) {
	int arr[]= {10,46,32,28,90,16};
	int max=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(max<arr[i]) {
			max=arr[i];
		}
	}
	System.out.println("Maximum Number in array: "+max);
}
}
