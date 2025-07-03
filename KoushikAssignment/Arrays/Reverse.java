package Arrays;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		int size=arr.length;
		int temp;
		for(int i=0;i<size/2;i++) {
			temp=arr[i];
			arr[i]=arr[size-i-1];
			arr[size-i-1]=temp;
		}
		System.out.println(Arrays.toString(arr));
		

	}

}
