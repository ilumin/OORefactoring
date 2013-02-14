package StringCalculator;

public class StringCalculator {

	// New constant
	public static final char STANDARD_SEPARATOR = ',';
	public static final String DEFINE_CUSTOM_SEPARATOR = "//";
	
    public int add(String inputString) {
        if (inputString.isEmpty()) {
            return 0;
        }
        
        if (inputString.startsWith(DEFINE_CUSTOM_SEPARATOR)) {
            char customSeparator = inputString.charAt(2);
            
            String stringToCalculate = inputString.substring(4);
            
            return add(stringToCalculate, customSeparator);
        } else {
            return add(inputString, STANDARD_SEPARATOR);
        }
    }

	private int add(String s, char customSeparator) {
		int result = 0;
		
		for (String n : s.split("[\n" + customSeparator + "]")) {
		    result += Integer.parseInt(n);
		}
		return result;
	}
}
