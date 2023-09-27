package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.AcademicResult;
import entities.Students;
import util.CheckValidate;
import util.InvalidDOBException;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 21 thg 9, 2023  22:05:06
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class StudentService {

	/**
	 * Insert student.
	 *
	 * @param sc the sc
	 * @return the int
	 */
	public static int insertStudent(Scanner sc) {
		Connection conn = ConnectDB.getConnection();
		PreparedStatement pstmt = null;
		int result = 0;
		System.out.println("Nhập thông tin sinh viên:");
		System.out.print("Student Id: ");
		String studentId = sc.nextLine();
		System.out.print("Full Name: ");
		String fullName = sc.nextLine();
		Date dateOfBirth = null;
		while (true) {
			System.out.print("Date of Birth (dd/MM/yyyy): ");
			String dobStr = sc.nextLine();
			try {
				dateOfBirth = CheckValidate.convertStringToDate(dobStr);
				if (dateOfBirth != null) {
					break; // Chỉ thoát khỏi vòng lặp nếu ngày sinh hợp lệ
				}
			} catch (InvalidDOBException e) {
				System.err.println(e.getMessage());
			}
		}

		System.out.print("Admission Year: ");
		int admissionYear = Integer.parseInt(sc.nextLine());

		System.out.print("Entrance Exam Score: ");
		double entranceScore = Double.parseDouble(sc.nextLine());

		try {
			if (entranceScore > 7.0) {
				pstmt = conn.prepareStatement(Constants.INSERT_STUDENTS);
				pstmt.setString(1, studentId);
				pstmt.setString(2, fullName);
				pstmt.setDate(3, new java.sql.Date(dateOfBirth.getTime()));
				pstmt.setInt(4, admissionYear);
				pstmt.setDouble(5, entranceScore);
				pstmt.setInt(6, 1);

			} else {
				pstmt = conn.prepareStatement(Constants.INSERT_STUDENTS_PARTTIME);
				System.out.print("Location (Đồng Nai, Cà Mau, Sài Gòn, Hà Nội...): ");
				String affiliatedLocation = sc.nextLine();
				pstmt.setString(1, studentId);
				pstmt.setString(2, fullName);
				pstmt.setDate(3, new java.sql.Date(dateOfBirth.getTime()));
				pstmt.setInt(4, admissionYear);
				pstmt.setDouble(5, entranceScore);
				pstmt.setInt(6, 2);
				pstmt.setString(7, affiliatedLocation);
			}

			result = pstmt.executeUpdate();
			// Sau khi thêm thông tin sinh viên, thêm thông tin kết quả học tập
			System.out.print("Enter the number of academic results to add: ");
			int numResults = Integer.parseInt(sc.nextLine());
			for (int i = 1; i <= numResults; i++) {
				System.out.println("Enter academic result " + i + ":");
				System.out.print("Semester Name: ");
				String semesterName = sc.nextLine();

				System.out.print("Average Score: ");
				double averageScore = Double.parseDouble(sc.nextLine());

				pstmt = conn.prepareStatement(Constants.INSERT_ACADEMIC_RESULT);
				pstmt.setString(1, studentId);
				pstmt.setString(2, semesterName);
				pstmt.setDouble(3, averageScore);
				result = pstmt.executeUpdate();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectDB.closeConnection(conn);
			ConnectDB.closeRsStm(pstmt);
		}
		return result;
	}
	
	public static void getAllStudent() {
		Connection conn = ConnectDB.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(Constants.SELECT_ALL);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				List<AcademicResult> academicResults = new ArrayList<>();
				String studentId = rs.getString("studentID");
				String fullName = rs.getString("fullName");
				Date dateOfBirth = rs.getDate("dateOfBirth");
				int admissionYear = rs.getInt("admissionYear");
				Double entranceScore = rs.getDouble("entranceScore");
				int studentType = rs.getInt("studentType");
				String semesterName = rs.getString("semesterName");
				Double averageScore = rs.getDouble("averageScore");
				AcademicResult academicResult = new AcademicResult(semesterName, averageScore);
				academicResults.add(academicResult);
				Students students = new Students(studentId, fullName, dateOfBirth, admissionYear, entranceScore,
						studentType, academicResults);
				
				System.out.println(students.toString());
				
			}
				} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectDB.closeConnection(conn);
			ConnectDB.closeRsStm(pstmt);
			ConnectDB.closeRs(rs);
		}

	}

	// Tổng sinh viên chính quy của khoa
	public static int countStudentsInFaculty(String facultyName) {
		Connection conn = ConnectDB.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int totalCount = 0;

		try {
			pstmt = conn.prepareStatement(Constants.SELECT_FACULTY_BYNAME);
			pstmt.setString(1, facultyName);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				int totalStudents = rs.getInt("totalStudents");
				System.out.println("Tổng số sinh viên trong khoa " + facultyName + ": " + totalStudents);
			} else {
				System.out.println("Không tìm thấy khoa có tên " + facultyName);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectDB.closeConnection(conn);
			ConnectDB.closeRsStm(pstmt);
			ConnectDB.closeRs(rs);
		}

		return totalCount;
	}

	// Sinh viên có điểm đầu vào cao nhất
	public static int findMaxScoreInFaculty() {
		Connection conn = ConnectDB.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int totalCount = 0;

		try {
			pstmt = conn.prepareStatement(Constants.SELECT_FACULTY_MAXSCORE);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String fullName = rs.getString("fullName");
				double maxEntryScore = rs.getDouble("maxEntryScore");
				System.out.println("fullName: " + fullName + ", maxEntryScore: " + maxEntryScore);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectDB.closeConnection(conn);
			ConnectDB.closeRsStm(pstmt);
			ConnectDB.closeRs(rs);
		}

		return totalCount;
	}

	// Sinh viên có AVG > 8.0
	public static int getStudentByAVG() {
		Connection conn = ConnectDB.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int totalCount = 0;

		try {
			pstmt = conn.prepareStatement(Constants.SELECT_ALL_AVG);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String studentId = rs.getString("studentID");
				String fullName = rs.getString("fullName");
				Date dateOfBirth = rs.getDate("dateOfBirth");
				int admissionYear = rs.getInt("admissionYear");
				Double entranceScore = rs.getDouble("entranceScore");
				int studentType = rs.getInt("studentType");
				String affiliatedLocation = rs.getString("affiliatedLocation");
				Double averageScore = rs.getDouble("averageScore");

				String output = String.format(
						"Student ID: %s, Full Name: %s, Date of Birth: %tD, Admission Year: %d, Entrance Score: %.2f, Student Type: %s, Affiliated Location: %s, Max Average Score: %.2f",
						studentId, fullName, dateOfBirth, admissionYear, entranceScore, studentType, affiliatedLocation,
						averageScore);

				System.out.println(output);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectDB.closeConnection(conn);
			ConnectDB.closeRsStm(pstmt);
			ConnectDB.closeRs(rs);
		}

		return totalCount;
	}

	// Sinh viên có AVG cao nhất
	public static int getStudentByMaxAVG() {
		Connection conn = ConnectDB.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int totalCount = 0;

		try {
			pstmt = conn.prepareStatement(Constants.SELECT_ALL_MAXAVG);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String studentId = rs.getString("studentID");
				String fullName = rs.getString("fullName");
				Date dateOfBirth = rs.getDate("dateOfBirth");
				int admissionYear = rs.getInt("admissionYear");
				Double entranceScore = rs.getDouble("entranceScore");
				String studentType = rs.getString("studentType");
				String affiliatedLocation = rs.getString("affiliatedLocation");
				Double averageScore = rs.getDouble("maxAVGScore");

				String output = String.format(
						"Student ID: %s, Full Name: %s, Date of Birth: %tD, Admission Year: %d, Entrance Score: %.2f, Student Type: %s, Affiliated Location: %s, Max Average Score: %.2f",
						studentId, fullName, dateOfBirth, admissionYear, entranceScore, studentType, affiliatedLocation,
						averageScore);

				System.out.println(output);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectDB.closeConnection(conn);
			ConnectDB.closeRsStm(pstmt);
			ConnectDB.closeRs(rs);
		}

		return totalCount;
	}

	// Hiện thị danh sách có tăng dần theo loại, giảm dần theo năm
	public static List<Students> getAllComparator() {
		List<Students> studentsList = new ArrayList<>();
		Connection conn = ConnectDB.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			pstmt = conn.prepareStatement(Constants.SELECT_ALL);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String studentId = rs.getString("studentID");
				String fullName = rs.getString("fullName");
				Date dateOfBirth = rs.getDate("dateOfBirth");
				int admissionYear = rs.getInt("admissionYear");
				Double entranceScore = rs.getDouble("entranceScore");
				int studentType = rs.getInt("studentType");
				Students students = new Students(studentId, fullName, dateOfBirth, admissionYear, entranceScore,
						studentType);
				studentsList.add(students);

			}
			Collections.sort(studentsList, new util.StudentComparator());
			studentsList.forEach(System.out::println);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectDB.closeConnection(conn);
			ConnectDB.closeRsStm(pstmt);
			ConnectDB.closeRs(rs);
		}

		return studentsList;
	}

	// Thống kê số lương sinh viên theo năm vào học
	public static void getAllCountYear() {
		Connection conn = ConnectDB.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			pstmt = conn.prepareStatement(Constants.SELECT_COUNT_YEAR);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String admissionYear = rs.getString("admissionYear");
				String countStudent = rs.getString("countStudents");
				System.out.println("AdmissionYear: " + admissionYear + ", CountStudent: " + countStudent);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectDB.closeConnection(conn);
			ConnectDB.closeRsStm(pstmt);
			ConnectDB.closeRs(rs);
		}

	}

}
