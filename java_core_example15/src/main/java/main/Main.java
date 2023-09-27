package main;

import java.util.Scanner;

import dao.StudentService;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 21 thg 9, 2023  21:50:27
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class Main {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

    
		while (true) { 
			System.out.println("*****************************************");
			System.out.println("    Chương trình quản lý kết quả học tập    ");
			System.out.println("*****************************************");
			System.out.println("Các chức năng của chương trình:");
			System.out.println("1. Thêm mới sinh viên");
			System.out.println("2. Hiện thị danh sách các sinh viên");
			System.out.println("3. Tìm khoa có sinh viên chính quy của khoa");
			System.out.println("4. Hiện thị danh sách sinh viên có đầu vào cao nhất");
			System.out.println("5. Hiện thị danh sách sinh viên có AVG > 8");
			System.out.println("6. Hiện thị danh sách sinh viên có AVG cao nhất ");
			System.out.println("7. Hiện thị danh sách sinh viên tăng dần theo loại, giảm dần theo năm học");
			System.out.println("7. Thống kê sinh viên tăng dần theo năm học");
			System.out.println("6. Thoát chương trình");
			System.out.print("Vui lòng chọn chức năng: ");

			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1:
				StudentService.insertStudent(sc);
				break;
			case 2:
				StudentService.getAllStudent();
				break;
			case 3:
				 // Hiển thị tổng số sinh viên chính quy của khoa
                System.out.print("Nhập tên khoa: ");
                String facultyName = sc.nextLine();
                StudentService.countStudentsInFaculty(facultyName);
                break;
			case 4: 
				StudentService.findMaxScoreInFaculty();
				break;
				
			case 5: 
				StudentService.getStudentByAVG();
				break;
			case 6: 
				StudentService.getStudentByMaxAVG();
				break;
			case 7: 
				StudentService.getAllComparator();
				break;
			case 8: 
				StudentService.getAllCountYear();
				break;
			case 9:
				System.out.println("Thoát chương trình.");
				System.exit(0);
			default:
				System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
			}
		}
}
}
