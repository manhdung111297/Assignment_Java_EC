package java_core_example7;

import java.util.ArrayList;
import java.util.List;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 25 thg 9, 2023  13:36:43
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class SingletonPattern {
	List<Teachers> teachersList;
    List<Students> studentsList;
    
    private static SingletonPattern instance = null;
    
    private SingletonPattern() {
    	teachersList = new ArrayList<>();
    	studentsList = new ArrayList<>();
    	
    }
    
    public static SingletonPattern getInstance() {
    	if(instance == null) {
    		instance = new SingletonPattern();
    	}
    	return instance;
    }

	/**
	 * @return the teachersList
	 */
	public List<Teachers> getTeachersList() {
		return teachersList;
	}

	/**
	 * @param teachersList the teachersList to set
	 */
	public void setTeachersList(List<Teachers> teachersList) {
		this.teachersList = teachersList;
	}

	/**
	 * @return the studentsList
	 */
	public List<Students> getStudentsList() {
		return studentsList;
	}

	/**
	 * @param studentsList the studentsList to set
	 */
	public void setStudentsList(List<Students> studentsList) {
		this.studentsList = studentsList;
	}

	/**
	 * @param instance the instance to set
	 */
	public static void setInstance(SingletonPattern instance) {
		SingletonPattern.instance = instance;
	}
    
    
}
