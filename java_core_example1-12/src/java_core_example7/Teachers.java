package java_core_example7;

import java.util.ArrayList;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 14 thg 9, 2023  14:39:17
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class Teachers extends Person {
	private String teacherId;
	private int salary;
	private int salaryBonus;
	private int salaryPenalty;
	private ArrayList<Students> students;

	/**
	 * @param name
	 * @param age
	 * @param phone
	 * @param address
	 * @param teacherId
	 * @param salary
	 * @param salaryBonus
	 * @param salaryPenalty
	 * @param students
	 */
	public Teachers(String name, int age, String phone, String address, String teacherId, int salary, int salaryBonus,
			int salaryPenalty, ArrayList<Students> students) {
		super(name, age, phone, address);
		this.teacherId = teacherId;
		this.salary = salary;
		this.salaryBonus = salaryBonus;
		this.salaryPenalty = salaryPenalty;
		this.students = students;
	}
	/**
	 * 
	 */
	public Teachers() {

	}
	/**
	 * @return the teacherId
	 */
	public String getTeacherId() {
		return teacherId;
	}
	/**
	 * @param teacherId the teacherId to set
	 */
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	/**
	 * @return the salaryBonus
	 */
	public int getSalaryBonus() {
		return salaryBonus;
	}
	/**
	 * @param salaryBonus the salaryBonus to set
	 */
	public void setSalaryBonus(int salaryBonus) {
		this.salaryBonus = salaryBonus;
	}
	/**
	 * @return the salaryPenalty
	 */
	public int getSalaryPenalty() {
		return salaryPenalty;
	}
	/**
	 * @param salaryPenalty the salaryPenalty to set
	 */
	public void setSalaryPenalty(int salaryPenalty) {
		this.salaryPenalty = salaryPenalty;
	}
	/**
	 * @return the students
	 */
	public ArrayList<Students> getStudents() {
		return students;
	}
	/**
	 * @param students the students to set
	 */
	public void setStudents(ArrayList<Students> students) {
		this.students = students;
	}
	public int getSalaryFinal() {
        return getSalary() + getSalaryBonus() - getSalaryPenalty();
    }
	@Override
	public String toString() {
	    return "Teachers{" +
	            "teacherId='" + teacherId + '\'' +
	            ", salary=" + salary +
	            ", salaryBonus=" + salaryBonus +
	            ", salaryPenalty=" + salaryPenalty +
	            ", students=" + students +
	            '}';
	}

	
	
	
	
}
