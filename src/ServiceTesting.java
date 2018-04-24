import static org.junit.Assert.*;

import org.junit.Test;

public class ServiceTesting {

	@Test
	public void test() {
		Person cl1 = new Person("Akshay");
		
		Option op1 = new Option("Air Hall",200);
		
		Adon a1 = new Adon("Sound",100);
		
		Option opl1[] = new Option[1];
		opl1[0] = op1;
		
		Adon adl1[] = new Adon[1];
		adl1[0] = a1;
		
		Service s1 = new Service("Hall Booking",1000,10,opl1,adl1);
		
		s1.bookService(op1, adl1);
		s1.printBill();
	}

}
