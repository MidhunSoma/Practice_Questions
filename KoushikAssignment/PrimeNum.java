import java.util.Scanner;
public class PrimeNum {
	public static void Prime(int n)
	{
		int count=0;
		for(int i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				count+=1;
			}
		}
		if(count<2)
		{
			System.out.println(n);
		}
		
	}
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int a=sc.nextInt();
		for(int j=2;j<=a;j++)
		{
			Prime(j);
		}
		sc.close();
	}
	

}
