package com.rst.ap.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.rst.ap.Model.Team;
import com.rst.ap.Service.TeamService;
@Repository
public class TeamDao {
	
	// client - -----> req- localhsot:8080/getallTeams - Controller -  Service - Dao(repo)
	
	ArrayList<Team> teams  = new  ArrayList<Team>();
	
	public TeamDao() {
				teams.add(new Team(1, "MI", "RCB", "MUMBAI"));
				teams.add(new Team(2, "CSK", "ABC", "XYZ"));
	}
	
	 public String  addTeam(Team team) {
		 	teams.add(team);
		
		  	return "added succsessfully";
	
	}
	 
	 public List<Team> getAllTeams() {

		 	return teams;
		 
	 }


public Team getTeamById(int id) {
	
	for( Team team : teams) {
		
			if(team.getId() == id)
		{
			return team;
		}
}
			return null;
}
public int deleteTeam(int id) {
	
	for (Team team : teams) {
			if(team.getId()==id) {
			teams.remove(team);
			 
			return 1;
	  }
	}
			return 0;
  }
public int updateTeam(int id, Team team) {
	int status = deleteTeam(id);
	if(status==1) {
		teams.add(team);
		return 1;
	}else
	{
		return 0;
	}
  }
}

