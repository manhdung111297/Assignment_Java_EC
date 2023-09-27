package java_core_example8;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 23 thg 9, 2023  17:43:08
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class Student {
	private String fullName;
    private int age;
    private String className;
	/**
	 * @param fullName
	 * @param age
	 * @param className
	 */
	public Student(String fullName, int age, String className) {
		super();
		this.fullName = fullName;
		this.age = age;
		this.className = className;
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
	 * @return the className
	 */
	public String getClassName() {
		return className;
	}
	/**
	 * @param className the className to set
	 */
	public void setClassName(String className) {
		this.className = className;
	}
	@Override
	public String toString() {
		return "Student [fullName=" + fullName + ", age=" + age + ", className=" + className + "]";
	}
    
    

}
