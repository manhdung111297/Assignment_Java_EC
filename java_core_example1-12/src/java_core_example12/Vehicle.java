package java_core_example12;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 16 thg 9, 2023  22:45:52
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public abstract class Vehicle {
	protected String id;
    protected String manufacturer;
    protected int yearOfManufacture;
    protected double price;
    protected String color;
    protected int vehicleType;

	/**
	 * @param id
	 * @param manufacturer
	 * @param yearOfManufacture
	 * @param price
	 * @param color
	 * @param vehicleType
	 */
	public Vehicle(String id, String manufacturer, int yearOfManufacture, double price, String color, int vehicleType) {
		super();
		this.id = id;
		this.manufacturer = manufacturer;
		this.yearOfManufacture = yearOfManufacture;
		this.price = price;
		this.color = color;
		this.vehicleType = vehicleType;
	}
	/**
	 * 
	 */
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}
	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	/**
	 * @return the yearOfManufacture
	 */
	public int getYearOfManufacture() {
		return yearOfManufacture;
	}
	/**
	 * @param yearOfManufacture the yearOfManufacture to set
	 */
	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the vehicleType
	 */
	public int getVehicleType() {
		return vehicleType;
	}
	/**
	 * @param vehicleType the vehicleType to set
	 */
	public void setVehicleType(int vehicleType) {
		this.vehicleType = vehicleType;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", manufacturer=" + manufacturer + ", yearOfManufacture=" + yearOfManufacture
				+ ", price=" + price + ", color=" + color + "]";
	}
	
	
    
    

}
