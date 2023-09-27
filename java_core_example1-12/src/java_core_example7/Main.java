package java_core_example7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author        : DungLM6 
 * @from         : DN23_FR_JAVA_04
 * @Created_date: 14 thg 9, 2023  14:29:18 
 * @System_Name    :java_core 
 * @Version        : 1.0 
 * @Create_by    : LENOVO
 */
public class Main {

	/**
	 * @param args
	 */
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		SingletonPattern singletonPattern = SingletonPattern.getInstance();

	    while (true) {
	        System.out.println("*****************************************");
	        System.out.println("   Chương trình quản lý Tiền Lương   ");
	        System.out.println("       Cho Cán bộ Giáo Viên          ");
	        System.out.println("*****************************************");
	        System.out.println("Các chức năng của chương trình:");
	        System.out.println("1. Thêm thông tin cán bộ giáo viên");
	        System.out.println("2. Hiển thị thông tin giáo viên");
	        System.out.println("3. Xóa thông tin giáo viên");
	        System.out.println("4. Thoát chương trình");
	        System.out.print("Vui lòng chọn chức năng: ");

	        int num = Integer.parseInt(sc.nextLine());
	        switch (num) {
	            case 1:
	            	ManagerService.insertPerson(singletonPattern.teachersList, singletonPattern.studentsList);
	                break;
	            case 2:
	                // Sử dụng chức năng hiển thị thông tin giáo viên ở đây
	                ArrayList<TeacherStaff> teacherStaffs = ManagerService.getAllTeacherStaffs(singletonPattern.teachersList);
	                teacherStaffs.forEach(System.out::println);
	                break;
	            case 3:
	                System.out.print("Nhập mã giáo viên để xóa: ");
	                String teacherIdToDelete = sc.nextLine();
	                ManagerService.removeTeacherById(singletonPattern.teachersList, teacherIdToDelete);
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
