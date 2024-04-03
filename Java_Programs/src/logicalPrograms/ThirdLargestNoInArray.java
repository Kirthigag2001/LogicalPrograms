package logicalPrograms;

public class ThirdLargestNoInArray {
public static void main(String[] args) {
	
	int[] a= {10,83,25,2,6};
	int temp=0;
	
	for(int i=0;i<a.length-1;i++) {
		for(int j=1;j<a.length;j++) {
			if(a[i]<a[j]) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}
	System.out.println("Third Largest Number: "+a[a.length-3]);
}
}
