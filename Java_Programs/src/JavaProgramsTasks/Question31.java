package JavaProgramsTasks;

//WAJP to merge 2 arrays in zigzag way
//Ex: input1: [1,2,3,4]  input2: [3,4,5,6]
//  output: [1,3,2,4,3,5,4,6]
public class Question31 {
public static void main(String[] args) {
	int v1[]= {1,2,3,4};
	int v2[]= {3,4,5,6};
	int res[]=new int[v1.length+v2.length];
	int sub1=0;
	int sub2=0;
	
	for(int i=0;i<res.length;i++) {
		if(i%2==0) {
			res[i]=v1[sub1];
			sub1++;
		}
		else {
			res[i]=v2[sub2];
			sub2++;
		}
	}
	
	for(int k=0;k<res.length;k++) {
		System.out.print(res[k]+" ");
	}
}
}
