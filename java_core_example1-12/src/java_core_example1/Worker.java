package java_core_example1;

import java.util.Scanner;

/**
 * The Class Worker.
 *
 * @author        : DungLM6 @from         : DN23_FR_JAVA_04
 * @Created_date: 17 thg 9, 2023  15:51:39 @System_Name    :
 *                java_core @Version        : 1.0 @Create_by    : LENOVO
 */
public class Worker extends Officer {
	
	/** The rank. */
	private int rank;

	/**
	 * Instantiates a new worker.
	 *
	 * @param fullName the full name
	 * @param age the age
	 * @param sexType the sex type
	 * @param address the address
	 * @param rank the rank
	 */
	public Worker(String fullName, int age, SexType sexType, String address, int rank) {
		super(fullName, age, sexType, address);
		this.rank = rank;
	}

	/**
	 * Instantiates a new worker.
	 */
	public Worker() {
		super();

	}

	/**
	 * Gets the rank.
	 *
	 * @return the rank
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * Sets the rank.
	 *
	 * @param rank the rank to set
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return super.toString() + ", " + "Worker [rank=" + rank + "]";
	}
	
	/**
	 * Input worker.
	 *
	 * @param sc the sc
	 */
	public void inputWorker(Scanner sc) {
		SexType sexType;
		System.out.println("Nhập thông tin các bộ Công nhân");
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
		System.out.println("Nhập Bậc(1-10): ");
		this.setRank(sc.nextInt());
		System.err.println("Thêm cán bộ kỹ sư thành công");

	}

}
