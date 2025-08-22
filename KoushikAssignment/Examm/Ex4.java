package Examm;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
			    {1, 2, 3},
			    {4, 5, 6},
			    {7, 8, 9}
			};
		for(int i=0;i<3;i++) {
			System.out.print(matrix[0][i]+" ");	
		}
		for(int i=1;i<3;i++) {
			System.out.print(matrix[i][2]+" ");	
		}
		for(int i=1;i>=0;i--) {
			System.out.print(matrix[2][i]+" ");	
		}
		for(int i=0;i<2;i++) {
			System.out.print(matrix[1][i]+" ");	
		}

	}

}
