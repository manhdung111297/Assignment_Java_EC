package java_core_example1;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 17 thg 9, 2023  15:45:06
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public abstract class Officer {
	private String fullName;
	private int age;
	private SexType sexType;
	private String address;
	/**
	 * @param fullName
	 * @param age
	 * @param sexType
	 * @param address
	 */
	public Officer(String fullName, int age, SexType sexType, String address) {
		super();
		this.fullName = fullName;
		this.age = age;
		this.sexType = sexType;
		this.address = address;
	}

	
	/**
	 * 
	 */
	public Officer() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}
	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the sexType
	 */
	public SexType getSexType() {
		return sexType;
	}
	/**
	 * @param sexType the sexType to set
	 */
	public void setSexType(SexType sexType) {
		this.sexType = sexType;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Officer [fullName=" + fullName + ", age=" + age + ", sexType=" + sexType + ", address=" + address + "]";
	}

	
	
	
}
