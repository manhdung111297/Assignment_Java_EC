package java_core_example12;

import java.util.Scanner;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 16 thg 9, 2023  22:47:29
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class Car extends Vehicle {
	private int numberOfSeats;
	private String engineType;

	/**
	 * @param id
	 * @param manufacturer
	 * @param yearOfManufacture
	 * @param price
	 * @param color
	 * @param vehicleType
	 * @param numberOfSeats
	 * @param engineType
	 */
	public Car(String id, String manufacturer, int yearOfManufacture, double price, String color, int vehicleType,
			int numberOfSeats, String engineType) {
		super(id, manufacturer, yearOfManufacture, price, color, vehicleType);
		this.numberOfSeats = numberOfSeats;
		this.engineType = engineType;
	}
	public Car() {
		super();
	}
	/**
	 * @return the numberOfSeats
	 */
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	/**
	 * @param numberOfSeats the numberOfSeats to set
	 */
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	/**
	 * @return the engineType
	 */
	public String getEngineType() {
		return engineType;
	}
	/**
	 * @param engineType the engineType to set
	 */
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public void inputCar(Scanner sc) {
		System.out.println("Nhập mã xe: ");
		this.id = sc.next();
		System.out.println("Nhập hãng sản xuất: ");
		this.manufacturer = sc.next();
		System.out.println("Nhập năm sản xuất: ");
		this.yearOfManufacture = sc.nextInt();
		System.out.println("Nhập giá bán: ");
		this.price = sc.nextDouble();
		System.out.println("Nhập màu xe: ");
		this.color = sc.next();
		System.out.println("Nhập số chổ ngồi");
		this.numberOfSeats = sc.nextInt();
		System.out.println("Nhập kiểu động cơ");
		this.engineType = sc.next();
		System.err.println("Thêm xe ô tô thành công");
	
	}
	@Override
	public String toString() {
		return super.toString() + " ," +  "Car [numberOfSeats=" + numberOfSeats + ", engineType=" + engineType + "]";
	}
	
	
	
	
	
	
	
	
	


	
	
	

}
