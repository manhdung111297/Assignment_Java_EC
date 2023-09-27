package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CheckValidate {
	/*
	 * Phương thức check ContractType
	 * 
	 * @Param int ContractType
	 */
	// validate ID bắt đầu bằng PS
	// StartsWith sử dụng để kiểm tra tiền tố của chuỗi có khớp với giá trị tiền tố
	// đã nhập không
	public static void isfullName(String fullName) throws InvalidFullNameException {

		if (fullName.length() <= 10 || fullName.length() > 50) {
			throw new InvalidFullNameException("Error: Invalid name. Please enter again");
		}

	}

//	public static void isphone(String phone) throws InvalidPhoneNumberException {
//				
//		if (phone.length() < 10 && (!phone.startsWith("090") && !phone.startsWith("098") && !phone.startsWith("091")
//				&& !phone.startsWith("031") && !phone.startsWith("035") && !phone.startsWith("038"))) {
//			throw new InvalidPhoneNumberException("Error: Invalid phone Number. Please enter again");
//		}
//	}
	public static void isphone(String phone) throws InvalidPhoneNumberException {
	    String regex = "^(090|098|091|031|035|038)\\d{7}$";
	    if (!phone.matches(regex)) {
	        throw new InvalidPhoneNumberException("Error: Invalid phone Number. Please enter again");
	    }
	}

	// validate ngày test nhỏ hơn ngày hiện tại
	// Calendar là lớp trừa tượng phương thức chuyển đổi ngày giữa một thời điểm
	// MONTH, YEAR, HOUR....
//	public static boolean isTestDate(String testDate) {
//		Calendar ca1 = Calendar.getInstance();
//		Calendar ca2 = Calendar.getInstance();
//		ca1.setTime(convertStringToDate(testDate));
//		if (ca1.getTime().after(ca2.getTime())) {
//			return false;
//		} else {
//			return true;
//		}
//	}

	/*
	 * Phương thức convert Date.sql sang Date.util
	 */
	public static Date convertSqlToUtilDate(java.sql.Date sqlDate) {
		return new Date(sqlDate.getTime());
	}

	/*
	 * Phương thức convert Date.util sang Date.sql
	 */
	public static java.sql.Date convertUtilToSqlDate(Date date) {
		return new java.sql.Date(date.getTime());
	}

	/*
	 * Phương thức convert String sang Date.util với kiểu dd-MM-yyyy
	 */
//	public static Date  convertStringToDate(String strDate) {
//		Date date = null;
//		
//		try {
//			date = new SimpleDateFormat("dd/MM/yyyy").parse(strDate);
//		} catch (ParseException e) {
//			System.err.println("Date format errror!");
//		}
//		return date;
//	}
	public static Date convertStringToDate(String strDate) throws InvalidDOBException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date date = sdf.parse(strDate);
			return date;
		} catch (ParseException e) {
//			System.err.println("Invalid date format. Please enter date in the format dd/MM/yyyy.");
			throw new InvalidDOBException("Invalid date format. Please enter date in the format dd/MM/yyyy.");
		
		}
	}

}
