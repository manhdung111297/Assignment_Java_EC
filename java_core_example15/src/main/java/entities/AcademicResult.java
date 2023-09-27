package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 21 thg 9, 2023  21:37:23
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AcademicResult {
	private String semesterName;
    private double averageScore;

	@Override
	public String toString() {
		return "AcademicResult [semesterName=" + semesterName + ", averageScore=" + averageScore + "]";
	}
    
    
}
