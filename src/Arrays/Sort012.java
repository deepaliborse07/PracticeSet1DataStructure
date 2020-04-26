/*Sort arrays of 0's,1's,2's */
package arrays;

public class Sort012 {
	
	private static void sort012(int[] a, int arr_size) {
		// TODO Auto-generated method stub
		int lo=0;
		int hi=arr_size-1;
		int mid=0,temp=0;
		while(mid<=hi) {
			switch(a[mid]) {
			case 0:{
				temp=a[lo];
				a[lo]=a[mid];
				a[mid]=temp;
				lo++;
				mid++;
				break;
			}
			case 1:
				mid++;
				break;
				
			case 2:{
				temp=a[mid];
				a[mid]=a[hi];
				a[hi]=temp;
				hi--;
				break;
				
			}
			}
		}
	}
	

private static void printArray(int[] arr, int arr_size) {
	// TODO Auto-generated method stub
	int i;
	for(i=0;i<arr_size;i++)
		System.out.println(arr[i]+" ");
		System.out.println(" ");
}

//	public static 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,1,1,0,1,2,1,2,0,0,0,1};
		int arr_size=arr.length;
		sort012(arr,arr_size);
		System.out.println("Array after segregation");
		printArray(arr,arr_size);

	}




	
}