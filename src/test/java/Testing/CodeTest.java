package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class CodeTest {

	@Test
	public void test() {
		JunitTest test = new JunitTest();
		int output = test.square(10);
		assertEquals(100, output);
	}
}
