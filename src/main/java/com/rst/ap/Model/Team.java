package com.rst.ap.Model;


public class Team {
	
	private int id;
	private String name;
	private String venue;
	private String coach;
	
	public Team() {
		// TODO Auto-generated constructor stub
	}

	public Team(int id, String name, String venue, String coach) {
		super();
		this.id = id;
		this.name = name;
		this.venue = venue;
		this.coach = coach;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", venue=" + venue + ", coach=" + coach + "]";
	}


	
	
	
	

}
