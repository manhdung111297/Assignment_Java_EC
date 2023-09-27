package entities;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Experience extends Employee {
	private String expInYear;
	private String proSkill;
	

	/**
	 * @param employeeID
	 * @param fullName
	 * @param birthDay
	 * @param phone
	 * @param email
	 * @param employee_type
	 * @param certificateList
	 * @param expInYear
	 * @param proSkill
	 */
	public Experience(String employeeID, String fullName, Date birthDay, String phone, String email, int employee_type,
			List<Certificate> certificateList, String expInYear, String proSkill) {
		super(employeeID, fullName, birthDay, phone, email, employee_type, certificateList);
		this.expInYear = expInYear;
		this.proSkill = proSkill;
	}


	public Experience() {
		
	}


	/**
	 * @return the expInYear
	 */
	public String getExpInYear() {
		return expInYear;
	}
	/**
	 * @param expInYear the expInYear to set
	 */
	public void setExpInYear(String expInYear) {
		this.expInYear = expInYear;
	}
	/**
	 * @return the proSkill
	 */
	public String getProSkill() {
		return proSkill;
	}
	/**
	 * @param proSkill the proSkill to set
	 */
	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}
	@Override
	public String showMe() {
	    return super.showInfo() + ", ExpInYear=" + getExpInYear() + ", FullName=" + getFullName();
	}
	
	/**
	 * Input experience.
	 *
	 * @param sc the sc
	 * @param employees the employees
	 */
	public void inputExperience(Scanner sc, List<Employee> employees) {
		super.inputEmployee(sc, employees);
		System.out.println("input ExpInYear");
		this.expInYear = sc.nextLine();
		
		System.out.println("input ProSkill");
		this.proSkill = sc.nextLine();
	}

}
