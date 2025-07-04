package Assignmnt;
import java.util.*;
public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] a= {1,2,3,4,5,6,7};
		System.out.println("Enter K: ");
		int k=sc.nextInt();
		int n=a.length;
		k=k%n;
		for(int i=0;i<k;i++) {
			int temp=a[n-1];
			for(int j=n-1;j>0;j--) {
				a[j]=a[j-1];
			}
			a[0]=temp;
		}
		System.out.println(Arrays.toString(a));
		

	}

}
