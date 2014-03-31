package edu.ycp.cs320.awesomepage;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;


import edu.ycp.cs320.awesomepage.shared.games;
import edu.ycp.cs320.awesomepage.shared.gamesList;

public class GameListTest {
	
	private ArrayList<games> listOfGames = new ArrayList<games>();
	private gamesList list = new gamesList();
	games game1 = new games();
	games game2 = new games();
	
	
	@Test
	public void testAddGame() {
		listOfGames.add(game1);
		listOfGames.add(game2);
		list.addGame(listOfGames);
		
		
		
	
	assertEquals(2,listOfGames.size());
	assertEquals(2,list.countGames());
	
				
	}
	
	

}
