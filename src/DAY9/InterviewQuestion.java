package DAY9;

public class InterviewQuestion {

	public static void main(String[] args) {
		
		int result=divide(10,0);
		System.out.println(result);

	}

	private static int divide(int numerator, int denominator)
	{
		try
		{
			System.out.println(numerator/denominator);
			return 1;
		}
		catch(ArithmeticException ex)
		{
			return 2;    
		} //The finally block executes, and Java encounters another return statement
		finally    //it will display! because finally block have high demand than catch! 
		{
			return 3; //This return replaces the pending return value of 2.
						//Consequently, divide() returns 3, not 2.

		}
	}

}