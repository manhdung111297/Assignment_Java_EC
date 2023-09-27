package service;

import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.Experience;
import entities.Fresher;
import entities.Intern;

/**
 * The Class EmployeeService.
 */
public class EmployeeService {
	
	private static Scanner sc = new Scanner(System.in);
	
	/**
	 * Insert employee.
	 *
	 * @param sc the sc
	 * @param employees the employees
	 */
	public static void insertEmployee(Scanner sc, List<Employee> employees) {
		
		while (true) {
			System.out.println("Bạn có muốn nhập thông tin ứng viên không");
			System.out.println("1. Yes");
			System.out.println("2. No");
			int num = Integer.parseInt(sc.nextLine());
			if (num == 2) {
				break;
			}
			try {
				System.out.println("Chọn loại ứng viên cần nhập");
				System.out.println("0: Experience");
				System.out.println("1: Fresher");
				System.out.println("2: Intern");
				int candidateType = Integer.parseInt(sc.nextLine());
				
				switch (candidateType) {
				case 0:
					Experience experience = new Experience();
					experience.inputExperience(sc, employees);
					experience.setEmployee_type(candidateType);
					employees.add(experience);
					System.err.println("Thêm Experience thành công");
					break;
				case 1:
					Fresher fresher = new Fresher();
					fresher.inputFresher(sc, employees);
					fresher.setEmployee_type(candidateType);
					employees.add(fresher);
					System.err.println("Thêm Fresher thành công");
					break;
				case 2:
					Intern intern = new Intern();
					intern.inputInter(sc, employees);
					intern.setEmployee_type(candidateType);
					employees.add(intern);
					System.err.println("Thêm Intern thành công");
					break;
				default:
					break;
				}
			} catch (Exception e) {
				  System.err.println("Thêm nhân viên không thành công");
			}

		}
	}
		
		/**
		 * Show employee.
		 *
		 * @param employeeList the employee list
		 */
		public static void showEmployee(List<Employee> employeeList) {
			for (Employee employee : employeeList) {
				if (employee instanceof Experience) {
					Experience exp = (Experience) employee;
					System.out.println(exp.showMe());
				} else if (employee instanceof Fresher) {
					Fresher fresher = (Fresher) employee;
					System.out.println(fresher.showMe());
				} else if (employee instanceof Intern) {
					Intern intern = (Intern) employee;
					System.out.println(intern.showMe());
				}

			}

		}
		
		/**
		 * Delete employee by id.
		 *
		 * @param employees the employees
		 * @param employeeID the employee ID
		 * @return true, if successful
		 */
		//Delete Employee
		public static boolean deleteEmployeeById(List<Employee> employees, String employeeID) {
		Employee employee = employees.stream().filter(list -> list.getEmployeeID().equals(employeeID)).findFirst().orElse(null);
		if(employee != null) {
			employees.remove(employee);
			System.err.println("Bạn đã xóa thành công với id " + employeeID);
			return true;
		}else {
			System.err.println("Xóa không thành công với id " + employeeID);
			return false;
		}
		}
		
		/**
		 * Edits the employee by id.
		 *
		 * @param employeeID the employee ID
		 * @param employees the employees
		 * @param fullName the full name
		 * @return true, if successful
		 */
		//Edit Receipt by ID
		public static boolean editEmployeeById(String employeeID, List<Employee> employees, String fullName) {
			Employee employee = employees.stream().filter(list -> list.getEmployeeID().equals(employeeID))
					.findFirst().orElse(null);

			if (employee != null) {
				employee.setFullName(fullName);
				System.out.println("Chỉnh sửa thành công với ID " + employeeID);
				return true;
			} else {
				System.out.println("Không tìm thấy nhân viên với ID " + employeeID);
				return false;
			}
		}
		
		/**
		 * Find employee by type.
		 *
		 * @param employees the employees
		 */
		public static void findEmployeeByType(List<Employee> employees) {
			while (true) {
				try {
					System.out.println("Lựa chọn nhân viên cần hiện thị");
					System.out.println("1: Experience");
					System.out.println("2: Fresher");
					System.out.println("3: Intern");
					System.out.println("4: Quay lại menu");
					int employeeType = Integer.parseInt(sc.nextLine());	
					if (employeeType == 4) {
		                break; 
		            }
					Employee employee = employees.stream().filter(list -> list.getEmployee_type()== employeeType)
							.findAny().orElse(null);
					 if (employee != null) {
		                    System.out.println(employee.showInfo());
		                } else {
		                    System.err.println("Không có danh sách dữ liệu phù hợp.");
		                }
							
				} catch (Exception e) {
					System.err.println("Lựa chọn không hợp lệ.");
				}
				
			}
			
		}


	}


