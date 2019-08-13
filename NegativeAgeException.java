package Assignment_2;

public class NegativeAgeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NegativeAgeException(){
		super("Invalid Age");
	}

}
