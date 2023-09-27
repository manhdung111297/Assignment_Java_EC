package util;

import java.util.Comparator;

import entities.Students;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 21 thg 9, 2023  11:14:46
* @System_Name    : example14
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class StudentComparator implements Comparator<Students> {

	@Override
	 public int compare(Students s1, Students s2) {
        if (s1.getStudentType() != s2.getStudentType()) {
            return Integer.compare(s2.getStudentType(), s1.getStudentType()); // Sắp xếp giảm dần theo Loại
        }
        return Integer.compare(s1.getAdmissionYear(), s1.getAdmissionYear()); // Sắp xếp tăng dần theo Năm
    }
	
}
