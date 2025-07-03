import java.util.Scanner;
public class FibSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length: ");
		int a=sc.nextInt();
		int[] seq=new int[a];
		System.out.println("Enter sequence: ");
		for(int i=0;i<=a;i++)
		{
			seq[i]=sc.nextInt();
		}
		boolean b=true;
		for(int j=2;j<a;j++)
		{
			if(seq[j]!=seq[j-1]+seq[j-2])
			{
				b=false;
				break;
			}
		}
	}
}
