package java_core_example9;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 15 thg 9, 2023  14:59:12
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class Receipt {
	private String receiptId;
	private int electricNumberOld;
	private int price;
	private Customer customer;
	/**
	 * @param receiptId
	 * @param electricNumberOld
	 * @param price
	 */
	public Receipt(String receiptId, int electricNumberOld, int price) {
		super();
		this.receiptId = receiptId;
		this.electricNumberOld = electricNumberOld;
		this.price = price;
	}
	
	/**
	 * 
	 */
	public Receipt() {
		super();
	}

	/**
	 * @return the receiptId
	 */
	public String getReceiptId() {
		return receiptId;
	}
	/**
	 * @param receiptId the receiptId to set
	 */
	public void setReceiptId(String receiptId) {
		this.receiptId = receiptId;
	}
	/**
	 * @return the electricNumberOld
	 */
	public int getElectricNumberOld() {
		return electricNumberOld;
	}
	/**
	 * @param electricNumberOld the electricNumberOld to set
	 */
	public void setElectricNumberOld(int electricNumberOld) {
		this.electricNumberOld = electricNumberOld;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPriceElection() {
        return (customer.getElectricNumber() + electricNumberOld)* 5;
    }
	

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Receipt [receiptId=" + receiptId + ", electricNumberOld=" + electricNumberOld + ", price=" + price
				+ ", customer=" + customer + "]";
	}
	
	

}
