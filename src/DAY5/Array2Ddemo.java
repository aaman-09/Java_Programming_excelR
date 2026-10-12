package DAY5;

public class Array2Ddemo {
	public static void main(StringExample[] args) {
		//int matrix[][] = new int [3][3]; for user input
		/*
		 * for(int i=0; i<3; i++)
		 * {
		 * 		for(int j=0; j<3; j++)
		 * 		{
		 * 			matrix[i][j] = sc.nextInt();
		 * 		}
		 * }
		 * */
		
		int matrix[][] = {{1,16,3},{4,5,22},{98,8,9}};
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		
		//print max num row-wise
		//use (int i=0; i<matrix[i].length; i++) 
		//for user input row or colume
		//for(int j=0; j<matrix[i].length; j++)  
		//for user input row or colume
		
		for(int i=0; i<3; i++) {
			int max = matrix[i][0];
			for(int j=0; j<3; j++) {
				if(matrix[i][j]>max) {
					max = matrix[i][j];
				}
			}
			System.out.println(max);
		}
	}
}
 	