import java.util.Scanner;
public class Kshape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows: ");
		int rows=sc.nextInt();
		for(int i=0;i<rows;i++) // i is initated for rows
		{
			System.out.print("*");
			for(int j=0;j<rows-i-1;j++) //j is initiated for spaces
			{
				System.out.print(" ");
			}
			System.out.println("*");
		}
			for(int k=1;k<rows;k++)    //k is initiated for rows
			{
				System.out.print("*");
				for(int j=0;j<k;j++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
			
			
//			System.out.println();
		
		}
	}


