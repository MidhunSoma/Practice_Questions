package Assignmnt;

public class Seating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] cr={
			    {101, 102, 103, 104, 105},
			    {106, 107, 108, 109, 110},
			    {111, 112, 113, 114, 115},
			    {116, 117, 118, 119, 120}
			};
		int max=cr[0][0];
		int sum=0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(cr[i][j]+" ");
				if(cr[i][j]>max) {
					max=cr[i][j];
				}
			}
			System.out.println();
			
		}
		System.out.println();

		for(int i=0;i<4;i++) {
			int rsum=0;
			for(int j=0;j<5;j++) {
				sum+=cr[i][j];
				rsum+=cr[i][j];
			}
			System.out.println("Sum of row "+(i+1)+" student IDs: " +rsum);
			
		}
		System.out.println("Sum of all Student ID's: "+sum);
		System.out.println("Max: "+max);


	}

}
