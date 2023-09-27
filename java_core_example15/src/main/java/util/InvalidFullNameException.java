package util;

public class InvalidFullNameException extends Exception {

	/**
	 * Validate thông báo Exception không đúng định dạng 
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidFullNameException(String message) {
		super(message);
	}

}
