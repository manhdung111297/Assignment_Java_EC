
package java_core_example6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 23 thg 9, 2023  17:31:53
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class Main {
	private static Scanner sc = new Scanner(System.in);
	private static List<Student> listStudent = new ArrayList<>();

	public static void main(String[] args) {
		do {
			System.out.println("Chương trình quản lý Hồ sơ học sinh ");
			System.out.println("Các chức năng của chương trình");
			System.out.println("1. Thêm học sinh mới");
			System.out.println("2. Hiển thị các học sinh 20 tuổi");
			System.out.println("3. Hiển thị số lượng học sinh 23 tuổi và quê ở Đồng Nai");
			System.out.println("4. Thoát chương trình");
			System.out.println("-----------------------------------------");
			System.out.print("Vui lòng chọn chức năng: ");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.print("Nhập Họ Tên: ");
                String fullName = sc.nextLine();
                System.out.print("Nhập Tuổi: ");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.print("Nhập Quê Quán: ");
                String homeTown = sc.nextLine();
                Student student = new Student(fullName, age, homeTown);
                listStudent.add(student);
                System.out.println("Học sinh đã được thêm.");
				break;
			case 2:
				listStudent.stream()
                .filter(list -> list.getAge() == 20)
                .forEach(System.out::println);
				break;
			case 3: 
				long count = listStudent.stream()
                .filter(list -> list.getAge() == 23 && list.getHomeTown().equalsIgnoreCase("Đà Nẵng"))
                .count();
				System.out.println("Số lượng học sinh 23 tuổi và quê ở Đà Nẵng: " + count);
				break;
			case 4:
                System.out.println("Chương trình kết thúc.");
                System.exit(0);
			default:
				System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
			}
		} while (true);
	}

}
