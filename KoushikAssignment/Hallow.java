import java.util.Scanner;
public class Hallow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of square: ");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=a;j++)
			{
				if(i==1||i==a||j==1||j==a)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
			
		}

	}

}
