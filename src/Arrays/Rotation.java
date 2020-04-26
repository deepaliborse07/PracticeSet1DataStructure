/*Program for Array Rotation*/
package arrays;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr=new int[] {1,2,3,4,5};
		
		//count of rotation
		int n=2;
		
		//displays the array
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"");
		}
		//rotate the array
		for(int i=0;i<n;i++) {
			
			int j,last;
			
			
			last=arr[arr.length-1];
			
			for(j=arr.length-1;j>0;j--) {
				//shift element f array by 1
				arr[j]=arr[j-1];
			}
			
			arr[0]=last;
			
		}
		System.out.println();
		
		//displaying array after rotation
		System.out.println("array after rotation");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i] +"");
		}
		

	}

}
