package util;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 18 thg 9, 2023  23:37:53
* @System_Name    : java_core_example13
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class PhoneException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public PhoneException(String phone) {
		super(phone);
	}

}
