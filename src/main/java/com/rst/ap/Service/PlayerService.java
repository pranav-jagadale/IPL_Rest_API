package com.rst.ap.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.rst.ap.Dao.PlayerDao;
import com.rst.ap.Model.Player;

@Service
public class PlayerService {
	


	@Autowired
	PlayerDao playerDao;
	

	public String addPlayer(Player player) {
	
		  String msg = playerDao.addPlayer(player);
		
		return msg;
		 
	}
	public List<Player> getAllPlayers() {
		List<Player> allPlayers = playerDao.getAllPlayers();
		// TODO Auto-generated method stub
		return allPlayers;
	}
	
	public Player getPlayerById(@RequestParam int id) {
		Player player = playerDao.getPlayerById(id);
		
		return player;
	}
	public String deletePlayer(int id){
		
	int status = playerDao.deletePlayer(id);
	
	if(status==0) {
		return "player not found to delete";
		
	}else {
		
		return "player deleted";	
  }
 }
	public String updatePlayer(int id, Player player) {
		int status = playerDao.updatePlayer(id, player);
		if(status==0) {
			return "player not found to update";
			
		}else {
			
			return "player is updated";	
	  }
		
		
	}
	}

