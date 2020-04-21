/*Find second largest element in the array*/
package Arrays;

public class Print2largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,35,1,10,34,1};
		int n = arr.length;
		print2largest(arr,n);

	}

	private static void print2largest(int[] arr, int arr_size) {
		// TODO Auto-generated method stub
		int i = 0,first,second;
		
		if(arr_size<2) {
			System.out.println("invalid input");
			return;
		}
		first = second = Integer.MIN_VALUE;
		for(i=0;i<arr_size;i++)
		{
			if(arr[i] >first) {
				second=first;
				first=arr[i];
			}
			else if(arr[i]>second && arr[i]!=first)
				second=arr[i];
			
		}
		if(second==Integer.MIN_VALUE)
			System.out.println("There is no second largest element");
		
		else
			System.out.println("The second largest element is"
					+second);
	
		
		
	}

}
