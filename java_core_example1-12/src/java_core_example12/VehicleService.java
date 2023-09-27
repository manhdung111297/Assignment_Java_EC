package java_core_example12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 16 thg 9, 2023  22:57:47
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class VehicleService {
	
	//Add Veheicle
	public static void insertVehicle(List<Vehicle> vehicles) {
		Scanner sc = new Scanner(System.in);
		boolean isClose = false;
		
		while (!isClose) {
			System.out.println("Bạn vui lòng lựa chọn nhập thông tin xe tương ứng");
			System.out.println("1. Nhập thông tin xe ô tô");
			System.out.println("2. Nhập thông tin xe máy");
			System.out.println("3. Nhập thông tin xe bán tải");
			System.out.println("4. Quay lai menu chính");
			int num = sc.nextInt();
			try {
				switch (num) {
				case 1:
					Car car = new Car();
					System.out.println("Vui lòng nhâp thông tin xe ô tô");
					car.inputCar(sc);
					car.setVehicleType(num);
					vehicles.add(car);
					
					break;
				case 2:
					Motorbike motorbike = new Motorbike();
					System.out.println("Vui lòng nhâp thông tin xe máy");
					motorbike.inputMotorbike(sc);
					motorbike.setVehicleType(num);
					vehicles.add(motorbike);
					break;
				case 3:
					Truck truck = new Truck();
					System.out.println("Vui lòng nhâp thông tin xe tải");
					truck.inputTruck(sc);
					truck.setVehicleType(num);
					vehicles.add(truck);
					break;
				case 4:
					isClose = true;
					break;
				default:
					break;
				}
			} catch (Exception e) {
				System.err.println("Thực hiện thêm thay đổi không thành công");
			}

			
		}
	}
	
	//Find By Manufacture and Color
	public static Vehicle findVehicleById(List<Vehicle> vehicles, String manufacturer, String color) {
		return  vehicles.stream().filter(vehicless -> vehicless.getManufacturer().equals(manufacturer) 
				&& vehicless.getColor().equals(color)).findFirst().orElse(null);
		
	}
	
	//Delete Manufacture
	public static boolean deleteVehicleById(List<Vehicle> vehicles, String vehicleId) {
	Vehicle vehicle = vehicles.stream().filter(vehicless -> vehicless.getId().equals(vehicleId)).findFirst().orElse(null);
	if(vehicle != null) {
		vehicles.remove(vehicle);
		System.err.println("Bạn đã xóa thành công với id " + vehicleId);
		return true;
	}else {
		System.err.println("Xóa không thành công với id " + vehicleId);
		return false;
	}
	}
	

}
