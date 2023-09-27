package java_core_example2;

import java.util.Scanner;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 17 thg 9, 2023  20:33:13
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class Magazine extends Library {
	private int issueNumber;
    private String publicationMonth;

    
	/**
	 * @param documentId
	 * @param publisher
	 * @param numberOfCopies
	 * @param documentType
	 * @param issueNumber
	 * @param publicationMonth
	 */
	public Magazine(String documentId, String publisher, int numberOfCopies, String documentType, int issueNumber,
			String publicationMonth) {
		super(documentId, publisher, numberOfCopies, documentType);
		this.issueNumber = issueNumber;
		this.publicationMonth = publicationMonth;
	}
	/**
	 * 
	 */
	public Magazine() {
		super();
	}
	/**
	 * @return the issueNumber
	 */
	public int getIssueNumber() {
		return issueNumber;
	}
	/**
	 * @param issueNumber the issueNumber to set
	 */
	public void setIssueNumber(int issueNumber) {
		this.issueNumber = issueNumber;
	}
	/**
	 * @return the publicationMonth
	 */
	public String getPublicationMonth() {
		return publicationMonth;
	}
	/**
	 * @param publicationMonth the publicationMonth to set
	 */
	public void setPublicationMonth(String publicationMonth) {
		this.publicationMonth = publicationMonth;
	}
	
	/**
	 * Input magazine.
	 *
	 * @param sc the sc
	 */
	public void inputMagazine(Scanner sc) {
		System.out.println("Nhập thông tin tạp chí");
		System.out.println("Nhập mã tài liệu tạp chí: ");
		this.setDocumentId(sc.next());
		System.out.println("Nhập tên nhà xuất bản: ");
		this.setPublisher(sc.next());
		System.out.println("Nhập số bản phát hành: ");
		this.setNumberOfCopies(sc.nextInt());
		System.out.println("Nhập số phát hành: ");
		this.issueNumber = sc.nextInt();
		System.out.println("Nhập số trang: ");
		this.publicationMonth = sc.next();
		System.err.println("Thêm tạp chí thành công");
	}
	@Override
	public String toString() {
		return super.toString() + ", " + "Magazine [issueNumber=" + issueNumber + ", publicationMonth=" + publicationMonth + "]";
	}

}
