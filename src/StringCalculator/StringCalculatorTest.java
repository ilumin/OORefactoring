package StringCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {
	
	StringCalculator stringCalculator = new StringCalculator();

	@Test
	public void testEmptyString(){
        assertEquals(0, stringCalculator.add("")); 
	}

	@Test
	public void testSingleNumber(){
		assertEquals(17, stringCalculator.add("17"));
	}

	@Test
	public void testCommaSeparateNumber(){
		assertEquals(2356, stringCalculator.add("2341,15"));
	}

	@Test
	public void testNewlineSeparateNumber(){
		assertEquals(35, stringCalculator.add("34\n1"));
	}

	@Test
	public void testCustomSeparator(){
		assertEquals(7, stringCalculator.add("//;\n5;2"));
	}

}
