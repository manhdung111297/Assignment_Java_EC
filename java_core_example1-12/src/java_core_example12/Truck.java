package java_core_example12;

import java.util.Scanner;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 16 thg 9, 2023  22:52:26
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class Truck extends Vehicle {
	private int payload;

	

	/**
	 * @param id
	 * @param manufacturer
	 * @param yearOfManufacture
	 * @param price
	 * @param color
	 * @param vehicleType
	 * @param payload
	 */
	public Truck(String id, String manufacturer, int yearOfManufacture, double price, String color, int vehicleType,
			int payload) {
		super(id, manufacturer, yearOfManufacture, price, color, vehicleType);
		this.payload = payload;
	}
	public Truck() {
		super();
	}
	/**
	 * @return the payload
	 */
	public double getPayload() {
		return payload;
	}

	/**
	 * @param payload the payload to set
	 */
	public void setPayload(int payload) {
		this.payload = payload;
	}
	
	public void inputTruck(Scanner sc) {
		System.out.println("Nhập mã xe: ");
		this.id = sc.nextLine();
		System.out.println("Nhập hãng sản xuất: ");
		this.manufacturer = sc.nextLine();
		System.out.println("Nhập năm sản xuất: ");
		this.yearOfManufacture = sc.nextInt();
		System.out.println("Nhập giá bán: ");
		this.price = sc.nextDouble();
		System.out.println("Nhập màu xe: ");
		this.color = sc.nextLine();
		System.out.println("Nhập trọng tải: ");
		this.payload = sc.nextInt();
		System.err.println("Thêm xe tải thành công");
	}
	@Override
	public String toString() {
		return super.toString() + " ," + "Truck [payload=" + payload + "]";
	}

}
