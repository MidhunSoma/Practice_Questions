package Arrays;

public class LeadersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {16, 17, 4, 3, 5, 2}; 
	        solve(arr); 
	    } 
	 
	    public static void solve(int[] arr) { 
	        // Step 1: Start from rightmost element 
	    	int leader=arr[arr.length-1];
	    	System.out.print(leader);
	    	// Step 2: Track maxFromRight and print leaders 
	    	for(int i=arr.length-2;i>=0;i--) {
	    		if(arr[i]>leader) {
	    			leader=arr[i];
	    			System.out.print(" "+leader);
	    		}
	    	}
	        
	    }

	}


