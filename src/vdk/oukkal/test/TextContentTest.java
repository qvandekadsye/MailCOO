package vdk.oukkal.test;

import static org.junit.Assert.*;

import org.junit.Test;

import vdk.oukkal.mail.TextContent;

public class TextContentTest {

	@Test
	public void testGetConten(){
		TextContent t = new TextContent("test");
		assertEquals(t.getContent(),"test");
	}

}
