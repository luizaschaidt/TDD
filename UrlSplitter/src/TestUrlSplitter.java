import org.junit.Test;

import junit.framework.TestCase;


public class TestUrlSplitter extends TestCase {
	UrlSplitter splitter;
	protected void setUp() throws Exception {
		splitter = new UrlSplitter();
	}
	
	@Test 
	public void testaConteudoUrl(){
		assertFalse(splitter.verificaUrl(""));
		assertTrue(splitter.verificaUrl("http://www.google.com"));
		assertTrue(splitter.verificaUrl("https://google.com"));
		assertFalse(splitter.verificaUrl("google.comhttps://"));
		assertFalse(splitter.verificaUrl("https://go  ogle.com"));
		assertFalse(splitter.verificaUrl("://"));
	}

}
