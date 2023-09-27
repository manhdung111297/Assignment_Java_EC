package java_core_example10;

import java.util.Scanner;

/**
 * @author        : DungLM6 @from         : DN23_FR_JAVA_04
 * 
 * @Created_date: 16 thg 9, 2023  20:47:24 @System_Name    :
 *                java_core @Version        : 1.0 @Create_by    : LENOVO
 */
public class Main {

	/**
	 * @param args
	 */
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Document document = new Document();

		while (true) {
			System.out.println("*****************************************");
			System.out.println("   Chương trình xử lý văn Bản   ");
			System.out.println("*****************************************");
			System.out.println("Các chức năng của chương trình:");
			System.out.println("1. Thêm đoạn văn bản");
			System.out.println("2. Đếm số từ của văn bản");
			System.out.println("3. Đếm số ký tự 'A'không phân biệt hoa thường");
			System.out.println("4. Chuẩn hóa văn bản");
			System.out.println("6. Thoát chương trình");
			System.out.print("Vui lòng chọn chức năng: ");

			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1:
				System.err.println("Bạn vui lòng nhập đoạn văn bản");
				String inputText = sc.nextLine();
				document.setText(inputText);
				break;
			case 2:
				int countText = document.countText();
				System.out.println("Số từ của văn bản: " + countText);
				break;
			case 3:
				int count = document.countTextOfA();
				System.err.println("Số ký tự A có trong văn bản: " + count);
				break;
			case 4:
				String text = document.replaceText();
				System.err.println("Chuẩn hóa lại đoạn văn bản: " + text);
				break;
			case 6:
				System.err.println("Thoát chương trình.");
				System.exit(0);
			default:
				System.err.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
			}
		}
	}

}
