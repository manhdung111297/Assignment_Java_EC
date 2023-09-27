package java_core_example1;

import java.util.Scanner;

/**
 * The Class Engineer.
 *
 * @author        : DungLM6
 * @from         : DN23_FR_JAVA_04
 * @Created_date: 17 thg 9, 2023  15:55:02
 * @System_Name    : java_core
 * @Version        : 1.0
 * @Create_by    : LENOVO
 */
public class Engineer extends Officer {
	
	/** The training. */
	private String training;

	/**
	 * Instantiates a new engineer.
	 *
	 * @param fullName the full name
	 * @param age the age
	 * @param sexType the sex type
	 * @param address the address
	 * @param training the training
	 */
	public Engineer(String fullName, int age, SexType sexType, String address, String training) {
		super(fullName, age, sexType, address);
		this.training = training;
	}
	

	/**
	 * Instantiates a new engineer.
	 */
	public Engineer() {
		super();
	}


	/**
	 * Gets the training.
	 *
	 * @return the training
	 */
	public String getTraining() {
		return training;
	}

	/**
	 * Sets the training.
	 *
	 * @param training the training to set
	 */
	public void setTraining(String training) {
		this.training = training;
	}
	
	/**
	 * Input engineer.
	 *
	 * @param sc the sc
	 */
	public void inputEngineer(Scanner sc) {
		SexType sexType;
		System.out.println("Nhập thông tin các bộ Kỹ sư");
		System.out.println("Nhập họ và tên: ");
		this.setFullName(sc.next());
		System.out.println("Nhập tuổi: ");
		this.setAge(sc.nextInt());
		System.out.println("Chọn giới tính (Nam/Nữ/Khác): ");
		String inputSex = sc.next();
        try {
            sexType = SexType.valueOf(inputSex.toUpperCase());
        } catch (Exception e) {
            sexType = SexType.KHÁC; // default
        }
        this.setSexType(sexType);

		System.out.println("Nhập địa chỉ: ");
		this.setAddress(sc.next());
		System.out.println("Nhập ngành đạo tạo: ");
		this.setTraining(sc.next());
		System.err.println("Thêm cán bộ kỹ sư thành công");
	
	}


	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return super.toString() + ", " + "Engineer [training=" + training + "]";
	}
	
	

}
