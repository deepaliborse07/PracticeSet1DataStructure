/*Find subArray with given sum*/
package Arrays;

public class SubarraySum {
	
	int subArraySum(int arr[],int n,int sum) {
		
		int curr_sum,i,j;
		
		for(i=0;i<n;i++) {
			
			curr_sum=arr[i];
			
			for(j=i+1;j<n;j++) {
				
				if(curr_sum==sum) {
					
					int p=j-1;
					System.out.println("sum between the indexes"+i
							+ "and" +p);
					return 1;
				}
				if(curr_sum>sum||j==n) 
					break;
				curr_sum=curr_sum+arr[j];
					
				}
		}
		System.out.println("No subarray found");
		return 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubarraySum subarraysum=new SubarraySum();
		int arr[]= {10,2,4,8,9,5,10,23};
		int n=arr.length;
		int sum=23;
		subarraysum.subArraySum(arr, n, sum);

	}

}
