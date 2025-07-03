import java.util.Scanner;

public class Table17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Table number: ");
		int a=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(a+" x "+i+" = "+(a*i));
		}
		
	}

}
