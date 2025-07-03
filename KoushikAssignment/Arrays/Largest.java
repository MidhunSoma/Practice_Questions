package Arrays;
import java.util.*;
public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of elements: ");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter elements: ");
			arr[i]=sc.nextInt();
		}
		int maxx=0;
		for(int i=0;i<size;i++)
			if(arr[i]>maxx) {
				maxx=arr[i];
			}
			System.out.println(maxx);
	}

}
