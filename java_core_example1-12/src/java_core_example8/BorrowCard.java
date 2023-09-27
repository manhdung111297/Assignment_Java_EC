package java_core_example8;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 23 thg 9, 2023  17:44:02
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class BorrowCard {
	private int borrowCardId;
    private int borrowDate;
    private int dueDate;
    private int bookSerialNumber;
    private Student borrowingStudent;
	/**
	 * @param borrowCardId
	 * @param borrowDate
	 * @param dueDate
	 * @param bookSerialNumber
	 * @param borrowingStudent
	 */
	public BorrowCard(int borrowCardId, int borrowDate, int dueDate, int bookSerialNumber, Student borrowingStudent) {
		super();
		this.borrowCardId = borrowCardId;
		this.borrowDate = borrowDate;
		this.dueDate = dueDate;
		this.bookSerialNumber = bookSerialNumber;
		this.borrowingStudent = borrowingStudent;
	}
	/**
	 * @return the borrowCardId
	 */
	public int getBorrowCardId() {
		return borrowCardId;
	}
	/**
	 * @param borrowCardId the borrowCardId to set
	 */
	public void setBorrowCardId(int borrowCardId) {
		this.borrowCardId = borrowCardId;
	}
	/**
	 * @return the borrowDate
	 */
	public int getBorrowDate() {
		return borrowDate;
	}
	/**
	 * @param borrowDate the borrowDate to set
	 */
	public void setBorrowDate(int borrowDate) {
		this.borrowDate = borrowDate;
	}
	/**
	 * @return the dueDate
	 */
	public int getDueDate() {
		return dueDate;
	}
	/**
	 * @param dueDate the dueDate to set
	 */
	public void setDueDate(int dueDate) {
		this.dueDate = dueDate;
	}
	/**
	 * @return the bookSerialNumber
	 */
	public int getBookSerialNumber() {
		return bookSerialNumber;
	}
	/**
	 * @param bookSerialNumber the bookSerialNumber to set
	 */
	public void setBookSerialNumber(int bookSerialNumber) {
		this.bookSerialNumber = bookSerialNumber;
	}
	/**
	 * @return the borrowingStudent
	 */
	public Student getBorrowingStudent() {
		return borrowingStudent;
	}
	/**
	 * @param borrowingStudent the borrowingStudent to set
	 */
	public void setBorrowingStudent(Student borrowingStudent) {
		this.borrowingStudent = borrowingStudent;
	}
	@Override
	public String toString() {
		return "BorrowCard [borrowCardId=" + borrowCardId + ", borrowDate=" + borrowDate + ", dueDate=" + dueDate
				+ ", bookSerialNumber=" + bookSerialNumber + ", borrowingStudent=" + borrowingStudent + "]";
	}
    
    

}
