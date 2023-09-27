package java_core_example7;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 14 thg 9, 2023  14:27:17
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class Person {
	private String name;
	private int age;
	private String phone;
	private String address;
	/**
	 * @param name
	 * @param age
	 * @param phone
	 * @param address
	 */
	public Person(String name, int age, String phone, String address) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
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
		return "Person [name=" + name + ", age=" + age + ", phone=" + phone + ", address=" + address + "]";
	}
	

}
