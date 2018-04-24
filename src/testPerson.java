import static org.junit.Assert.*;

import org.junit.Test;

public class testPerson {

	@Test
	public void test() {
		Person person = new Person("Ramdev");
		assertEquals("Ramdev", person.name);
	}

}
