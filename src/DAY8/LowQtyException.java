package DAY8;
//Custom Exception
//User Defined Unchecked Exception
//public class LowQtyException extends Exception{} 
//for this always write a code in Try or catch block


//user defined unchecked Exception
//no need to write try or catch Block 
public class LowQtyException extends RuntimeException {
	public LowQtyException(String Msg) {
		super(Msg);
	}
}
