package Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {12, 45, 67, 23, 89, 45}; 
	        solve(arr); 

	}
	 public static void solve(int[] arr) { 
	        // Step 1: Initialize two variables for first and second largest 
		 int first=arr[arr.length-1];
		 int second=arr[arr.length-2];
	        // Step 2: Loop through array and update values 
		 for(int i=0;i<arr.length;i++) {
			 if( arr[i]>first) {
				 second=first;
				 first=arr[i];
				 }
			 else if(arr[i]>second && arr[i]!=first) {
				 second=arr[i];
			 }
		 }
	        // Step 3: Print second largest 
		 System.out.println(second);
	    }

}
