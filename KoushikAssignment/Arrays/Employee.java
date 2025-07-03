package Arrays;
import java.util.*;
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 Employee ID's: ");
		String[] arr=new String[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.next();
			
		}
		System.out.println(Arrays.toString(arr));
		

	}
	
}
