import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SoftwareSalesTest {
	SoftwareSales s ;
	

//	R2:  Discount for 10-19 packages is 20%
//	R2a:  Final price for 10-19 is calculated correctly
//	R3:  Discount for 20-49 packages is 30%
//	R3a:  Final price for 20-49 is calculated correctly
//	R4:  Discount for 50-99 packages is 40%
//	R4a:  Final price for 50-99 s calculated correctly
//	R5:  Discount for 100+ packages is 50%
//	R5a:  Final price for 100+ is calculated correctly
//	R6:   If quantity < 0, then return -1

//	R1:  Price of software is $99 / package
	@Test
	public void testOneSoftwarePurchase() {
		int expectedOutput = 99;
		int q = 1;
		assertEquals(expectedOutput, s.calculatePrice(q));
//		 s = new SoftwareSales();
		 
		 
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
