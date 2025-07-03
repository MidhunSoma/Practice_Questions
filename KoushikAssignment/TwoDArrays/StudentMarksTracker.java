package TwoDArrays;
import java.util.*;
public class StudentMarksTracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[][] marks=new int[4][3];
		
		for(int i=0;i<4;i++) {
			System.out.println("enter student  "+(i+1)+" marks");
			for(int j=0;j<3;j++) {
				System.out.print("Enter subject "+(j+1)+" marks: ");
				marks[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<4;i++) {
			int total=0;
			for(int j=0;j<3;j++) {
				total+=marks[i][j];
			}
			System.out.println("Total marks of Student "+(i+1)+" is "+total);
		}

	}

}
