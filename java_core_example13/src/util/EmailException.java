package util;

public class EmailException extends Exception {

	private static final long serialVersionUID = 1L;

	public EmailException(String email) {
		super(email);
	}

}
