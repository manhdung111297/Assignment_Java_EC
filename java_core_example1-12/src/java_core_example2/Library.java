package java_core_example2;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 17 thg 9, 2023  20:19:57
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class Library {
	private String documentId;
	private String publisher;
	private int numberOfCopies;
	private String documentType;

	
	
	/**
	 * @param documentId
	 * @param publisher
	 * @param numberOfCopies
	 * @param documentType
	 */
	public Library(String documentId, String publisher, int numberOfCopies, String documentType) {
		super();
		this.documentId = documentId;
		this.publisher = publisher;
		this.numberOfCopies = numberOfCopies;
		this.documentType = documentType;
	}
	/**
	 * 
	 */
	public Library() {
		super();
	}
	/**
	 * @return the documentId
	 */
	public String getDocumentId() {
		return documentId;
	}
	/**
	 * @param documentId the documentId to set
	 */
	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}
	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}
	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	/**
	 * @return the numberOfCopies
	 */
	public int getNumberOfCopies() {
		return numberOfCopies;
	}
	/**
	 * @param numberOfCopies the numberOfCopies to set
	 */
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
	/**
	 * @return the documentType
	 */
	public String getDocumentType() {
		return documentType;
	}
	/**
	 * @param documentType the documentType to set
	 */
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	@Override
	public String toString() {
		return "Library [documentId=" + documentId + ", publisher=" + publisher + ", numberOfCopies=" + numberOfCopies
				+ ", documentType=" + documentType + "]";
	}
	

	
	
}
