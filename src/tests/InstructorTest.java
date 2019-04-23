package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import model.Instructor;

public class InstructorTest {
	
	private static Instructor instructor;
	
	@Before
	public void setup() {
		instructor = new Instructor("Jennifer", "Jarrell");
	}
	
	@Test
	public void testMakeEmailAddress() {
		String expected = "jjarrell@dmacc.edu";
		String actual = instructor.getEmail();
		assertTrue(expected.equals(actual));
		assertEquals("kcat@dmacc.edu", Instructor.makeEmailAddress("kit", "cat"));
		assertEquals("kcat@dmacc.edu", Instructor.makeEmailAddress("KIT", "CAT"));
	}
}
