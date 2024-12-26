package com.rst.ap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rst.ap.Model.Player;
import com.rst.ap.Service.PlayerService;

@RestController
public class PlayerController {
	
	//private static final List<Player> AllPlayers = null;
		@Autowired
		private PlayerService playerService;

	@PostMapping("/api/players")
	public String addPlayer(@RequestBody Player player) {
			
			    String msg  =  playerService.addPlayer(player);	
				return msg;
				
		}
	@GetMapping("/api/players/allll")
	public List<Player> getAllPlayers() {
		
			List<Player> allPlayer =  playerService.getAllPlayers();		
			return allPlayer;	
		}
	@GetMapping("/api/playerm")
	public Object getPlayerById(@RequestParam int id) {
			
			Player player = playerService.getPlayerById(id);
			if(player!= null)
			{
				return player;
			}
			else
			{
				return "player not found";
		}
	}
	@DeleteMapping("/api/players/{id}")
	public String DeletePlayer(@PathVariable int id) {
		
			return playerService.deletePlayer(id);
			
		
	}
	@PutMapping("/api/playerup/{id}")
	public String updatePlayer(@RequestBody Player player,@PathVariable int id) {
			
			String msg = playerService.updatePlayer(id, player);
			return msg;	
	 }	
	}



