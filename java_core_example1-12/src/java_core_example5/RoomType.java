package java_core_example5;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 13 thg 9, 2023  23:49:49
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public enum RoomType {
	   A(500),
	   B(300),
	   C(100);

	    private final double price;

	    RoomType(double price) {
	        this.price = price;
	    }

	    /**
    	 * Gets the price.
    	 *
    	 * @return the price
    	 */
    	public double getPrice() {
	        return this.price;
	    }

}
