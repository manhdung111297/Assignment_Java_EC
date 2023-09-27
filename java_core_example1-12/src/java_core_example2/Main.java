package java_core_example2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 17 thg 9, 2023  20:41:06
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class Main {
	private static Scanner sc  = new Scanner(System.in);
	private static List<Library> librarieList = new ArrayList<>();
	public static void main(String[] args) {
		while (true) {
			System.out.println("*****************************************");
			System.out.println("    Chương trình quản lý thư viện    ");
			System.out.println("*****************************************");
			System.out.println("Các chức năng của chương trình:");
			System.out.println("1. Thêm mới tài liệu");
			System.out.println("2. Hiện thị danh sách các tài liệu");
			System.out.println("3. Tìm kiếm theo loại trong thư viện");
			System.out.println("3. Xóa tài liệu trong thư viện");
			System.out.println("5. Thoát chương trình");
			System.out.print("Vui lòng chọn chức năng: ");

			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1:
				LibraryService.insertLibrary(librarieList);
				break;
			case 2:
				librarieList.forEach(System.out::println);
				break;
			case 3:
				System.out.println("Nhập tên loại tài liệu cần tìm");
				String findType = sc.next();
				Library library = LibraryService.findLibraryByType(librarieList, findType);
				System.out.println(library.toString());
				break;
			case 4:
				System.out.println("Nhập mã tài liệu cần xóa");
				String deleteType = sc.next();
				LibraryService.deleteLibrary(librarieList, deleteType);
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
