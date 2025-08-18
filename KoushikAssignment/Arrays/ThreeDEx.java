package Arrays;
import java.util.Scanner;
public class ThreeDEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter length of 3d array: ");
		int n=s.nextInt();
		int[][][] a=new int[n][][];
		for(int i=0;i<a.length;i++)
		{	
			System.out.print("Enter rows: ");
			int rows=s.nextInt();
			a[i]=new int[rows][];
			for(int j=0;j<a[i].length;j++) {
				System.out.print("Enter columns: ");
				int col=s.nextInt();
				a[i][j]=new int[col];
				for(int k=0;k<a[i][j].length;k++) {
					System.out.println("enter value: ");
					a[i][j][k]=s.nextInt();
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{	
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.print(a[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
