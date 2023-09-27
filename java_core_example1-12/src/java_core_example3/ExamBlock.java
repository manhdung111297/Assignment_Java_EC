package java_core_example3;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 17 thg 9, 2023  23:09:25
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class ExamBlock {
	private String blockName;
	private double score;
	/**
	 * @param blockName
	 * @param score
	 */
	public ExamBlock(String blockName, double score) {
		super();
		this.blockName = blockName;
		this.score = score;
	}
	/**
	 * @return the blockName
	 */
	public String getBlockName() {
		return blockName;
	}
	/**
	 * @param blockName the blockName to set
	 */
	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}
	/**
	 * @return the score
	 */
	public double getScore() {
		return score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(double score) {
		this.score = score;
	}
	
    
}
