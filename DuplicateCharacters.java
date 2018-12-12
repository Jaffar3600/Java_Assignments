import static org.junit.Assert.*;

import org.junit.Test;


public class DuplicateCharacters {

	@Test
	public void DuplicateCharactersTest() {
		Duplicate duplicate = new Duplicate();
		String answer = duplicate.DuplicateChar("abcabcabc");
		assertEquals("abc",answer);
		String answer1 = duplicate.DuplicateChar("javaforschool");
		assertEquals("javforschl",answer1);
		String answer2 = duplicate.DuplicateChar("Mississippi");
		assertEquals("Misp",answer2);
		String answer3 = duplicate.DuplicateChar("Jaffar");
		assertEquals("Jafr",answer3);
	}

}
