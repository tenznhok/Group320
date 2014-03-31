package edu.ycp.cs320.awesomepage.shared;

import java.util.ArrayList;

public class gamesList {
		private games gameName;
	 	private ArrayList<games> listOfGames;
	 	
	 
	 	// add games into the user's list
	 	public void addGame(ArrayList<games> games){
	 		listOfGames.addAll(games);		
	 	}
	 	
	 	//remove games from the user's list
	 	public void removeGame(games games){
	 		ArrayList<games> toRemove = new ArrayList<games>();
	 		
	 			for (int i = 0; i < listOfGames.size(); i++){
	 				games = listOfGames.get(i);
	 				if (games.equals(getGameName())){
	 					toRemove.add(games);
	 				}
	 			}
	 			
	 			listOfGames.removeAll(toRemove);
	 	}
	 	
	 	
	 	//count how many games in the list
	 	public int countGames(){
	 		int count; 
	 		count = listOfGames.size();
	 		return count;
	 	}
	 
	 	public games getGameName() {
	 		return gameName;
	 	}
	 
	 	public void setGameName(games gameName) {
	 		this.gameName = gameName;
	 	}
	 	

}
