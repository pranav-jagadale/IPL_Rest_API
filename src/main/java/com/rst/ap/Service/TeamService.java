package com.rst.ap.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rst.ap.Dao.TeamDao;
import com.rst.ap.Model.Team;
@Service
public class TeamService {

	@Autowired
	TeamDao teamDao;
	

	public String addTeam(Team team) {
	
		  String msg = teamDao.addTeam(team);
		
		return msg;
		 
	}
	public List<Team> getAllTeams() {
		List<Team> allTeams = teamDao.getAllTeams();
		// TODO Auto-generated method stub
		return allTeams;
	}
	
	public Team getTeamById(@RequestParam int id) {
		Team team = teamDao.getTeamById(id);
		
		return team;
	}
	public String deleteTeam(int id){
		
	int status = teamDao.deleteTeam(id);
	
	if(status==0) {
		return "team not found to delete";
		
	}else {
		
		return "team deleted";	
  }
 }
	public String updateTeam(int id, Team team) {
		int status = teamDao.updateTeam(id, team);
		if(status==0) {
			return "team not found to update";
			
		}else {
			
			return "team is updated";	
	  }
		
		
	}
	}


