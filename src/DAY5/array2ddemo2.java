package DAY5;

public class array2ddemo2 {

	public static void main(StringExample[] args) {
		int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("Display all element are: ");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Digonal element are: ");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				
				if(i==j) {
					System.out.print(matrix[i][j]+" ");
				}
			}
		}
		System.out.println();
		//upper triangle elements
		System.out.println("Display upper triangle element: ");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				
				if(i<j) {
					System.out.print(matrix[i][j]+" ");
				}
			}
		}
		
		System.out.println();
		//Lower triangle elements
		System.out.println("Display lower triangle element: ");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				
				if(i>j) {
					System.out.print(matrix[i][j]+" ");
				}
			}
		}
	}
}
