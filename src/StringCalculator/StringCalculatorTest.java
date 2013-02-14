package StringCalculator;

import static org.junit.Assert.*;
import StringCalculator.StringCalculator;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void testCalculator() throws Exception {
		StringCalculator s = new StringCalculator(); // define target class
		
		System.out.println("Input: '', Output: 0 (Should treat empty string as zero)");
		assertEquals(0, s.add("")); 
		
		System.out.println("Input: '17', Output: 17 (Should add single numbers)");
		assertEquals(17, s.add("17")); 
		
		System.out.println("Input: '2341,15', Output: 2356 (Should add comma separated numbers)");
		assertEquals(2356, s.add("2341,15"));
		
		System.out.println("Input: '34\\n1', Output: 35 (Should treat new line as separator)");
		assertEquals(35, s.add("34\n1")); 
		
		System.out.println("Input: '//;\\n5;2', Output: 7 (Should support custom separators)");
		assertEquals(7, s.add("//;\n5;2")); 
	}

}
