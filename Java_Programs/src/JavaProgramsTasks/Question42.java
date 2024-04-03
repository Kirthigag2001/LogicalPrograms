package JavaProgramsTasks;

//WAJP to reverse the array
//Ex: input: [1,2,3,4,5]
//    output: [5,4,3,2,1]
//Note: Changing the position of the array elements and printing it in reverse order is different

public class Question42 {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	int size=arr.length-1;
	int res[]=new int[arr.length];
	for(int i=0;i<res.length;i++) {
		res[i]=arr[size];
		size--;
	}
	for(int k=0;k<=res.length-1;k++) {
		System.out.print(res[k]+" ");
	}
}
}
