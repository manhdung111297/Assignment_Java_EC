package dao;

// TODO: Auto-generated Javadoc
/**
 * The Class Constants.
 */
public class Constants {
	
	/** The Constant INSERT_STUDENTS. */
	// Insert DB
	public static final String INSERT_STUDENTS = "INSERT INTO Students (studentId, fullName, dateOfBirth, admissionYear, entranceScore, studentType) "
			+ "VALUES (?,?,?,?,?,?)";
	
	/** The Constant INSERT_STUDENTS_PARTTIME. */
	public static final String INSERT_STUDENTS_PARTTIME = "INSERT INTO Students (studentId, fullName, dateOfBirth, admissionYear, entranceScore, studentType, affiliatedLocation) "
			+ "VALUES (?,?,?,?,?,?,?)";
	
	/** The Constant INSERT_ACADEMIC_RESULT. */
	public static final String INSERT_ACADEMIC_RESULT = "INSERT INTO AcademicResult (studentId, semesterName, averageScore) VALUES (?, ?, ?)";

	/** The Constant SELECT_ALL. */
	// Select DB
	public static final String SELECT_ALL = "SELECT st.studentId, fullName, dateOfBirth, admissionYear, entranceScore, "
			+ "studentType, affiliatedLocation, resultId, semesterName, averageScore "
			+ "FROM Students st JOIN AcademicResult ar ON st.studentId = ar.studentId";
	
	/** The Constant SELECT_FACULTY_BYNAME. */
	public static final String SELECT_FACULTY_BYNAME = "SELECT COUNT(st.studentId) AS totalStudents "
			+ "FROM Faculty f " + "LEFT JOIN Students st ON f.studentId = st.studentId "
			+ "WHERE studentType = 'SV Chính Quy' AND  f.facultyName = ? ";
	
	/** The Constant SELECT_FACULTY_MAXSCORE. */
	public static final String SELECT_FACULTY_MAXSCORE = "SELECT MAX(st.entranceScore) AS maxEntryScore, st.fullName  FROM Faculty f "
			+ "LEFT JOIN Students st ON f.studentId = st.studentId WHERE studentType = 1 " + "GROUP BY st.fullName ";
	
	/** The Constant SELECT_ALL_AVG. */
	public static final String SELECT_ALL_AVG = "SELECT  st.*, averageScore   FROM AcademicResult ar  JOIN Students st ON ar.studentId = st.studentId "
			+ "WHERE ar.averageScore >= 8.0 AND ar.semesterName = N'Học kỳ 1'";

	/** The Constant SELECT_ALL_MAXAVG. */
	public static final String SELECT_ALL_MAXAVG = "SELECT TOP 1 st.*, MAX(ar.averageScore) AS maxAVGScore "
			+ "FROM AcademicResult ar " + "JOIN Students st ON ar.studentId = st.studentId "
			+ "GROUP BY st.fullName, st.studentId, st.admissionYear, st.dateOfBirth, st.entranceScore, st.affiliatedLocation, st.studentType "
			+ "Order By maxAVGScore DESC ";

	/** The Constant SELECT_COUNT_YEAR. */
	public static final String SELECT_COUNT_YEAR = "SELECT admissionYear, COUNT(admissionYear) AS countStudents FROM Students GROUP BY admissionYear";

}
