package java_core_example4;

import java.util.Scanner;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 23 thg 9, 2023  17:16:22
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class Main {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		do {
			System.out.println("Chương trình quản lý Căn hộ chung cư");
			System.out.println("Các chức năng của chương trình");
			System.out.println("1. Thêm thông tin Hộ gia đình");
			System.out.println("2. Thoát chương trình");
			System.out.println("-----------------------------------------");
			System.out.print("Vui lòng chọn chức năng: ");
			int num = sc.nextInt();
			Town town = new Town();

			switch (num) {
			case 1:
				System.out.print("Nhập số hộ gia đình: ");
				int n = sc.nextInt();

				for (int i = 1; i <= n; i++) {
					System.out.println("Nhập thông tin hộ gia đình " + i + ":");
					System.out.print("Số nhà: ");
					int houseNumber = Integer.parseInt(sc.nextLine());
					System.out.print("Số thành viên: ");
					int numberOfMembers = Integer.parseInt(sc.nextLine()) ;
					Household household = new Household(numberOfMembers, houseNumber);
					for (int j = 1; j <= numberOfMembers; j++) {
						System.out.println("Nhập thông tin cho người " + j + ":");
						System.out.print("Họ và tên: ");
						String fullName = sc.nextLine();
						System.out.print("Tuổi: ");
						int age = Integer.parseInt(sc.nextLine()) ;
						System.out.print("Nghề Nghiệp: ");
						String occupation = sc.nextLine();
						System.out.print("Số CMND: ");
						String idCardNumber = sc.nextLine();
						Person person = new Person(fullName, age, occupation, idCardNumber);
						household.addPerson(person);
					}
					town.addHousehold(household);
				}
				System.out.println("Danh sách hộ gia đình trong khu phố:");
				town.displayNeighborhoodInfo();

				break;

			default:
				System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
			}
		} while (true);
	}

}
