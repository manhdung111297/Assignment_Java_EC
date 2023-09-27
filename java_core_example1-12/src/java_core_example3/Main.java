package java_core_example3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 17 thg 9, 2023  23:13:12
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class Main {

	/**
	 * @param args
	 */
	private static Scanner sc = new Scanner(System.in);
	private static List<Student> studentsList = new ArrayList<>();
	private static List<String> examBlockList = new ArrayList<>();
	public static void main(String[] args) {
		examBlockList.add("A");
		examBlockList.add("B");
		examBlockList.add("C");
		while (true) {
			
			System.out.println("*****************************************");
			System.out.println("    Chương trình thí sinh dự thi    ");
			System.out.println("             Đại Học            ");
			System.out.println("*****************************************");
			System.out.println("Các chức năng của chương trình:");
			System.out.println("1. Thêm mới thí sinh");
			System.out.println("2. Hiện thị danh sách các thí sinh");
			System.out.println("3. Tìm kiếm theo số báo danh");
			System.out.println("4. Thoát chương trình");
			System.out.print("Vui lòng chọn chức năng: ");
			int num = Integer.parseInt(sc.nextLine());
			sc.nextLine();

			switch (num) {
			case 1:
				 System.out.print("Enter student ID: ");
                 String studentId = sc.nextLine();
                 System.out.print("Enter full name: ");
                 String fullName = sc.nextLine();
                 System.out.print("Enter address: ");
                 String address = sc.nextLine();
                 System.out.print("Enter priority level: ");
                 int priorityLevel = sc.nextInt();
                 sc.nextLine();

                 System.out.println("Choose exam block (A/B/C): ");
                 for (String block : examBlockList) {
                     System.out.println(block);
                 }

                 String selectedBlock = sc.nextLine();
                 Student student = new Student(studentId, fullName, address, priorityLevel);

                 if (selectedBlock.equals("A")) {
                     System.out.print("Enter Math score: ");
                     double mathScore = sc.nextDouble();
                     sc.nextLine();
                     System.out.print("Enter Physics score: ");
                     double physicsScore = sc.nextDouble();
                     sc.nextLine();
                     System.out.print("Enter Chemistry score: ");
                     double chemistryScore = sc.nextDouble();
                     sc.nextLine();

                     student.addExamBlock(new ExamBlock("Math", mathScore));
                     student.addExamBlock(new ExamBlock("Physics", physicsScore));
                     student.addExamBlock(new ExamBlock("Chemistry", chemistryScore));
                 } else if (selectedBlock.equals("B")) {
                     System.out.print("Enter Math score: ");
                     double mathScore = sc.nextDouble();
                     sc.nextLine();
                     System.out.print("Enter Chemistry score: ");
                     double chemistryScore = sc.nextDouble();
                     sc.nextLine();
                     System.out.print("Enter Biology score: ");
                     double biologyScore = sc.nextDouble();
                     sc.nextLine();

                     student.addExamBlock(new ExamBlock("Math", mathScore));
                     student.addExamBlock(new ExamBlock("Chemistry", chemistryScore));
                     student.addExamBlock(new ExamBlock("Biology", biologyScore));
                 } else if (selectedBlock.equals("C")) {
                     System.out.print("Enter Literature score: ");
                     double literatureScore = sc.nextDouble();
                     sc.nextLine();
                     System.out.print("Enter History score: ");
                     double historyScore = sc.nextDouble();
                     sc.nextLine();
                     System.out.print("Enter Geography score: ");
                     double geographyScore = sc.nextDouble();
                     sc.nextLine();

                     student.addExamBlock(new ExamBlock("Literature", literatureScore));
                     student.addExamBlock(new ExamBlock("History", historyScore));
                     student.addExamBlock(new ExamBlock("Geography", geographyScore));
                 }

                 studentsList.add(student);
                 break;
		
			case 2:
				studentsList.forEach(System.out::println);
				break;
			case 3:
				System.out.println("Nhập số báo danh");
				String findStudentID = sc.nextLine();
				Student st = studentsList.stream().filter(List -> List.getStudentId().equals(findStudentID)).findFirst().orElse(null);
				
				System.out.println("Hiện thi danh sách tìm kiếm");
				System.out.println(st.toString());
				
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
