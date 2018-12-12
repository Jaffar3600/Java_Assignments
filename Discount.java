import static org.junit.Assert.*;

import org.junit.Test;


public class Discount {
	
	@Test
	public void DiscountTest() {
		double range = 0.23;
		DiscountItem discount = new DiscountItem();
		double answer = discount.DiscountPrice(123);
		assertEquals(80,answer,range);
		
	}
	@Test
	public void DiscountTest1() {
		double range = 0.23;
		DiscountItem discount = new DiscountItem();
		double answer = discount.DiscountPrice(100);
		assertEquals(65,answer,range);
		
	}
	

}
