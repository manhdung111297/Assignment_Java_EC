package entities;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 21 thg 9, 2023  21:36:56
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Students {
	 protected String studentID;
	 protected String fullName;
	 protected Date dateOfBirth;
	 protected int admissionYear;
	 protected double entranceScore;
	 protected int studentType;
	 protected  List<AcademicResult> academicResults;
	 
	 



		/**
		 * @param studentID
		 * @param fullName
		 * @param dateOfBirth
		 * @param admissionYear
		 * @param entranceScore
		 * @param studentType
		 */
		public Students(String studentID, String fullName, Date dateOfBirth, int admissionYear, double entranceScore,
				int studentType) {
			super();
			this.studentID = studentID;
			this.fullName = fullName;
			this.dateOfBirth = dateOfBirth;
			this.admissionYear = admissionYear;
			this.entranceScore = entranceScore;
			this.studentType = studentType;
		}



	
		
		
	    
}
