package java_core_example1;

import java.util.Scanner;


/**
 * The Class Employee.
 *
 * @author        : DungLM6 @from         : DN23_FR_JAVA_04
 * @Created_date: 17 thg 9, 2023  15:57:05 @System_Name    :
 *                java_core @Version        : 1.0 @Create_by    : LENOVO
 */
public class Employee extends Officer {
	
	/** The job. */
	private String job;

	/**
	 * Instantiates a new employee.
	 *
	 * @param fullName the full name
	 * @param age the age
	 * @param sexType the sex type
	 * @param address the address
	 * @param job the job
	 */
	public Employee(String fullName, int age, SexType sexType, String address, String job) {
		super(fullName, age, sexType, address);
		this.job = job;
	}

	/**
	 * Instantiates a new employee.
	 */
	public Employee() {
		super();
	}

	/**
	 * Gets the job.
	 *
	 * @return the job
	 */
	public String getJob() {
		return job;
	}

	/**
	 * Sets the job.
	 *
	 * @param job the job to set
	 */
	public void setJob(String job) {
		this.job = job;
	}

	/**
	 * Input employee.
	 *
	 * @param sc the sc
	 */
	public void inputEmployee(Scanner sc) {
		SexType sexType;
		System.out.println("Nhập thông tin các bộ Nhân viên");
		System.out.println("Nhập họ và tên: ");
		this.setFullName(sc.next());
		System.out.println("Nhập tuổi: ");
		this.setAge(sc.nextInt());
		System.out.println("Chọn giới tính (Nam/Nữ/Khác): ");
		String inputSexEn = sc.next();
		try {
			sexType = SexType.valueOf(inputSexEn.toUpperCase());
		} catch (Exception e) {
			sexType = SexType.KHÁC; // default
		}
		this.setSexType(sexType);

		System.out.println("Nhập địa chỉ: ");
		this.setAddress(sc.next());
		System.out.println("Nhập công việc: ");
		this.job = sc.next();
		System.err.println("Thêm cán bộ nhân viên thành công");

	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return super.toString() + ", " + "Employee [job=" + job + "]";
	}
	

}
