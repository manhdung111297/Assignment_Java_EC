package util;

import java.util.List;
import java.util.regex.Pattern;

import entities.Employee;

/**
 * The Class Validator.
 */
public class Validator {
	
	/** The Constant EMAIL_REGEX. */
	private static final String EMAIL_REGEX = "^[a-zA-Z][a-zA-Z0-9]+@fpt.com$";
	
	/** The Constant PHONE_REGEX. */
	private static final String PHONE_REGEX = "^0[1-9]{9}$";

	/**
	 * Valid email.
	 *
	 * @param email the email
	 * @return true, if successful
	 */
	public static boolean isValidEmail(String email) {

		Pattern pattern = Pattern.compile(EMAIL_REGEX);
		return pattern.matcher(email).matches();

	}

	/**
	 * Valid phone.
	 *
	 * @param phone the phone
	 * @return true, if successful
	 */
	public static boolean isValidPhone(String phone) {
		Pattern pattern = Pattern.compile(PHONE_REGEX);
		return pattern.matcher(phone).matches();
	}

	/**
	 * Checks if is id exists.
	 *
	 * @param idToCheck the id to check
	 * @param employees the employees
	 * @return true, if is id exists
	 */
	public static boolean isIdExists(String idToCheck, List<Employee> employees) {
		for (Employee employee : employees) {
			if (employee.getEmployeeID().equals(idToCheck)) {
				return true;
			}
		}
		return false;
	}

}
