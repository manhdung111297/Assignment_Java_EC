package java_core_example4;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 23 thg 9, 2023  17:11:19
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class Person {
	private String fullName;
	private int age;
	private String job;
	private String idCardNumber;
	/**
	 * @param fullName
	 * @param age
	 * @param job
	 * @param idCardNumber
	 */
	public Person(String fullName, int age, String job, String idCardNumber) {
		super();
		this.fullName = fullName;
		this.age = age;
		this.job = job;
		this.idCardNumber = idCardNumber;
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
	 * @return the job
	 */
	public String getJob() {
		return job;
	}
	/**
	 * @param job the job to set
	 */
	public void setJob(String job) {
		this.job = job;
	}
	/**
	 * @return the idCardNumber
	 */
	public String getIdCardNumber() {
		return idCardNumber;
	}
	/**
	 * @param idCardNumber the idCardNumber to set
	 */
	public void setIdCardNumber(String idCardNumber) {
		this.idCardNumber = idCardNumber;
	}
	@Override
	public String toString() {
		return "Person [fullName=" + fullName + ", age=" + age + ", job=" + job + ", idCardNumber=" + idCardNumber
				+ "]";
	}
	
	
	
}
