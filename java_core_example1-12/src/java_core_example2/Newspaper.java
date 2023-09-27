package java_core_example2;

import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class Newspaper.
 *
 * @author        : DungLM6
 * @from         : DN23_FR_JAVA_04
 * @Created_date: 17 thg 9, 2023  20:34:34
 * @System_Name    : java_core
 * @Version        : 1.0
 * @Create_by    : LENOVO
 */
public class Newspaper extends Library {
	
	/** The publication date. */
	private String publicationDate;

	

	/**
	 * Instantiates a new newspaper.
	 *
	 * @param documentId the document id
	 * @param publisher the publisher
	 * @param numberOfCopies the number of copies
	 * @param documentType the document type
	 * @param publicationDate the publication date
	 */
	public Newspaper(String documentId, String publisher, int numberOfCopies, String documentType,
			String publicationDate) {
		super(documentId, publisher, numberOfCopies, documentType);
		this.publicationDate = publicationDate;
	}

	/**
	 * Instantiates a new newspaper.
	 */
	public Newspaper() {
		super();
	}

	/**
	 * Gets the publication date.
	 *
	 * @return the publicationDate
	 */
	public String getPublicationDate() {
		return publicationDate;
	}

	/**
	 * Sets the publication date.
	 *
	 * @param publicationDate the publicationDate to set
	 */
	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}
	
	/**
	 * Input newspaper.
	 *
	 * @param sc the sc
	 */
	public void inputNewspaper(Scanner sc) {
		System.out.println("Nhập thông tin báo");
		System.out.println("Nhập mã tài liệu báo: ");
		this.setDocumentId(sc.next());
		System.out.println("Nhập tên nhà xuất bản: ");
		this.setPublisher(sc.next());
		System.out.println("Nhập số bản phát hành: ");
		this.setNumberOfCopies(sc.nextInt());
		System.out.println("Nhập ngày phát hành: ");
		while (true) {
			String inputPublication = sc.next();
			try {
				if(util.Validator.validDateFormat(inputPublication)) {
					publicationDate = inputPublication;
					break;
				}
			} catch (Exception e) {
				System.out.println("Nhập sai định dạng (yyyy-MM-dd). Vui lòng nhập lại");
			}
		}
		System.err.println("Thêm báo thành công");
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return super.toString() + ", " + "Newspaper [publicationDate=" + publicationDate + "]";
	}

}
