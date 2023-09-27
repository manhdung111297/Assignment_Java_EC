package java_core_example1;

import java.util.List;
import java.util.Scanner;

/**
 * The Class OfficerService.
 *
 * @author        : DungLM6 
 * @from         : DN23_FR_JAVA_04
 * @Created_date: 17 thg 9, 2023  16:01:53 
 * @System_Name    :java_core 
 * @Version        : 1.0 
 * @Create_by    : LENOVO
 */
public class OfficerService {

	
	/** The sc. */
	private static Scanner sc = new Scanner(System.in);
	
	/**
	 * Insert officer.
	 *
	 * @param officers the officers
	 */
	// Insert Officer
	public static void insertOfficer(List<Officer> officers) {
		boolean isClose = false;
		while (!isClose) {
			System.out.println("Chọn loại cán bộ cần nhập");
			System.out.println("1: Công nhân");
			System.out.println("2: Kỹ sư");
			System.out.println("3: Nhân viên");
			System.out.println("4: Quay lại menu");
			int num = sc.nextInt();
			try {
				switch (num) {
				case 1:
					Worker worker = new Worker();
					worker.inputWorker(sc);
					officers.add(worker);
					break;
				case 2:
					Engineer engineer = new Engineer();
					engineer.inputEngineer(sc);
					officers.add(engineer);
					break;
				case 3:
					Employee employee = new Employee();
					employee.inputEmployee(sc);
					officers.add(employee);
					break;
				case 4:
					isClose = true;
					break;
				default:
					break;
				}
			} catch (Exception e) {
				System.out.println("The system has encountered an unexpected problem, sincerely sorry !!!");
			}

		}
	}
	
	/**
	 * Find officer by name.
	 *
	 * @param officers the officers
	 * @param fullName the full name
	 * @return the officer
	 */
	//Find Officer by FullName
	public static Officer findOfficerByName(List<Officer> officers, String fullName) {
		return officers.stream().filter(officerList -> officerList.getFullName().equals(fullName))
				.findFirst().orElse(null);
		
	}

}
