package java_core_example4;

import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Town.
 *
 * @author        : DungLM6
 * @from         : DN23_FR_JAVA_04
 * @Created_date: 23 thg 9, 2023  17:15:39
 * @System_Name    : java_core
 * @Version        : 1.0
 * @Create_by    : LENOVO
 */
public class Town {
	
	/** The households. */
	private List<Household> households;
	
	/**
	 * Instantiates a new town.
	 */
	public Town() {
        households = new ArrayList<>();
    }
	
	/**
	 * Adds the household.
	 *
	 * @param household the household
	 */
	public void addHousehold(Household household) {
        households.add(household);
        
    }
	
	/**
	 * Display neighborhood info.
	 */
	public void displayNeighborhoodInfo() {
        for (Household household : households) {
            System.out.println(household.toString());
        }
    }

}
