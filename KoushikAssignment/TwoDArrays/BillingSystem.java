package TwoDArrays;
import java.util.*;
public class BillingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[][] bill=new float[3][3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("Customer "+(i+1));
			for(int j=0;j<3;j++) {
				System.out.print("Item "+(j+1)+" Bill is :");
				bill[i][j]=sc.nextFloat();
			}
		}
		for(int i=0;i<3;i++) {
			float total=0;
			System.out.print("Customer "+(i+1)+" Bill is: ");
			for(int j=0;j<3;j++) {
				total+=bill[i][j];
				
			}
			
			// Print the total bill for each customer	
			System.out.print("Rs."+total+"/- ");
			System.out.println("Rs."+total+"/-");
		}

	}

}
