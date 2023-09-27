package java_core_example3;

import java.util.List;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 17 thg 9, 2023  21:48:05
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class Student {
	private String studentId;
	private String fullName;
	private String address;
	private int priorityLevel;
	private List<ExamBlock> examBlocks;
	
	
	public void addExamBlock(ExamBlock examBlock) {
	    examBlocks.add(examBlock);
	}


	/**
	 * @param studentId
	 * @param fullName
	 * @param address
	 * @param priorityLevel
	 * @param examBlocks
	 */
	public Student(String studentId, String fullName, String address, int priorityLevel) {
		super();
		this.studentId = studentId;
		this.fullName = fullName;
		this.address = address;
		this.priorityLevel = priorityLevel;

	}


	/**
	 * @return the studentId
	 */
	public String getStudentId() {
		return studentId;
	}


	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}


	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}


	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}


	/**
	 * @return the priorityLevel
	 */
	public int getPriorityLevel() {
		return priorityLevel;
	}


	/**
	 * @param priorityLevel the priorityLevel to set
	 */
	public void setPriorityLevel(int priorityLevel) {
		this.priorityLevel = priorityLevel;
	}


	/**
	 * @return the examBlocks
	 */
	public List<ExamBlock> getExamBlocks() {
		return examBlocks;
	}


	/**
	 * @param examBlocks the examBlocks to set
	 */
	public void setExamBlocks(List<ExamBlock> examBlocks) {
		this.examBlocks = examBlocks;
	}
	
	
	
	
	
	

}
