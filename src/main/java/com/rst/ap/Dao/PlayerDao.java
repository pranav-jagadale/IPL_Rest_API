package com.rst.ap.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.rst.ap.Model.Player;

@Repository
public class PlayerDao {
ArrayList<Player> players  = new  ArrayList<Player>();
	
	public PlayerDao() {
				
	}
	
	 public String  addPlayer(Player player) {
		 	players.add(player);
		
		  	return "added succsessfully";
	
	}
	 
	 public List<Player> getAllPlayers() {

		 	return players;
		 
	 }


public Player getPlayerById(int id) {
	
	for( Player player : players) {
		
			if(player.getPlayerid() == id)
		{
			return player;
		}
}
			return null;
}
public int deletePlayer(int id) {
	
	for (Player player : players) {
			if(player.getPlayerid()==id) {
			players.remove(player);
			 
			return 1;
	  }
	}
			return 0;
  }
public int updatePlayer(int id, Player player) {
	int status = deletePlayer(id);
	if(status==1) {
		players.add(player);
		return 1;
	}else
	{
		return 0;
	}
  }
}



