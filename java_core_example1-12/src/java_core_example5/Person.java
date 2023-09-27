package java_core_example5;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 13 thg 9, 2023  14:18:57
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class Person {
	private String name;
	private int age;
	private String addres;
	private String cmnd;
	private String phone;
	/**
	 * @param name
	 * @param age
	 * @param addres
	 * @param cmnd
	 * @param phone
	 */
	public Person(String name, int age, String addres, String cmnd, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.addres = addres;
		this.cmnd = cmnd;
		this.phone = phone;
	}
	/**
	 * 
	 */
	public Person() {
		super();
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @return the addres
	 */
	public String getAddres() {
		return addres;
	}
	/**
	 * @param addres the addres to set
	 */
	public void setAddres(String addres) {
		this.addres = addres;
	}
	/**
	 * @return the cmnd
	 */
	public String getCmnd() {
		return cmnd;
	}
	/**
	 * @param cmnd the cmnd to set
	 */
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	

}
