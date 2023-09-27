package java_core_example5;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 13 thg 9, 2023  23:35:46
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class Room {
	private RoomDetails romDetails;
	private Person person;
	private int numberOfDays;
	/**
	 * @param romDetails
	 * @param person
	 * @param numberOfDays
	 */
	public Room(RoomDetails romDetails, Person person, int numberOfDays) {
		super();
		this.romDetails = romDetails;
		this.person = person;
		this.numberOfDays = numberOfDays;
	}
	
	/**
	 * 
	 */
	public Room() {
		super();
	}

	/**
	 * @return the romDetails
	 */
	public RoomDetails getRomDetails() {
		return romDetails;
	}
	/**
	 * @param romDetails the romDetails to set
	 */
	public void setRomDetails(RoomDetails romDetails) {
		this.romDetails = romDetails;
	}
	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}
	/**
	 * @param person the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}
	/**
	 * @return the numberOfDays
	 */
	public int getNumberOfDays() {
		return numberOfDays;
	}
	/**
	 * @param numberOfDays the numberOfDays to set
	 */
	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}
	
	

}
