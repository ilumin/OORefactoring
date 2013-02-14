package StringCalculator;

public class StringCalculator {
    public int add(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        
        // to complicate to change string
        if (s.startsWith("//")) {
            int returnValue = 0;
            
            // too complicate to change string
            // look like it duplicate code ?
            // long parameter ?
            for (String n : s.substring(4).split("[\n"+ s.charAt(2) +"]")) {
                returnValue += Integer.parseInt(n);
            }
            return returnValue;
        } else {
            int r = 0; // result
            
            // too complicate to change string
            // look like it duplicate code
            for (String n : s.split("[\n,]")) {
                r += Integer.parseInt(n);
            }
            return r;
        }
    }
}
