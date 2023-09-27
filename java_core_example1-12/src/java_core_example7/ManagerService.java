package java_core_example7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class ManagerService.
 *
 * @author        : DungLM6
 * @from         : DN23_FR_JAVA_04
 * @Created_date: 14 thg 9, 2023  14:52:30
 * @System_Name    :java_core
 * @Version        : 1.0
 * @Create_by    : LENOVO
 */
public class ManagerService {

	/**
	 * Insert person.
	 *
	 * @param teachersList the teachers list
	 * @param studentsList the students list
	 */
	public static void insertPerson(List<Teachers> teachersList, List<Students> studentsList) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("*****************************************");
	    System.out.println("Mời bạn nhập thông tin giáo viên:");
	    Teachers teacher = new Teachers();
	    System.out.println("Nhập mã giáo viên");
	    teacher.setTeacherId(sc.nextLine());
	    System.out.println("Nhập tên giáo viên");
	    teacher.setName(sc.nextLine());
	    System.out.println("Nhập tuổi");
	    teacher.setAge(sc.nextInt());
	    sc.nextLine(); 
	    System.out.println("Nhập địa chỉ");
	    teacher.setAddress(sc.nextLine());
	    System.out.println("Nhập số điện thoại");
	    teacher.setPhone(sc.nextLine());
	    System.out.println("Nhập lương cứng");
	    teacher.setSalary(sc.nextInt());
	    sc.nextLine(); 
	    System.out.println("Nhập lương thưởng");
	    teacher.setSalaryBonus(sc.nextInt());
	    sc.nextLine(); 
	    System.out.println("Nhập lương phạt");
	    teacher.setSalaryPenalty(sc.nextInt());
	    sc.nextLine(); 
	    System.out.println("Nhập số lượng sinh viên mà giáo viên quản lý:");
	    int numStudents = sc.nextInt();
	    sc.nextLine();
	    
	    ArrayList<Students> studentsManaged = new ArrayList<>();
	    for (int i = 0; i < numStudents; i++) {
	        Students student = new Students();
	        System.out.println("Nhập mã sinh viên");
	        student.setStudentId(sc.nextLine());
	        System.out.println("Nhập tên sinh viên");
	        student.setName(sc.nextLine());
	        System.out.println("Nhập tuổi");
	        student.setAge(sc.nextInt());
	        sc.nextLine();
	        System.out.println("Nhập địa chỉ");
	        student.setAddress(sc.nextLine());
	        System.out.println("Nhập số điện thoại");
	        student.setPhone(sc.nextLine());
	        studentsManaged.add(student);
	    }
	    teacher.setStudents(studentsManaged); 
	    teachersList.add(teacher);

	    System.err.println("Giáo viên đã được thêm thành công!");
	}
	

	/**
	 * Gets the all teacher staffs.
	 *
	 * @param teachersList the teachers list
	 * @return the all teacher staffs
	 */
	public static ArrayList<TeacherStaff> getAllTeacherStaffs(List<Teachers> teachersList) {
		ArrayList<TeacherStaff> staffsList = new ArrayList<>();
		for (Teachers teacher : teachersList) {
			TeacherStaff staff = new TeacherStaff();
			ArrayList<Teachers> teacherList = new ArrayList<>();
			teacherList.add(teacher);
			staff.setTeachers(teacherList);
			staff.getSalaryFinal();
			staffsList.add(staff);

		}
		return staffsList;
	}

	/**
	 * Removes the teacher by id.
	 *
	 * @param teachersList the teachers list
	 * @param teacherIdToDelete the teacher id to delete
	 * @return true, if successful
	 */
	public static boolean removeTeacherById(List<Teachers> teachersList, String teacherIdToDelete) {
	    Iterator<Teachers> iterator = teachersList.iterator();
	    boolean isDeleted = false;
	    
	    while (iterator.hasNext()) {
	        Teachers teacher = iterator.next();
	        if (teacher.getTeacherId().equals(teacherIdToDelete)) {
	            iterator.remove(); // Xóa giáo viên khỏi danh sách
	            isDeleted = true;
	            break;
	        }
	    }
	    
	    if (isDeleted) {
	        System.err.println("Xóa giáo viên thành công.");
	    } else {
	        System.err.println("Không tìm thấy giáo viên để xóa.");
	    }
	    
	    return isDeleted;
	}

}
