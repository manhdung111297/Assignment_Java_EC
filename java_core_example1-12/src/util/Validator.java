package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

/**
 * @author        : DungLM6 @from         : DN23_FR_JAVA_04
 * 
 * @Created_date: 17 thg 9, 2023  13:16:38 @System_Name    :
 *                java_core @Version        : 1.0 @Create_by    : LENOVO
 */
public class Validator {
	private static final String PHONE_REGEX = "^0[0-9]{9}$";
	private static final String EMAIL_REGEX = "^[a-zA-Z][a-zA-Z0-9]+@fpt.com$";
	private static final String INTEGER_REGEX = "^[0-9]+$";

	// Validate Phone
	public static boolean validatePhone(String phone) {
		Pattern pattern = Pattern.compile(PHONE_REGEX);
		return pattern.matcher(phone).matches();
	}

	// Validate Email
	public static boolean validateEmail(String email) {

		Pattern pattern = Pattern.compile(EMAIL_REGEX);
		return pattern.matcher(email).matches();

	}
	
	//Validate input int
	public static boolean validInteger(String inputInt) {
		Pattern pattern = Pattern.compile(INTEGER_REGEX);
		return pattern.matcher(inputInt).matches();
	}
	
	
	//Valid Date Format
	public static boolean validDateFormat(String dateStr) {
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    sdf.setLenient(false);

	    try {
	        sdf.parse(dateStr);
	        return true; 
	    } catch (ParseException e) {
	    	System.out.println("Định dạng không hợp lệ. Vui lòng nhập lại");
	        return false; 
	    }
	}
	
	//Validate brithDay
	public static boolean validateDate(String birthDay) {
		boolean resultCheck = false;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdf.setLenient(false);
		Date date = new Date();
		try {
			date = sdf.parse(birthDay);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			if (calendar.get(Calendar.YEAR) > 1900
					|| calendar.get(Calendar.YEAR) < Calendar.getInstance().get(Calendar.YEAR)) {
				resultCheck = true;
			} else {
				resultCheck = false;
			}
		} catch (Exception e) {
			resultCheck = false;
		}
		return resultCheck;
	}

}
