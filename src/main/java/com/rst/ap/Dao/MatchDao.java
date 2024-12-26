package com.rst.ap.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.rst.ap.Model.Match;
@Repository
public class MatchDao {
	

	
	// client - -----> req- localhsot:8080/getallMatchs - Controller -  Service - Dao(repo)
	
	ArrayList<Match> matches  = new  ArrayList<Match>();
	
	public MatchDao() {
	}
	
	 public String  addMatch(Match match) {
		 	matches.add(match);
		
		  	return "added succsessfully";
	
	}
	 
	 public List<Match> getAllMatchs() {

		 	return matches;
		 
	 }


public Match getMatchById(int id) {
	
	for( Match match : matches) {
		
			if(match.getMatchid() == id)
		{
			return match;
		}
}
			return null;
}
public int deleteMatch(int id) {
	
	for (Match match : matches) {
			if(match.getMatchid()==id) {
			matches.remove(match);
			 
			return 1;
	  }
	}
			return 0;
  }
public int updateMatch(int id, Match match) {
	int status = deleteMatch(id);
	if(status==1) {
		matches.add(match);
		return 1;
	}else
	{
		return 0;
	}
  }
}



