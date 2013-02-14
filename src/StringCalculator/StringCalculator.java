package StringCalculator;

public class StringCalculator {
    public int add(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        
        // to complicate to change string
        if (s.startsWith("//")) {
            char customSeparator = s.charAt(2);
            
            // Extract Local Variable (to use in new Extract Method)
            String stringToCalculate = s.substring(4);
            
            // Call that new Extract Method
            return add(stringToCalculate, customSeparator);
        } else {
            char customSeparator = ',';
            
            // Call that new Extract Method
            return add(s, customSeparator);
        }
    }

    // New method here
	private int add(String s, char customSeparator) {
		int r = 0; // result
		
		for (String n : s.split("[\n" + customSeparator + "]")) {
		    r += Integer.parseInt(n);
		}
		return r;
	}
}
