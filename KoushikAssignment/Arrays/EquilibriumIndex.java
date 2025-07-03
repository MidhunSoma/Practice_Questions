package Arrays;

public class EquilibriumIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 3, 5, 2, 2}; 
        solve(arr); 
    } 
 
    public static void solve(int[] arr) { 
        // Step 1: Calculate total sum 
    	int sum=0;
    	for(int a:arr) {
    		sum+=a;
    	}
    
        // Step 2: Loop and compare leftSum with rightSum 
    	int leftsum=0;
    	for(int i=0;i<arr.length;i++) {
    		sum-=arr[i];
    		if(leftsum==sum) {
    			System.out.println("Equilibrium index: "+i);
    			return;
    		}
    		leftsum+=arr[i];
    		
    	}
        System.out.println("No Equilibrium Index found");
    }

	}


