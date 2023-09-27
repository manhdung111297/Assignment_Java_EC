package java_core_example7;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 14 thg 9, 2023  14:37:27
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class Students extends Person {
	private String studentId;
	/**
	 * @param name
	 * @param age
	 * @param phone
	 * @param address
	 * @param studentId
	 */
	public Students(String name, int age, String phone, String address, String studentId) {
		super(name, age, phone, address);
		this.studentId = studentId;
	}

	/**
	 * 
	 */
	public Students() {
		super();
	}

	/**
	 * @return the studentId
	 */
	public String getStudentId() {
		return studentId;
	}

	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "Students [studentId=" + studentId + ", name=" + getName() + ", age=" + getAge()
				+ ", phone=" + getPhone() + ", address=" + getAddress() + "]";
	}



	
	
	

}
