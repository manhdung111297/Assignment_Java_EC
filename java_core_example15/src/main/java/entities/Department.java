package entities;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 21 thg 9, 2023  21:48:24
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Department {
	private String departmentName;
    private List<Students> lisStudents;
	
	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + ", lisStudents=" + lisStudents + "]";
	}
	
	
    
    
}
