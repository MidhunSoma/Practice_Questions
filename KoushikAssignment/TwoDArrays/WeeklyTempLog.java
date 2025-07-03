package TwoDArrays;
import java.util.*;
public class WeeklyTempLog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float[][] temp=new float[2][7];
		for(int i=0;i<2;i++) {
			System.out.println("city "+(i+1)+" Temperature : ");
			for(int j=0;j<7;j++) {
				System.out.print("Day "+(j+1)+": ");
				temp[i][j]=sc.nextFloat();
			}
		}
		for(int i=0;i<2;i++) {
			float total=0;
			for(int j=0;j<7;j++) {
				total+=temp[i][j];
				
			}
			System.out.println("Average Temperature of City-"+(i+1)+" is "+(total/7));
		}

	}

}
