import static org.junit.Assert.*;

import org.junit.Test;


public class Factoriall {

	@Test
		public void FactorialTest1(){
			Factorial factorial = new Factorial();
			int answer = factorial.Factorials(5);
			assertEquals(120,answer);
		}
	@Test
	public void FactorialTest2(){
		Factorial factorial = new Factorial();
		int answer = factorial.Factorials(4);
		assertEquals(24,answer);
	}
		
	}


