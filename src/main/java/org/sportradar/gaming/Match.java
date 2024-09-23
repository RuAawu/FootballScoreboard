package org.sportradar.gaming;

public class Match {
	private String homeTeam;
	private String awayTeam;
	private int homeScore;
	private int awayScore;
	private boolean finished;
	private double startTime;

	public Match(String homeTeam, String awayTeam, double startTime) {
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
		this.homeScore = 0;
		this.awayScore = 0;
		this.finished = false;
		this.startTime = startTime;
	}

	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;
	}

	@Override
	public String toString() {
		return "" + homeTeam + " " + homeScore + " - " + awayTeam + " " + awayScore + "\n";

	}

	public void setAwayTeam(String awayTeam) {
		this.awayTeam = awayTeam;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	public String getHomeTeam() {
		return homeTeam;
	}

	public String getAwayTeam() {
		return awayTeam;
	}

	public int getHomeScore() {
		return homeScore;
	}

	public void setHomeScore(int homeScore) {
		this.homeScore = homeScore;
	}

	public int getAwayScore() {
		return awayScore;
	}

	public void setAwayScore(int awayScore) {
		this.awayScore = awayScore;
	}

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	public double getStartTime() {
		return startTime;
	}

	public int getTotalScore() {
		return homeScore + awayScore;
	}
}