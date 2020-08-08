package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class WordTest {

	@Test
	public void test() {
			JunitTest test = new JunitTest();
			int output = test.countA("Amendra Ahulwalia");
			assertEquals(5, output);
	}

}
