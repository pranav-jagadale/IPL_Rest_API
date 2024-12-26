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

import com.rst.ap.Model.Match;
import com.rst.ap.Service.MatchService;
@RestController
public class MatchController {
	
	
	//private static final List<Match> AllMatchs = null;
	@Autowired
	private MatchService matchService;

@PostMapping("/api/matchs")
public String addMatch(@RequestBody Match match) {
		
		    String msg  =  matchService.addMatch(match);	
			return null;
			
	}
@GetMapping("/api/matchs/allll")
public List<Match> getAllMatchs() {
	
		List<Match> allMatch =  matchService.getAllMatchs();		
		return allMatch;	
	}
@GetMapping("/api/matchm")
public Object getMatchById(@RequestParam int id) {
		
		Match match = matchService.getMatchById(id);
		if(match!= null)
		{
			return match;
		}
		else
		{
			return "match not found";
	}
}
@DeleteMapping("/api/matchs/{id}")
public String DeleteMatch(@PathVariable int id) {
	
		return matchService.deleteMatch(id);
		
	
}
@PutMapping("/api/matchup/{id}")
public String updateMatch(@RequestBody Match match,@PathVariable int id) {
		
		String msg = matchService.updateMatch(id, match);
		return msg;	
 }	
}

