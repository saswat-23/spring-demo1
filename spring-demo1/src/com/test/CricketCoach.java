package com.test;

public class CricketCoach implements Coach {

	private String name;
	private String email;
	private String sport;
	
	private FortuneService fortuneService;
	
	public CricketCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Bat for 1hr";
	}
	
	public String getFortune() {
		return "";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.predictFortune();
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	@Override
	public String toString() {
		return "CricketCoach [name=" + name + ", email=" + email + ", sport=" + sport + "]";
	}
	
}
