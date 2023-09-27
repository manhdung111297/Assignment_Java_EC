package util;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 20 thg 9, 2023  16:22:48
* @System_Name    : example14
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class InvalidDOBException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public InvalidDOBException(String message) {
		super(message);
	}

}
