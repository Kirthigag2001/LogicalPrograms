package logicalPrograms;

//WAJP to merge 2 arrays in zigzag way
//Ex: input1: [1,2,3,4]  input2: [3,4,5,6]
//    output: [1,3,2,4,3,5,4,6]
public class Question31 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {3,4,5,6};
		int temp1=0;
		int temp2=0;
		int res[]=new int[a.length+b.length];
		for (int i = 0; i < res.length; i++) {
			if (i%2==0) {
                res[i]=a[temp1];
                temp1++;
			}
			else {
				res[i]=b[temp2];
				temp2++;
			}
		}
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]+" ");
	
	}

	}
}
