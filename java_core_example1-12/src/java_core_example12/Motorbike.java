package java_core_example12;

import java.util.Scanner;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 16 thg 9, 2023  22:51:10
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class Motorbike extends Vehicle {
	private double power;

	

	/**
	 * @param id
	 * @param manufacturer
	 * @param yearOfManufacture
	 * @param price
	 * @param color
	 * @param vehicleType
	 * @param power
	 */
	public Motorbike(String id, String manufacturer, int yearOfManufacture, double price, String color, int vehicleType,
			double power) {
		super(id, manufacturer, yearOfManufacture, price, color, vehicleType);
		this.power = power;
	}
	public Motorbike() {
		super();
	}
	/**
	 * @return the power
	 */
	public double getPower() {
		return power;
	}

	/**
	 * @param power the power to set
	 */
	public void setPower(double power) {
		this.power = power;
	}
	
	public void inputMotorbike(Scanner sc) {
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
		System.out.println("Nhập công suất");
		this.power = sc.nextDouble();
		System.err.println("Thêm xe máy thành công");

	
	}
	@Override
	public String toString() {
		return super.toString() + " ," + "Motorbike [power=" + power + "]";
	}


}
