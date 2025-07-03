package Arrays;

public class PalindromeArray {

	public static void main(String[] args) {
		
		  int[] arr = {1, 2, 3, 2, 1}; 
		  solve(arr); 
		 } 
		 
		    public static void solve(int[] arr) { 
		        // Step 1: Initialize isPalindrome = true 
		    	boolean isPalindrome=true;
		        // Step 2: Compare elements from both ends 
		    	for(int i=0;i<arr.length/2;i++) {
		    		if(arr[i]!=arr[arr.length-i-1]) {
		    			isPalindrome=false;
		    		}
		    	}
		        // Step 3: Print result 
		    	System.out.println("is Palindrome? "+isPalindrome);
		    }

	}


