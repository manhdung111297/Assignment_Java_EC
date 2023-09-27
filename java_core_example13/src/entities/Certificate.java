package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * The Class Certificate.
 */
public class Certificate {
	
	/** The certificated ID. */
	private String certificatedID;
	
	/** The certificate name. */
	private String certificateName;
	
	/** The certificate rank. */
	private String certificateRank;
	
	/** The certificated date. */
	private Date certificatedDate;
	
	/** The employee ID. */
	private String employeeID;

	/**
	 * Instantiates a new certificate.
	 */
	public Certificate() {
		super();
	}

	/**
	 * Instantiates a new certificate.
	 *
	 * @param certificatedID the certificated ID
	 * @param certificateName the certificate name
	 * @param certificateRank the certificate rank
	 * @param certificatedDate the certificated date
	 * @param employeeID the employee ID
	 */
	public Certificate(String certificatedID, String certificateName, String certificateRank, Date certificatedDate,
			String employeeID) {
		super();
		this.certificatedID = certificatedID;
		this.certificateName = certificateName;
		this.certificateRank = certificateRank;
		this.certificatedDate = certificatedDate;
		this.employeeID = employeeID;
	}

	/**
	 * Gets the certificated ID.
	 *
	 * @return the certificated ID
	 */
	public String getCertificatedID() {
		return certificatedID;
	}

	/**
	 * Sets the certificated ID.
	 *
	 * @param certificatedID the new certificated ID
	 */
	public void setCertificatedID(String certificatedID) {
		this.certificatedID = certificatedID;
	}

	/**
	 * Gets the certificate name.
	 *
	 * @return the certificate name
	 */
	public String getCertificateName() {
		return certificateName;
	}

	/**
	 * Sets the certificate name.
	 *
	 * @param certificateName the new certificate name
	 */
	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

	/**
	 * Gets the certificate rank.
	 *
	 * @return the certificate rank
	 */
	public String getCertificateRank() {
		return certificateRank;
	}

	/**
	 * Sets the certificate rank.
	 *
	 * @param certificateRank the new certificate rank
	 */
	public void setCertificateRank(String certificateRank) {
		this.certificateRank = certificateRank;
	}

	/**
	 * Gets the certificated date.
	 *
	 * @return the certificated date
	 */
	public Date getCertificatedDate() {
		return certificatedDate;
	}

	/**
	 * Sets the certificated date.
	 *
	 * @param certificatedDate the new certificated date
	 */
	public void setCertificatedDate(Date certificatedDate) {
		this.certificatedDate = certificatedDate;
	}

	
	/**
	 * Gets the candidate ID.
	 *
	 * @return the candidate ID
	 */
	public String getCandidateID() {
		return employeeID;
	}

	/**
	 * Sets the candidate ID.
	 *
	 * @param candidateID the new candidate ID
	 */
	public void setCandidateID(String candidateID) {
		this.employeeID = candidateID;
	}
	
	/**
	 * Show in for.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
	    return "Certificate{" +
	            "certificatedID='" + certificatedID + '\'' +
	            ", certificateName='" + certificateName + '\'' +
	            ", certificateRank='" + certificateRank + '\'' +
	            ", certificatedDate='" + certificatedDate + '\'' +
	            ", employeeID='" + employeeID + '\'' +
	            '}';
	}

	/**
	 * Input certificate.
	 *
	 * @param sc the sc
	 */
	public void inputCertificate(Scanner sc) {

		System.out.println("insert certificatedID ");
		this.certificatedID = sc.nextLine();

		System.out.println("insert certificateName ");
		this.certificateName = sc.nextLine();

		System.out.println("insert certificateRank ");
		this.certificateRank = sc.nextLine();
		System.out.println("insert certificatedDate (yyyy-MM-dd): ");
		while (true) {
			String certificatedDate = sc.nextLine();
			SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
			// sẽ thực hiện check if ngày không hợp lệ sẽ bắn ra ParseException 
			//thay vì phải sửa lại ngày cho đúng, mặc định true sẽ sửa các ngày không hợp lệ đó
			formatDate.setLenient(true);
			try {
				Date date = formatDate.parse(certificatedDate);
				this.certificatedDate = date;
				break;
			} catch (ParseException e) {
				System.err.println("Nhập không đúng định dạng (yyyy-MM-dd). Vui lòng nhập lại!");
			}
		}
	}


}
