package JavaProgramsTasks;

//WAJP to merge 2 arrays
//Ex: input1: [1,2,3,4]  input2: [3,5,6,7,8]
//  output: [1,2,3,4,3,5,6,7,8]
public class Question30 {
public static void main(String[] args) {
	int v1[]= {1,2,3,4};
	int v2[]= {3,5,6,7,8};
	int res[]=new int[v1.length+v2.length];
	
	for(int i=0;i<res.length;i++) {
		if(i<v1.length) {
			res[i]=v1[i];			
		}
		else
		{
			res[i]=v2[i-v1.length];
		}
	}
	for(int k=0;k<res.length;k++) {
		System.out.print(res[k]+" ");
	}
}
}
