package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import service.EmployeeService;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	private static List<Employee> employees = new ArrayList<Employee>();
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		while (true) {
			showMenu();
			int num = Integer.parseInt(sc.nextLine());
			while (num > 5 || num < 1) {
				System.out.println("Bạn lựa chọn chức năng từ 1 đến 5");
				num = Integer.parseInt(sc.nextLine());
			}
			switch (num) {
			case 1:
				EmployeeService.insertEmployee(sc, employees);
				break;
			case 2:
				EmployeeService.showEmployee(employees);
				break;
			case 3:
				System.out.println("Nhập mã nhân viên cần để sửa: ");
				String employeeID = sc.nextLine();
				System.out.println("input FullName New:");
				String newFullName = sc.nextLine();
				EmployeeService.editEmployeeById(employeeID, employees, newFullName);
				break;
			case 4:
				System.out.println("Nhập mã nhân viên cần để xóa: ");
				String empId = sc.nextLine();
				EmployeeService.deleteEmployeeById(employees, empId);
				break;
			case 5:
				EmployeeService.findEmployeeByType(employees);
				break;
			case 6:
				System.out.println("Thoát chương trình.");
				System.exit(0);
			default:
				System.out.print("Lựa chọn không hợp lệ! Vui lòng nhập lại \n ");
				break;
			}

		}
	}

	public static void showMenu() {
		System.out.println("*****************************************");
		System.out.println("    Chương trình quản lý nhân viên    ");
		System.out.println("                Công Ty            ");
		System.out.println("*****************************************");
		System.out.println("Mời bạn lựa chọn chức năng.");
		System.out.println("Chức năng 1: Nhập thông tin nhân viên ");
		System.out.println("Chức năng 2: Hiện thị tất cả nhân viên. ");
		System.out.println("Chức năng 3: Sửa lại thông tin nhân viên.");
		System.out.println("Chức năng 4: Xóa nhân viên.");
		System.out.println("Chức năng 5: Tìm tất cả các nhân viên theo Inter, Fresher, Experience.");
		System.out.println("Chức năng 6: Thoát chương trình.");
	}

}
