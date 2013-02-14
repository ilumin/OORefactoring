package StringCalculator;

public class StringCalculator {
    public int add(String inputString) {
        if (inputString.isEmpty()) {
            return 0;
        }
        
        // to complicate to change string
        if (inputString.startsWith("//")) {
            char customSeparator = inputString.charAt(2);
            
            // Extract Local Variable (to use in new Extract Method)
            String stringToCalculate = inputString.substring(4);
            
            // Call that new Extract Method
            return add(stringToCalculate, customSeparator);
        } else {
            char customSeparator = ',';
            
            // Call that new Extract Method
            return add(inputString, customSeparator);
        }
    }

    // New method here
	private int add(String s, char customSeparator) {
		int result = 0;
		
		for (String n : s.split("[\n" + customSeparator + "]")) {
		    result += Integer.parseInt(n);
		}
		return result;
	}
}
