import static org.junit.Assert.*;

import org.junit.Test;

public class AdonTesting {

	@Test
	public void test() {
		Adon ADSound = new Adon("Sound",100);
		assertEquals(100, ADSound.price);
	}

}
