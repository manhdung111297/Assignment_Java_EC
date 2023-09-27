package java_core_example3;

import java.util.List;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 17 thg 9, 2023  23:09:49
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class Admissions {
	 private List<Student> listStudents;

	/**
	 * @param listStudents
	 */
	public Admissions(List<Student> listStudents) {
		super();
		this.listStudents = listStudents;
	}

	/**
	 * @return the listStudents
	 */
	public List<Student> getListStudents() {
		return listStudents;
	}

	/**
	 * @param listStudents the listStudents to set
	 */
	public void setListStudents(List<Student> listStudents) {
		this.listStudents = listStudents;
	}
	

	/**
	 * Adds the student.
	 *
	 * @param student the student
	 */
	public void addStudent(Student student) {
		listStudents.add(student);
    }
	

	
	 
	 
}
