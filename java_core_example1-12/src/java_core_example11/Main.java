package java_core_example11;

import java.util.Scanner;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 16 thg 9, 2023  21:27:54
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class Main {

	/**
	 * @param args
	 */
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ComplexNumber complexNumber = new ComplexNumber();
		while (true) {
			System.out.println("*****************************************");
			System.out.println("   Chương trình xử lý văn Bản   ");
			System.out.println("*****************************************");
			System.out.println("Các chức năng của chương trình:");
			System.out.println("1. Nhập một số phức");
			System.out.println("2. Hiện thị số phức");
			System.out.println("3. Cộng 2 số phức");
			System.out.println("4. Nhân 2 số phức");
			System.out.println("6. Thoát chương trình");
			System.out.print("Vui lòng chọn chức năng: ");

			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1:
				System.err.println("Bạn vui lòng nhập một số phức");
				Double inputText = sc.nextDouble();
				complexNumber.setNumber(inputText);
				break;
			case 2:
				Double getNumber = complexNumber.getNumber();
				System.out.println("Hiển thị số phức: " + getNumber);
				break;
			case 3:
				System.out.println("Nhập số phức a: ");
				Double inputA = sc.nextDouble();
				System.out.println("Nhập số phức b: ");
				Double inputB = sc.nextDouble();
				Double sumNumber = complexNumber.sumNumber(inputA, inputB);
				System.err.println("Tổng của 2 số phức: " + sumNumber);
				break;
			case 4:
				System.out.println("Nhập số phức a: ");
				Double inputA1 = sc.nextDouble();
				System.out.println("Nhập số phức b: ");
				Double inputB1 = sc.nextDouble();
				Double multipNumber = complexNumber.multipNumber(inputA1, inputB1);
				System.err.println("Tích của 2 số phức: " + multipNumber);
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
