package java_core_example2;

import java.util.List;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class LibraryService.
 *
 * @author        : DungLM6
 * @from         : DN23_FR_JAVA_04
 * @Created_date: 17 thg 9, 2023  21:03:03
 * @System_Name    : java_core
 * @Version        : 1.0
 * @Create_by    : LENOVO
 */
public class LibraryService {
	
	/** The sc. */
	private static Scanner sc = new Scanner(System.in);

	/**
	 * Insert library.
	 *
	 * @param libraries the libraries
	 */
	public static void insertLibrary(List<Library> libraries) {
		boolean isClose = false;
		while (!isClose) {
			System.out.println("Chọn loại tài liệu cần nhập");
			System.out.println("1: Sách");
			System.out.println("2: Tạp chí");
			System.out.println("3: Báo");
			System.out.println("4: Quay lại menu");
			int num = sc.nextInt();
			try {
				switch (num) {
				case 1:
					Book book = new Book();
					book.inputBook(sc);
					book.setDocumentType("Sách");
					libraries.add(book);
					break;
				case 2:
					Magazine magazine = new Magazine();
					magazine.inputMagazine(sc);
					magazine.setDocumentType("Tạp chí");
					libraries.add(magazine);
					break;
				case 3:
					Newspaper newspaper = new Newspaper();
					newspaper.inputNewspaper(sc);
					newspaper.setDocumentType("Báo");
					libraries.add(newspaper);
					break;
				case 4:
					isClose = true;
					break;
				default:
					break;
				}
			} catch (Exception e) {
				System.out.println("The system has encountered an unexpected problem, sincerely sorry !!!");
			}

		}

	}

	/**
	 * Delete library.
	 *
	 * @param libraries the libraries
	 * @param doucmentId the doucment id
	 * @return true, if successful
	 */
	public static boolean deleteLibrary(List<Library> libraries, String doucmentId) {
		Library library = libraries.stream().filter(libraryList -> libraryList.getDocumentId().equals(doucmentId))
				.findFirst().orElse(null);
		if (library != null) {
			libraries.remove(library);
			System.err.println("Xóa thành công với id " + doucmentId);
			return true;
		} else {
			System.err.println("Xóa không thành công với id " + doucmentId);
			return false;
		}

	}

	/**
	 * Find library by type.
	 *
	 * @param libraries the libraries
	 * @param documentType the document type
	 * @return the library
	 */
	public static Library findLibraryByType(List<Library> libraries, String documentType) {
		return libraries.stream().filter(libraryList -> libraryList.getDocumentType().equals(documentType)).findFirst()
				.orElse(null);
	}

}
