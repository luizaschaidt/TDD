package src;
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

	@Test 
	public void testaProtocolo(){
		assertEquals("http", splitter.extraiProtocolo("http://www.google.se"));
		assertEquals("https", splitter.extraiProtocolo("https://www.google.se"));
		assertEquals("ftp", splitter.extraiProtocolo("ftp://www.google.se"));
		assertEquals("Url inválida", splitter.extraiProtocolo(""));
	}
	
	@Test 
	public void testaDominio(){
		assertEquals("www.google.se", splitter.extraiDominio("http://www.google.se"));
		assertEquals("www.gogle.se", splitter.extraiDominio("http://www.gogle.se/path"));
		assertEquals("yahoo.com.br", splitter.extraiDominio("ftp://yahoo.com.br/path/ahuahua/sss"));
		assertEquals("Url inválida", splitter.extraiProtocolo("https://go  ogle.com"));
	}
	
	@Test 
	public void testaCaminho(){
		assertEquals("", splitter.extraiCaminho("http://www.google.se"));
		assertEquals("path", splitter.extraiCaminho("http://www.gogle.se/path"));
		assertEquals("a-path", splitter.extraiCaminho("http://a.site.with/a-path"));
		assertEquals("Url inválida", splitter.extraiProtocolo(""));
	}
	
}
