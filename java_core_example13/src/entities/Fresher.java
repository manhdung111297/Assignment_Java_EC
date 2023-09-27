package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class Fresher.
 */
public class Fresher extends Employee {
	
	/** The graduation date. */
	private Date graduation_date;
	
	/** The graduation rank. */
	private String graduation_rank;
	
	/** The education. */
	private String education;

	
	
	/**
	 * Instantiates a new fresher.
	 *
	 * @param employeeID the employee ID
	 * @param fullName the full name
	 * @param birthDay the birth day
	 * @param phone the phone
	 * @param email the email
	 * @param employee_type the employee type
	 * @param certificateList the certificate list
	 * @param graduation_date the graduation date
	 * @param graduation_rank the graduation rank
	 * @param education the education
	 */
	public Fresher(String employeeID, String fullName, Date birthDay, String phone, String email, int employee_type,
			List<Certificate> certificateList, Date graduation_date, String graduation_rank, String education) {
		super(employeeID, fullName, birthDay, phone, email, employee_type, certificateList);
		this.graduation_date = graduation_date;
		this.graduation_rank = graduation_rank;
		this.education = education;
	}

	/**
	 * Instantiates a new fresher.
	 */
	public Fresher() {
		super();
	}

	/**
	 * Gets the graduation date.
	 *
	 * @return the graduation_date
	 */
	public Date getGraduation_date() {
		return graduation_date;
	}

	/**
	 * Sets the graduation date.
	 *
	 * @param graduation_date the graduation_date to set
	 */
	public void setGraduation_date(Date graduation_date) {
		this.graduation_date = graduation_date;
	}

	/**
	 * Gets the graduation rank.
	 *
	 * @return the graduation_rank
	 */
	public String getGraduation_rank() {
		return graduation_rank;
	}

	/**
	 * Sets the graduation rank.
	 *
	 * @param graduation_rank the graduation_rank to set
	 */
	public void setGraduation_rank(String graduation_rank) {
		this.graduation_rank = graduation_rank;
	}

	/**
	 * Gets the education.
	 *
	 * @return the education
	 */
	public String getEducation() {
		return education;
	}

	/**
	 * Sets the education.
	 *
	 * @param education the education to set
	 */
	public void setEducation(String education) {
		this.education = education;
	}

	/**
	 * Show me.
	 *
	 * @return the string
	 */
	@Override
	public String showMe() {
	    return super.showInfo() + ", Education=" + getEducation() + ", Graduation_rank=" + getGraduation_rank() + ", Graduation_date=" + getGraduation_date();
	}

	
	/**
	 * Input fresher.
	 *
	 * @param sc the sc
	 * @param employees the employees
	 */
	public void inputFresher(Scanner sc, List<Employee> employees) {
		super.inputEmployee(sc, employees);
		while (true) {
			System.out.println("input Graduation_date");
			String fresher = sc.nextLine();
			SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
			formatDate.setLenient(false);
			Date date = new Date();
			try {
				date = formatDate.parse(fresher);
				this.graduation_date = date;
				break;
			} catch (ParseException e) {

				System.out.println("Ngày tốt nghiệp không đúng định dạng (yyyy-MM-dd). Vui lòng nhập lại!");
			}
		}

		System.out.println("select Graduation_rank ");
		System.out.println("1.giỏi");
		System.out.println("2.khá");
		System.out.println("3.Trung bình");
		int GraduationRank = Integer.parseInt(sc.nextLine());
		while (GraduationRank < 1 && GraduationRank > 3) {
			System.out.println("please re_enter agian!");
			GraduationRank = sc.nextInt();
		}

		System.out.println("input Education! ");
		this.education = sc.nextLine();

	}

}
