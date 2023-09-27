package java_core_example12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 16 thg 9, 2023  22:53:29
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class Main {

	/**
	 * @param args
	 */
	private static Scanner sc = new Scanner(System.in);
	private static List<Vehicle> vehicles = new ArrayList<>();
	public static void main(String[] args) {
		while (true) {
			System.out.println("*****************************************");
			System.out.println("    Chương trình quản lý phương tiện    ");
			System.out.println("                Giao Thông          ");
			System.out.println("*****************************************");
			System.out.println("Các chức năng của chương trình:");
			System.out.println("1. Thêm phương tiện giao thông");
			System.out.println("2. Hiện thị phương tiện");
			System.out.println("3. Tìm phương tiện theo hãng sản xuất, màu");
			System.out.println("4. Xóa phương tiên giao thông");
			System.out.println("5. Thoát chương trình");
			System.out.print("Vui lòng chọn chức năng: ");

			int num = sc.nextInt();
			sc.nextLine(); 

			switch (num) {
			case 1:
				VehicleService.insertVehicle(vehicles);
				break;
			case 2:
				vehicles.forEach(System.out::println);
				    break;
			case 3:
				System.out.println("Nhập hãng sản xuất cần tìm");
				String findManufacturer = sc.next();
				System.out.println("Nhập màu cần tìm");
				String findColor = sc.next();
				Vehicle vehicle =  VehicleService.findVehicleById(vehicles, findManufacturer, findColor);
				System.out.println(vehicle.toString());
				break;
			case 4:
				System.out.print("Nhập Id phương tiện để xóa: ");
				String vehicleId = sc.nextLine();
				VehicleService.deleteVehicleById(vehicles, vehicleId);
				break;
			case 5:
				System.out.println("Thoát chương trình.");
				System.exit(0);
			default:
				System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
			}
		}

	}

}
