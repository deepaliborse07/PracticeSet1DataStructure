/*Find the sum of elements of each diagonal of N*N matrix */
package arrays;

public class SumDiagonal {
	
	private static void printSum(int[][] mat, int n) {
		// TODO Auto-generated method stub
		
		int principal=0,secondary=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) 
					principal+=mat[i][j];
				
				if((i+j)==(n-1))
					secondary+=mat[i][j];
			}
		}
		System.out.println("principal Diagonal" +principal);
		
		System.out.println("secondary Diagonal" +secondary);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a= {{1,2,3,4},
					{5,6,7,8},
					{1,3,3,4},
					{5,6,7,8}};
		
		printSum(a,4);

	}

	

}
