package java_core_example4;

import java.util.ArrayList;
import java.util.List;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 23 thg 9, 2023  17:14:17
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class Household {
	private int numberOfMembers;
    private int houseNumber;
    private List<Person> members;
	/**
	 * @param numberOfMembers
	 * @param houseNumber
	 * @param members
	 */
	public Household(int numberOfMembers, int houseNumber) {
		super();
		this.numberOfMembers = numberOfMembers;
		this.houseNumber = houseNumber;
		this.members = new ArrayList<>();
	}
	
	public void addPerson(Person person) {
        members.add(person);
    }
	/**
	 * @return the numberOfMembers
	 */
	public int getNumberOfMembers() {
		return numberOfMembers;
	}
	/**
	 * @param numberOfMembers the numberOfMembers to set
	 */
	public void setNumberOfMembers(int numberOfMembers) {
		this.numberOfMembers = numberOfMembers;
	}
	/**
	 * @return the houseNumber
	 */
	public int getHouseNumber() {
		return houseNumber;
	}
	/**
	 * @param houseNumber the houseNumber to set
	 */
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	/**
	 * @return the members
	 */
	public List<Person> getMembers() {
		return members;
	}
	/**
	 * @param members the members to set
	 */
	public void setMembers(List<Person> members) {
		this.members = members;
	}
	@Override
	public String toString() {
		return "Househole [numberOfMembers=" + numberOfMembers + ", houseNumber=" + houseNumber + ", members=" + members
				+ "]";
	}
    

}
