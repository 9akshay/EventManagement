import static org.junit.Assert.*;

import org.junit.Test;

public class OptionTesting {

	@Test
	public void test() {
		Option op1 = new Option("Air Hall",200);
		assertEquals(200, op1.price);
	}

}
