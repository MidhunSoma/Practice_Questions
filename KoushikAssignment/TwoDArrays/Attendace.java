package TwoDArrays;
import java.util.*;
public class Attendace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[][] atd=new int[5][3];
		for(int i=0;i<3;i++) {
			System.out.println("Day "+(i+1)+" Attendance: ");
			for(int j=0;j<5;j++) {
				atd[j][i]=sc.nextInt();
			}
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(atd[i][j]);
			}
			System.out.println();
		}

	}

}
