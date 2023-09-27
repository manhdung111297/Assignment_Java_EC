package java_core_example9;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 15 thg 9, 2023  14:57:27
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class Customer {
	private String customerId;
	private String nameCustomer;
	private String address;
	private String phone;
	private int electricNumber;
	/**
	 * @param customerId
	 * @param nameCustomer
	 * @param address
	 * @param phone
	 * @param electricNumber
	 */
	public Customer(String customerId, String nameCustomer, String address, String phone, int electricNumber) {
		super();
		this.customerId = customerId;
		this.nameCustomer = nameCustomer;
		this.address = address;
		this.phone = phone;
		this.electricNumber = electricNumber;
	}
	
	/**
	 * 
	 */
	public Customer() {
		super();
	}

	/**
	 * @return the customerId
	 */
	public String getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	/**
	 * @return the nameCustomer
	 */
	public String getNameCustomer() {
		return nameCustomer;
	}
	/**
	 * @param nameCustomer the nameCustomer to set
	 */
	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
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
	 * @return the electricNumber
	 */
	public int getElectricNumber() {
		return electricNumber;
	}
	/**
	 * @param electricNumber the electricNumber to set
	 */
	public void setElectricNumber(int electricNumber) {
		this.electricNumber = electricNumber;
	}

	@Override
	public String toString() {
	    return "Customer [customerId=" + customerId + 
	           ", nameCustomer=" + nameCustomer + 
	           ", address=" + address + 
	           ", phone=" + phone + 
	           ", electricNumber=" + electricNumber + 
	           "]" + "\n" ;
	}
	

}
