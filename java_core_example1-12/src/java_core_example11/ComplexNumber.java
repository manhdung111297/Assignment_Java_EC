package java_core_example11;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 16 thg 9, 2023  21:22:40
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class ComplexNumber {
	private double number;

	/**
	 * @param number
	 */
	public ComplexNumber(double number) {
		super();
		this.number = number;
	}
	

	/**
	 * 
	 */
	public ComplexNumber() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the number
	 */
	public double getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(double number) {
		this.number = number;
	}
	
	// Sum number
	public double sumNumber(double a, double b) {
		return a + b;
	}
	
	// Multiplication number
	public double multipNumber(double a, double b) {
		return a * b;
	}
	

}
