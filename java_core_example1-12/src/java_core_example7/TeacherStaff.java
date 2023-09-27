
package java_core_example7;

import java.util.ArrayList;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 14 thg 9, 2023  14:43:19
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class TeacherStaff {
	private ArrayList<Teachers> teachers;
	private int salaryFinal;

	/**
	 * @param students
	 * @param teachers
	 * @param salaryFinal
	 */
	   public TeacherStaff(ArrayList<Teachers> teachers) {
	        this.teachers = teachers;
	        this.salaryFinal = calculateTotalSalary();
	    }

	    // Tính tổng lương thực lĩnh của tất cả giáo viên trong danh sách
	    private int calculateTotalSalary() {
	        int totalSalary = 0;
	        for (Teachers teacher : teachers) {
	            totalSalary += teacher.getSalary() + teacher.getSalaryBonus() - teacher.getSalaryPenalty();
	        }
	        return totalSalary;
	    }
	/**
	 * 
	 */
	public TeacherStaff() {
		super();
	}

	/**
	 * @return the teachers
	 */
	public ArrayList<Teachers> getTeachers() {
		return teachers;
	}
	/**
	 * @param teachers the teachers to set
	 */
	public void setTeachers(ArrayList<Teachers> teachers) {
		this.teachers = teachers;
	}
	/**
	 * @return the salaryFinal
	 */
	public int getSalaryFinal() {
		return salaryFinal;
	}
	/**
	 * @param salaryFinal the salaryFinal to set
	 */
	public void setSalaryFinal(int salaryFinal) {
		this.salaryFinal = salaryFinal;
	}
	@Override
	public String toString() {
	    int totalSalary = calculateTotalSalary(); // Tính tổng lương thực lĩnh
	    return "TeacherStaff [teachers=" + teachers + ", salaryFinal=" + totalSalary + "]";
	}
	
	
	

}
