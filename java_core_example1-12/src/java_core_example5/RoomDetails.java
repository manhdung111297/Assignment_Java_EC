package java_core_example5;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 13 thg 9, 2023  23:36:47
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class RoomDetails {
	private RoomType roomType;

	/**
	 * @param roomType
	 */
	public RoomDetails(RoomType roomType) {
		super();
		this.roomType = roomType;
	}

	/**
	 * 
	 */
	public RoomDetails() {
		
	}

	/**
	 * @return the roomType
	 */
	public RoomType getRoomType() {
		return roomType;
	}

	/**
	 * @param roomType the roomType to set
	 */
	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

}
