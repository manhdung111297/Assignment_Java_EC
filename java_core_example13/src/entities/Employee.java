package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import util.BirthDayException;
import util.EmailException;
import util.PhoneException;
import util.Validator;



// TODO: Auto-generated Javadoc
/**
 * The Class Candidate.
 */
public abstract class Employee {
	
	/** The employee ID. */
	protected String employeeID;
	
	/** The full name. */
	protected String fullName;
	
	/** The birth day. */
	protected Date birthDay;
	
	/** The phone. */
	protected String phone;
	
	/** The email. */
	protected String email;
	
	/** The employee type. */
	protected int employee_type;
	
	/** The employee count. */
	public static int employee_count;
	
	/** The certificate list. */
	protected List<Certificate> certificateList;

	/**
	 * Instantiates a new employee.
	 *
	 * @param employeeID the employee ID
	 * @param fullName the full name
	 * @param birthDay the birth day
	 * @param phone the phone
	 * @param email the email
	 * @param employee_type the employee type
	 * @param certificateList the certificate list
	 */
	public Employee(String employeeID, String fullName, Date birthDay, String phone, String email, int employee_type,
			List<Certificate> certificateList) {
		super();
		this.employeeID = employeeID;
		this.fullName = fullName;
		this.birthDay = birthDay;
		this.phone = phone;
		this.email = email;
		this.employee_type = employee_type;
		this.certificateList = certificateList;
	}

	/**
	 * Instantiates a new employee.
	 */
	public Employee() {
		super();
	}




	/**
	 * Gets the employee ID.
	 *
	 * @return the employeeID
	 */
	public String getEmployeeID() {
		return employeeID;
	}

	/**
	 * Sets the employee ID.
	 *
	 * @param employeeID the employeeID to set
	 */
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	/**
	 * Gets the full name.
	 *
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * Sets the full name.
	 *
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * Gets the birth day.
	 *
	 * @return the birthDay
	 */
	public Date getBirthDay() {
		return birthDay;
	}

	/**
	 * Sets the birth day.
	 *
	 * @param birthDay the birthDay to set
	 */
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	/**
	 * Gets the phone.
	 *
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * Sets the phone.
	 *
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the employee type.
	 *
	 * @return the employee_type
	 */
	public int getEmployee_type() {
		return employee_type;
	}

	/**
	 * Sets the employee type.
	 *
	 * @param employee_type the employee_type to set
	 */
	public void setEmployee_type(int employee_type) {
		this.employee_type = employee_type;
	}

	/**
	 * Gets the employee count.
	 *
	 * @return the employee_count
	 */
	public static int getEmployee_count() {
		return employee_count;
	}

	/**
	 * Sets the employee count.
	 *
	 * @param employee_count the employee_count to set
	 */
	public static void setEmployee_count(int employee_count) {
		Employee.employee_count = employee_count;
	}

	/**
	 * Gets the certificate list.
	 *
	 * @return the certificateList
	 */
	public List<Certificate> getCertificateList() {
		return certificateList;
	}

	/**
	 * Sets the certificate list.
	 *
	 * @param certificateList the certificateList to set
	 */
	public void setCertificateList(List<Certificate> certificateList) {
		this.certificateList = certificateList;
	}

	/**
	 * Show in for.
	 *
	 * @return the string
	 */
	public String showInfo() {
//		 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		    String formattedDate = dateFormat.format(birthDay);
	    return "Employee{" +
	            "employeeID='" + employeeID + '\'' +
	            ", fullName='" + fullName + '\'' +
	            ", birthDay='" + birthDay + '\'' +
	            ", phone='" + phone + '\'' +
	            ", email='" + email + '\'' +
	            ", employee_type='" + employee_type + '\'' +
	            ", certificateList=" + certificateList +
	            '}';
	}

	

	/**
	 * Show me.
	 *
	 * @return the string
	 */
	public abstract String showMe();

	

	
	/**
	 * Input employee.
	 *
	 * @param sc the sc
	 * @param employees the employees
	 */
	public void inputEmployee(Scanner sc, List<Employee> employees) {
		System.out.println("input employeeID ");
		while (true) {
			String employeeID = sc.nextLine();
			if (!Validator.isIdExists(employeeID, employees)) {
				this.employeeID = employeeID;
				break;
			} else {
				System.out.println("ID " + employeeID + "đã tồn tại trong danh sách. Vui lòng nhập lại!");
			}
		}
		System.out.println("input FullName ");
		this.fullName = sc.nextLine();
		// Day9: Birthday Exceotion
		System.out.println("input BirthDay ");
		while (true) {
			String birthday = sc.nextLine();
			try {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				sdf.setLenient(false);
				Date date = sdf.parse(birthday);
				this.birthDay = date;
				break;
			} catch (ParseException e) {
				// Nếu ParseException xảy ra là hiểu chuyển đổi từ String thành Date, bạn có thể
				// bắn BirthDayException
				try {
					throw new BirthDayException("Ngày sinh không đúng định dạng (yyyy-MM-dd). Vui lòng nhập lại!");
				} catch (BirthDayException ex) {
					System.err.println(ex.getMessage());
				}
			}
		}
		System.out.println("input Phone ");
		while (true) {
			String phone = sc.nextLine();
			if (Validator.isValidPhone(phone)) {
				this.phone = phone;
				break;
			} else {
				try {
					throw new PhoneException("Số điện thoại không hợp lệ. Vui lòng nhập lại!");
				} catch (PhoneException e) {
					System.err.println(e.getMessage());
				}

			}
		}
		// Day 9: EmailException // Sửa lại throw thì vid catch ra luôn dự thừa
		System.out.println("input Email ");
		while (true) {
			String email = sc.nextLine();
			if (Validator.isValidEmail(email)) {
				this.email = email;
				break;
			} else {
				try {
					throw new EmailException("Email không đúng định dạng(abc12@fpt.com). Vui lòng nhập lại!");
				} catch (EmailException e) {
					System.err.println(e.getMessage());
				}

			}
		}
		System.out.println("input NumberOfCertificates");
		int n = Integer.parseInt(sc.nextLine());
		certificateList = new ArrayList<Certificate>();
		for (int i = 0; i < n; i++) {
			Certificate certificate = new Certificate();
			certificate.inputCertificate(sc);
			certificate.setCandidateID(this.employeeID);
			certificateList.add(certificate);
		}

	}
}
