package java_core_example9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import util.PhoneException;

/**
 * @author        : DungLM6 
 * @from         : DN23_FR_JAVA_04
 * @Created_date: 15 thg 9, 2023  15:16:08 
 * @System_Name    :java_core 	
 * @Version        : 1.0 
 * @Create_by    : LENOVO
 */
public class ManagerReceiptService {
	
	private static Scanner sc = new Scanner(System.in);
	
	/**
	 * Insert customer.
	 *
	 * @param customers the customers
	 */
	public static void insertCustomer(List<Customer> customers) {
	    System.out.println("Nhập số hộ gia đình muốn thêm");
	    int numCustomer = sc.nextInt();
	    sc.nextLine();

	    for (int i = 0; i < numCustomer; i++) {
	        System.out.println("*****************************************");
	        System.out.println("Mời bạn nhập thông tin hộ gia đình:");
	        Customer customer = new Customer();
	        System.out.println("Nhập mã khách hàng: ");
	        customer.setCustomerId(sc.next());
	        sc.nextLine();
	        System.out.println("Nhập họ và tên: ");
	        customer.setNameCustomer(sc.nextLine());
	        System.out.println("Nhập địa chỉ: ");
	        customer.setAddress(sc.nextLine());

	        while (true) {
	            System.out.println("Nhập số điện thoại: ");
	            String inputPhoneString = sc.next();

	            if (util.Validator.validatePhone(inputPhoneString)) {
	                customer.setPhone(inputPhoneString);
	                break; 
	            } else {
	                try {
	                    throw new PhoneException("Lỗi không đúng định dạng format phone. Vui lòng nhập lại.");
	                } catch (PhoneException e) {
	                    System.err.println(e.getMessage());
	                }
	            }
	        }
	        System.out.println("Nhập chỉ số điện: ");
	        while (true) {
	        	try {
					customer.setElectricNumber(sc.nextInt());
					break;
				} catch (Exception e) {
					System.err.println("Chỉ số điện là số nguyên. Vui lòng nhập lại");
					 sc.nextLine();
				}
				
			}
	        // add List Customer
	        customers.add(customer);
	    }

	    if (!customers.isEmpty()) {
	        System.err.println("Bạn đã thêm khách hàng thành công ");
	        System.out.println(customers.toString());
	    } else {
	        System.err.println("Thêm khách hàng không thành công");
	    }
	}
	

	/**
	 * Gets the caculator.
	 *
	 * @param customers the customers
	 * @return the caculator
	 */
	public static List<Receipt> getCaculator(List<Customer> customers) {

		Customer customer = null;
		while (true) {
			System.out.println("Nhập Id cho Hộ gia đình cần lấy biên lai tiền điện");
			String customerId = sc.nextLine();
			customer = findCustomerById(customerId, customers);
			if (customer != null) {
				break;
			} else {
				System.err.println("Không tìm thấy khách hàng với ID " + customerId);
				System.err.println("Vui lòng nhập lại ID khách hàng.");
			}
		}

		Receipt receipt = new Receipt();
		System.out.println("Nhập ID Biên Lai: ");
		receipt.setReceiptId(sc.next());
		System.out.println("Nhập chỉ số điện cũ của hộ gia đình đó: ");
		receipt.setElectricNumberOld(sc.nextInt());
		receipt.setCustomer(customer);
		receipt.setPrice((customer.getElectricNumber() - receipt.getElectricNumberOld()) * 5);

		// Thêm biên lai vào danh sách và trả về danh sách biên lai
		List<Receipt> receipts = new ArrayList<>();
		receipts.add(receipt);
		return receipts;
	}


	/**
	 * Find customer by id.
	 *
	 * @param customerId the customer id
	 * @param customers the customers
	 * @return the customer
	 */
	public static Customer findCustomerById(String customerId, List<Customer> customers) {
		return customers.stream().filter(customer -> customer.getCustomerId().equals(customerId)).findFirst()
				.orElse(null); 
	}


	/**
	 * Delete receip by id.
	 *
	 * @param receiptsId the receipts id
	 * @param receipts the receipts
	 * @return true, if successful
	 */
	public static boolean deleteReceipById(String receiptsId, List<Receipt> receipts) {
		Receipt receiptToRemove = receipts.stream().filter(receipt -> receipt.getReceiptId().equals(receiptsId))
				.findFirst().orElse(null);
		if (receiptToRemove != null) {
		
			receipts.remove(receiptToRemove);

			System.err.println("Xóa thành công với ID " + receiptsId);
			return true;
		} else {
			System.err.println("Xóa không thành công với ID " + receiptsId);
			return false;
		}

	}


	/**
	 * Edits the receipt by id.
	 *
	 * @param receiptId the receipt id
	 * @param receipts the receipts
	 * @param newElectricNumberOld the new electric number old
	 * @return true, if successful
	 */
	public static boolean editReceiptById(String receiptId, List<Receipt> receipts, int newElectricNumberOld) {
		Receipt receiptToEdit = receipts.stream().filter(receipt -> receipt.getReceiptId().equals(receiptId))
				.findFirst().orElse(null);

		if (receiptToEdit != null) {
			// Thực hiện các thay đổi cần thiết, ví dụ cập nhật chỉ số điện cũ
			receiptToEdit.setElectricNumberOld(newElectricNumberOld);
			receiptToEdit.setPrice((receiptToEdit.getCustomer().getElectricNumber() - newElectricNumberOld) * 5);
			System.out.println("Chỉnh sửa thành công với ID " + receiptId);
			return true;
		} else {
			System.out.println("Không tìm thấy biên lai với ID " + receiptId);
			return false;
		}
	}

}
