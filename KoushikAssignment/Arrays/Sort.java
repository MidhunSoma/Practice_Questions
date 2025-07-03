package Arrays;
import java.util.*;
public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,4,3,7,9,8,12,34,14};
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		System.out.println(Arrays.toString(arr));
		

	}

}
