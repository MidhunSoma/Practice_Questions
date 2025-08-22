package Examm;
import java.util.*;
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[][] seats=new int[10][10];
		boolean status[][]=new boolean[10][10];
		for(int i=1;i<seats.length+1;i++)
		{
			for(int j=1;j<seats.length+1;j++)
			{
				seats[i-1][j-1]=0;
				status[i-1][j-1]=false;
			}
		}
		boolean flag=true;
		while(flag) {
		System.out.println("1.Book Tickets\n 2.Cancel Tickets\n 3.Show Status\n 4.Exit");
		System.out.println("Enter choice: ");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			for(int i=1;i<seats.length+1;i++)
			{
				for(int j=1;j<seats.length+1;j++)
				{
					System.out.print(seats[i-1][j-1]+" ");
				}
				System.out.println();
			}
			System.out.println("Enter Seat Number to book(row,col):");
			int row=sc.nextInt();
			int col = sc.nextInt();
			System.out.println("You entered row: " + row + ", column: " + col);
			seats[row-1][col-1]=1;
			status[row-1][col-1]=true;
			for(int i=0;i<seats.length-1;i++)
			{
				for(int j=0;j<seats.length-1;j++)
				{
					System.out.print(seats[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("Tickets Booked Succesfully");
			break;
		case 2:
			System.out.println("Enter Seat Number to cancel(row,col):");
			int crow=sc.nextInt();
			int ccol = sc.nextInt();
			System.out.println("You entered row: " + crow + ", column: " + ccol);
			if(status[crow][ccol]==true) {
				status[crow][ccol]=false;
				seats[crow][ccol]=0;
				System.out.println("Tickets Cancelled Sucessfully");
			}
			else
				System.out.println("Select Booked tickets to cancel");
			break;
		case 3:
			for(int i=1;i<seats.length+1;i++)
			{
				for(int j=1;j<seats.length+1;j++)
				{
					System.out.print(status[i-1][j-1]+" ");
				}
				System.out.println();
			}
			
		case 4:
			flag=false;
			break;
			
			
		
		
		
		
	}
	}
	}}
