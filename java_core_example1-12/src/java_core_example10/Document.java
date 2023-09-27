package java_core_example10;

/**
* @author        : DungLM6
* @from         : DN23_FR_JAVA_04
* @Created_date: 16 thg 9, 2023  20:46:32
* @System_Name    : java_core
* @Version        : 1.0
* @Create_by    : LENOVO
*/
public class Document {
	   private String text;

	    /**
	 * @param text
	 */

	    public Document() {
	        this.text = "";
	    }

	    public Document(String st) {
	        this.text = st;
	    }
	    

	    /**
		 * @return the text
		 */
		public String getText() {
			return text;
		}

		/**
		 * @param text the text to set
		 */
		public void setText(String text) {
			this.text = text;
		}

		// Yêu cầu 2: Đếm số từ của văn bản
	    public int countText() {
	        String[] words = text.trim().split("\\s+");
	        return  words.length;
	    }

	    // Yêu cầu 3: Đếm số lượng ký tự A
	    public int countTextOfA() {
	        int count = 0;
	        for (int i = 0; i < text.length(); i++) {
	            if (Character.toLowerCase(text.charAt(i)) == 'a') {
	                count++;
	            }
	        }
	        return count;
	    }

	    // Yêu cầu 4: Chuẩn hoá văn bản
	    public String replaceText() {
	     return text = text.trim().replaceAll("\\s+", " ");
	    }

}
