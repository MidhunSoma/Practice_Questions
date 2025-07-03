package Arrays;
import java.util.*;
public class Products {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] arr=new float[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter prices of 5 PRODUCTS: ");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextFloat();
		}
		float sum=0;
		for(float a:arr) {
			sum+=a;
		}
		float temp;
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<5;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		System.out.println("Total Cost: "+sum);
		System.out.println("Highest Price "+arr[arr.length-1]);
		System.out.println("Lowest Price: "+arr[0]);
		System.out.println("Average: "+(sum/5.0));

	}

}
