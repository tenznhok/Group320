package edu.ycp.cs320.awesomepage;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.awesomepage.shared.chatBox;

public class ChatBoxTest {
	private chatBox chat;
	
	@Before
	public void setUp(){
		chat = new chatBox();
		chat.setId(1);
		
	}

	@Test
	public void testGetId() {
		assertEquals(1,chat.getId());
		
	}

}
