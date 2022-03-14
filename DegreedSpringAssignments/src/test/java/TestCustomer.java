import static org.junit.Assert.*;

import org.junit.Test;

import com.cg.model.Customer;

public class TestCustomer {
	
	Customer c=new Customer();
	
	@Test
	public void testId() {
		assertEquals("101",c.getCustomerId());
	}
	@Test
	public void testName() {
		assertEquals("Ryaan Faris",c.getCustomerName());
	}

}
