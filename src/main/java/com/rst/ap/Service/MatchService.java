package com.rst.ap.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.rst.ap.Dao.MatchDao;
import com.rst.ap.Model.Match;
@Service
public class MatchService {

	@Autowired
	MatchDao matchDao;
	

	public String addMatch(Match match) {
	
		  String msg = matchDao.addMatch(match);
		
		return msg;
		 
	}
	public List<Match> getAllMatchs() {
		List<Match> allMatchs = matchDao.getAllMatchs();
		// TODO Auto-generated method stub
		return allMatchs;
	}
	
	public Match getMatchById(@RequestParam int id) {
		Match match = matchDao.getMatchById(id);
		
		return match;
	}
	public String deleteMatch(int id){
		
	int status = matchDao.deleteMatch(id);
	
	if(status==0) {
		return "match not found to delete";
		
	}else {
		
		return "match deleted";	
  }
 }
	public String updateMatch(int id, Match match) {
		int status = matchDao.updateMatch(id, match);
		if(status==0) {
			return "match not found to update";
			
		}else {
			
			return "match is updated";	
	  }
		
		
	}

}
