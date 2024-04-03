package logicalPrograms;

public class FindingThirdLargestWithoutSorting {
public static void main(String[] args) {
	int[] arr= {23,65,30,10,5,54,28,42,18};
	int firstLargest = 0;
	int secondLargest =0;
	int thirdLargest = 0;
	for (int i = 0; i < arr.length; i++) {
		int arrVar = arr[i];
		if (firstLargest < arrVar) {
			thirdLargest = secondLargest; 
		    secondLargest=firstLargest;
			firstLargest = arrVar;
		}
		else if (secondLargest < arrVar) {
			thirdLargest = secondLargest;
				secondLargest = arrVar;
		}
		else if (thirdLargest < arrVar) {
			thirdLargest = arrVar;
				}
			}
	
     System.out.println("Third largest: "+thirdLargest);
     System.out.println("Second Largest: "+secondLargest);
     System.out.println("First Largest: "+firstLargest);	
	
}
}
