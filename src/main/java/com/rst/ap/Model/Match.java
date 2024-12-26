package com.rst.ap.Model;

public class Match {
	
	int matchid;
	String TeamOneName;
	String TeamTwoName;
	int date;
	String venue;
	String result;
	
	public Match() {
		// TODO Auto-generated constructor stub
	}

	public Match(int matchid, String teamOneName, String teamTwoName, int date, String venue, String result) {
		super();
		this.matchid = matchid;
		TeamOneName = teamOneName;
		TeamTwoName = teamTwoName;
		this.date = date;
		this.venue = venue;
		this.result = result;
	}

	public int getMatchid() {
		return matchid;
	}

	public void setMatchid(int matchid) {
		this.matchid = matchid;
	}

	public String getTeamOneName() {
		return TeamOneName;
	}

	public void setTeamOneName(String teamOneName) {
		TeamOneName = teamOneName;
	}

	public String getTeamTwoName() {
		return TeamTwoName;
	}

	public void setTeamTwoName(String teamTwoName) {
		TeamTwoName = teamTwoName;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Match [matchid=" + matchid + ", TeamOneName=" + TeamOneName + ", TeamTwoName=" + TeamTwoName + ", date="
				+ date + ", venue=" + venue + ", result=" + result + "]";
	}
	
	

}
