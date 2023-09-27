package entities;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class Intern.
 */
public class Intern extends Employee {
	
	/** The majors. */
	private String majors;
	
	/** The university name. */
	private String universityName;
	
	/** The semester. */
	private String semester;

	
	/**
	 * Instantiates a new intern.
	 *
	 * @param employeeID the employee ID
	 * @param fullName the full name
	 * @param birthDay the birth day
	 * @param phone the phone
	 * @param email the email
	 * @param employee_type the employee type
	 * @param certificateList the certificate list
	 * @param majors the majors
	 * @param universityName the university name
	 * @param semester the semester
	 */
	public Intern(String employeeID, String fullName, Date birthDay, String phone, String email, int employee_type,
			List<Certificate> certificateList, String majors, String universityName, String semester) {
		super(employeeID, fullName, birthDay, phone, email, employee_type, certificateList);
		this.majors = majors;
		this.universityName = universityName;
		this.semester = semester;
	}


	/**
	 * Instantiates a new intern.
	 */
	public Intern() {
		super();
	}
	

	/**
	 * Gets the majors.
	 *
	 * @return the majors
	 */
	public String getMajors() {
		return majors;
	}


	/**
	 * Sets the majors.
	 *
	 * @param majors the majors to set
	 */
	public void setMajors(String majors) {
		this.majors = majors;
	}


	/**
	 * Gets the university name.
	 *
	 * @return the universityName
	 */
	public String getUniversityName() {
		return universityName;
	}


	/**
	 * Sets the university name.
	 *
	 * @param universityName the universityName to set
	 */
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}


	/**
	 * Gets the semester.
	 *
	 * @return the semester
	 */
	public String getSemester() {
		return semester;
	}


	/**
	 * Sets the semester.
	 *
	 * @param semester the semester to set
	 */
	public void setSemester(String semester) {
		this.semester = semester;
	}


	/**
	 * Show me.
	 *
	 * @return the string
	 */
	@Override
	public String showMe() {
	    return super.showInfo() + ", Majors=" + getMajors() + ", Semester=" + getSemester() + ", universityName=" + getUniversityName();
	}


	/**
	 * Input inter.
	 *
	 * @param sc the sc
	 * @param employees the employees
	 */
	public void inputInter(Scanner sc, List<Employee> employees) {
		super.inputEmployee(sc, employees);
		System.out.println("input majors! ");
		this.majors = sc.nextLine();
		
		System.out.println("input universityName! ");
		this.universityName = sc.nextLine();
		
		System.out.println("input semester! ");
		this.semester = sc.nextLine();
		
	}

}
