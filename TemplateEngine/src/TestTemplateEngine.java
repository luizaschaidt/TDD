import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;


public class TestTemplateEngine {
	TemplateEngine engine;
	HashMap<String, String> mapOfVariables;
	
	@Before
	public void setUp() throws Exception {
		engine = new TemplateEngine();
		mapOfVariables = new HashMap<>();
	}

	@Test 
	public void shouldNotBeNullTheString() {
		assertFalse(engine.verifyText(""));
		assertTrue(engine.verifyText("{$Hello}"));
	}
	
	@Test
	public void shouldStoreVariables() {
		mapOfVariables.put("name","Cenk");
		assertEquals("Cenk", mapOfVariables.get("name"));
		assertEquals(null, mapOfVariables.get("name1"));
	}

	@Test
	public void shouldEvaluateAsimpleString() throws Exception {
		mapOfVariables.put("name","Cenk");
		mapOfVariables.put("firstName","Cenk");
		mapOfVariables.put("lastName","Civici");
		assertEquals("Hello Cenk", engine.evaluate("Hello {$name}", mapOfVariables));
		assertEquals("Hello Cenk Civici", engine.evaluate("Hello {$firstName} ${lastName}", mapOfVariables));
	}
	
	@Test  (expected = MissingValueException.class)
	public void shouldThrowException() throws Exception {
		engine.evaluate("Hello {$name}", mapOfVariables);
		engine.evaluate("Hello {$firstName} ${lastName}", mapOfVariables);
		engine.evaluate("", mapOfVariables);
	}
	
	@Test
	public void shouldEvaluateAcomplesString() throws Exception {
		mapOfVariables.put("name","Cenk");
		assertEquals("Hello $Cenk}", engine.evaluate("Hello ${$name}}", mapOfVariables));
	}
}
