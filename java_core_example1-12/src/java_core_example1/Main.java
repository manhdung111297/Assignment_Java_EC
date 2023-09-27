package java_core_example1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 17 thg 9, 2023  15:58:46
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class Main {
	private static Scanner sc = new Scanner(System.in);
	private static List<Officer> officerList = new ArrayList<>();

	public static void main(String[] args) {
		while (true) {
			System.out.println("*****************************************");
			System.out.println("    Chương trình quản lý cán bộ    ");
			System.out.println("*****************************************");
			System.out.println("Các chức năng của chương trình:");
			System.out.println("1. Thêm mới cán bộ");
			System.out.println("2. Hiện thị danh sách các cán bộ");
			System.out.println("3. Tìm kiếm theo họ tên");
			System.out.println("4. Thoát chương trình");
			System.out.print("Vui lòng chọn chức năng: ");

			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1:
				OfficerService.insertOfficer(officerList);
				break;
			case 2:
				officerList.forEach(System.out::println);
				break;
			case 3:
				System.out.println("Nhập tên cán bộ cần tìm");
				String findName = sc.next();
				Officer officer = OfficerService.findOfficerByName(officerList, findName);
				System.out.println(officer.toString());
				break;
			case 4:
				System.out.println("Thoát chương trình.");
				System.exit(0);
			default:
				System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
			}
		}
	}
}
