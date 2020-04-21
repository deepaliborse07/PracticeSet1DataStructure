/*Largest sum contiguous array*/
package Arrays;

public class Kadane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {-2,-3,4,-1,-2,1,5,-3};
		System.out.println("Maximum contiguous sum is"+
		maxSubArraySum(a));

	}

	private static int maxSubArraySum(int[] a) {
		// TODO Auto-generated method stub
		int size=a.length;
		int max_so_far=Integer.MIN_VALUE,max_ending_here=0;
		
		for(int i=0;i<size;i++) {
			max_ending_here=max_ending_here+a[i];
			if(max_so_far<max_ending_here)
				max_so_far=max_ending_here;
			if(max_ending_here<0) {
				max_ending_here=0;
			}
		}
		return max_so_far;
	}

}
