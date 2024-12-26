package com.rst.ap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rst.ap.Model.Team;
import com.rst.ap.Service.TeamService;

import jakarta.websocket.server.PathParam;

@RestController	
public class TeamController{
	
	//private static final List<Team> AllTeams = null;
	@Autowired
	private TeamService teamService;

@PostMapping("/api/teams")
public String addTeam(@RequestBody Team team) {
		
		    String msg  =  teamService.addTeam(team);	
			return null;
			
	}
@GetMapping("/api/teams/allll")
public List<Team> getAllTeams() {
	
		List<Team> allTeam =  teamService.getAllTeams();		
		return allTeam;	
	}
@GetMapping("/api/teamm")
public Object getTeamById(@RequestParam int id) {
		
		Team team = teamService.getTeamById(id);
		if(team!= null)
		{
			return team;
		}
		else
		{
			return "team not found";
	}
}
@DeleteMapping("/api/teams/{id}")
public String DeleteTeam(@PathVariable int id) {
	
		return teamService.deleteTeam(id);
		
	
}
@PutMapping("/api/teamup/{id}")
public String updateTeam(@RequestBody Team team,@PathVariable int id) {
		
		String msg = teamService.updateTeam(id, team);
		return msg;	
 }	
}
	
	

