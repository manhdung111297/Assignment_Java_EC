package java_core_example2;

import java.util.Scanner;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 17 thg 9, 2023  20:31:41
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class Book extends Library {
	 private String author;
	   private int numberOfPages;
	
	/**
	 * @param documentId
	 * @param publisher
	 * @param numberOfCopies
	 * @param documentType
	 * @param author
	 * @param numberOfPages
	 */
	public Book(String documentId, String publisher, int numberOfCopies, String documentType, String author,
			int numberOfPages) {
		super(documentId, publisher, numberOfCopies, documentType);
		this.author = author;
		this.numberOfPages = numberOfPages;
	}
	/**
	 * 
	 */
	public Book() {
		super();
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the numberOfPages
	 */
	public int getNumberOfPages() {
		return numberOfPages;
	}
	/**
	 * @param numberOfPages the numberOfPages to set
	 */
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
	public void inputBook(Scanner sc) {
		System.out.println("Nhập thông tin sách");
		System.out.println("Nhập mã tài liệu sách: ");
		this.setDocumentId(sc.next());
		System.out.println("Nhập tên nhà xuất bản: ");
		this.setPublisher(sc.next());
		System.out.println("Nhập số bản phát hành: ");
		this.setNumberOfCopies(sc.nextInt());
		System.out.println("Nhập tên tác giả: ");
		this.author = sc.next();
		System.out.println("Nhập số trang: ");
		this.numberOfPages = sc.nextInt();
		System.err.println("Thêm sách thành công");
	}
	@Override
	public String toString() {
		return super.toString() + ", " + "Book [author=" + author + ", numberOfPages=" + numberOfPages + "]";
	}
	

}
