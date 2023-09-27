package java_core_example8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 23 thg 9, 2023  17:44:55
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class Main {
	private static Scanner sc = new Scanner(System.in);
	private static List<BorrowCard > listBorrowCard = new ArrayList<>();

	public static void main(String[] args) {
		do {
			System.out.println("Chương trình quản lý Căn hộ chung cư");
			System.out.println("Các chức năng của chương trình");
			System.out.println("1. Thêm thông tin Sinh viên");
			System.out.println("1. Xóa theo id phiếu mượn");
			System.out.println("1. Hiện thị thông tin thẻ mượn");
			System.out.println("2. Thoát chương trình");
			System.out.println("-----------------------------------------");
			System.out.print("Vui lòng chọn chức năng: ");
			int num = Integer.parseInt(sc.nextLine());
			switch (num) {
			case 1:
				System.out.print("Nhập số sinh viên cần thêm: ");
				int n = sc.nextInt();
				
				 for (int i = 0; i < n; i++) {
			            System.out.println("Nhập thông tin sinh viên" + (i));
			            System.out.print("Nhập họ và tên: ");
			            String fullName = sc.nextLine();
			            System.out.print("Nhập tuổi: ");
			            int age = Integer.parseInt(sc.nextLine());
			            System.out.print("Nhập tên lớp: ");
			            String className = sc.nextLine();

			            Student student = new Student(fullName, age, className);

			            System.out.print("Nhập mã thẻ mượn sách: ");
			            int borrowCardId = Integer.parseInt(sc.nextLine());
			            System.out.print("Nhập ngày mượn: ");
			            int borrowDate = Integer.parseInt(sc.nextLine());
			            System.out.print("Nhập hạn trả: ");
			            int dueDate = Integer.parseInt(sc.nextLine());
			            System.out.print("Nhập số hiệu sách: ");
			            int bookSerialNumber = Integer.parseInt(sc.nextLine());

			            BorrowCard card = new BorrowCard(borrowCardId, borrowDate, dueDate, bookSerialNumber, student);

			            listBorrowCard.add(card);
			        }

				break;
				case 2:
				System.out.println("Nhập ID Thẻ Mượn Muốn Xóa");
				int cardId = Integer.parseInt(sc.nextLine());
				BorrowCard borrowCard = listBorrowCard.stream().filter(list -> list.getBorrowCardId() == cardId).findFirst().orElse(null);
				if(borrowCard != null) {
					listBorrowCard.remove(borrowCard);
					System.out.println("Xóa thành công với id " +  cardId);
				}else {
					System.out.println("Xóa không thành công với id " + cardId);
				}
				break;
				case 3:
					listBorrowCard.forEach(System.out::println);
				break;	
			default:
				System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
			}
		} while (true);
	}
}
