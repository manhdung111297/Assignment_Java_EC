package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 21 thg 9, 2023  21:45:07
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PartTimeStudent  extends Students{
	private String affiliatedLocation;



	@Override
	public String toString() {
		return super.toString() + ", PartTimeStudent [affiliatedLocation=" + affiliatedLocation + "]";
	}
	
	
}
