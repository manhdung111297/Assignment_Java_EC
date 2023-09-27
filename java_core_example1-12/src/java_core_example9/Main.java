package java_core_example9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author        : DungLM6 
 * @from         : DN23_FR_JAVA_04
 * @Created_date: 15 thg 9, 2023  15:03:55 
 * @System_Name    :java_core 
 * @Version        : 1.0 
 * @Create_by    : LENOVO
 */
public class Main {

	/**
	 * @param args
	 */
	private static Scanner sc = new Scanner(System.in);
	private static List<Customer> customers = new ArrayList<>();
	private static List<Receipt> receipts = new ArrayList<>();
	
	public static void main(String[] args) {

		while (true) {
			System.out.println("*****************************************");
			System.out.println("   Chương trình quản lý Biên Lai   ");
			System.out.println("       Thu Tiền Điện          ");
			System.out.println("*****************************************");
			System.out.println("Các chức năng của chương trình:");
			System.out.println("1. Thêm Khách Hàng");
			System.out.println("2. Tính tiền điện khách hàng");
			System.out.println("3. Hiện thị toàn bộ Biên Lai");
			System.out.println("4. Sửa lại biên lai khách hàng");
			System.out.println("5. Xóa biên lai khách hàng");
			System.out.println("6. Thoát chương trình");
			System.out.print("Vui lòng chọn chức năng: ");

			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1:
				ManagerReceiptService.insertCustomer(customers);
				break;
			case 2:
				List<Receipt> localReceipts = ManagerReceiptService.getCaculator(customers);
				receipts.addAll(localReceipts);
				localReceipts.forEach(System.out::println);
				break;
			case 3:
				System.out.println("Danh sách biên lai: ");
				receipts.forEach(System.out::println);
				break;
			case 4:
				System.out.println("Nhập mã biên lai cần để sửa: ");
				String receiptIdEdit = sc.nextLine();
				System.out.println("Nhập chỉ số điện cũ của hộ gia đình mới:");
				int newElectricNumberOld = sc.nextInt();
				ManagerReceiptService.editReceiptById(receiptIdEdit, receipts, newElectricNumberOld);
				receipts.forEach(System.out::println);
				break;
			case 5:
				System.out.print("Nhập mã biên lai để xóa: ");
				String receiptIdDelete = sc.nextLine();
				ManagerReceiptService.deleteReceipById(receiptIdDelete, receipts);
				break;
			case 6:
				System.out.println("Thoát chương trình.");
				System.exit(0);
			default:
				System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
			}
		}

	}

}
