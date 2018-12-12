import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class NamePresent {
	private stringPresent stringpresent;
	
	@Before
	public void setUp(){
		stringpresent = new stringPresent();
	}
	
	@Test
	public void namesSearchTestWithMultipleOccurence() {
		String Names[] = {"Dave", "Ann", "George", "Sam", "Ted", "Gag", "Saj", "Agati", 
				"Mary", "Sam", "Ayan", "Dev", "Kity", "Meery", "Smith", "Johnson", 
				"Bill", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", 
				"Moore", "Taylor", "Anderson", "Thomas", "Jackson"};
		boolean result = stringpresent.SearchName(Names,"Sam");
		assertEquals(true,result);
		int result1 = stringpresent.OccurenceName();
		assertEquals(2,result1);
	}
	
	@Test
	public void namesSearchTestNoName() {
		String Names[] = {"Dave", "Ann", "George", "Sam", "Ted", "Gag", "Saj", "Agati", 
				"Mary", "Sam", "Ayan", "Dev", "Kity", "Meery", "Smith", "Johnson", 
				"Bill", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", 
				"Moore", "Taylor", "Anderson", "Thomas", "Jackson"};
		boolean result = stringpresent.SearchName(Names,"Jaffar");
		assertEquals(false,result);
		int result1 = stringpresent.OccurenceName();
		assertEquals(0,result1);
	}
	
	@Test
	public void namesSearchTestWithSingleOccurence() {
		String Names[] = {"Dave", "Ann", "George", "Sam", "Ted", "Gag", "Saj", "Agati", 
				"Mary", "Sam", "Ayan", "Dev", "Kity", "Meery", "Smith", "Johnson", 
				"Bill", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", 
				"Moore", "Taylor", "Anderson", "Thomas", "Jackson"};
		boolean result = stringpresent.SearchName(Names,"Dave");
		assertEquals(true,result);
		int result1 = stringpresent.OccurenceName();
		assertEquals(1,result1);
	}
	

}
