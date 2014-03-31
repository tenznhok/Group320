package edu.ycp.cs320.awesomepage;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.awesomepage.shared.games;

public class gamesTest {
	private games gamesName;
	
	@Before
	public void setup(){
		
		gamesName = new games();
		gamesName.setGameName("Terris");
		gamesName.setGameName("Block");
		
	}
	
	@Test
	public void testGetGameName() {
		assertEquals( "Block",gamesName.getGameName() );
	}
	
	

}
