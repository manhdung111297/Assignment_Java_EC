package java_core_example6;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 23 thg 9, 2023  17:29:09
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class Student {
	private String fullName;
	private int age;
	private String homeTown;
	/**
	 * @param fullName
	 * @param age
	 * @param homeTown
	 */
	public Student(String fullName, int age, String homeTown) {
		super();
		this.fullName = fullName;
		this.age = age;
		this.homeTown = homeTown;
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
	 * @return the homeTown
	 */
	public String getHomeTown() {
		return homeTown;
	}
	/**
	 * @param homeTown the homeTown to set
	 */
	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}
	@Override
	public String toString() {
		return "Student [fullName=" + fullName + ", age=" + age + ", homeTown=" + homeTown + "]";
	}
	
	

}
