package edu.ycp.cs320.awesomepage;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;


import edu.ycp.cs320.awesomepage.shared.games;
import edu.ycp.cs320.awesomepage.shared.gamesList;

public class GameListTest {
	
	private ArrayList<games> listOfGames = new ArrayList<games>();
	private gamesList list = new gamesList();
	games game1 = new games("Terris");
	games game2 = new games("Block");
	games game3 = new games("Mario");
	
	
	
	
	@Test
	public void testAddGame() {
		
		listOfGames.add(game1);
		listOfGames.add(game2);
		list.addGame(game2);
		listOfGames.add(game3);
		
		
		
		
	
	assertEquals(3,listOfGames.size());
	

				
	}
	
	public void testRemoveGame(){
		
	}

	
	

}
