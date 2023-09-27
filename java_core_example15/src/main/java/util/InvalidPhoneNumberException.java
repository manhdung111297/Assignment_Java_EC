package util;

public class InvalidPhoneNumberException extends Exception {

	/**
	 * Validate thông báo lỗi trùng nhau
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidPhoneNumberException(String message) {
		super(message);
	}


}
