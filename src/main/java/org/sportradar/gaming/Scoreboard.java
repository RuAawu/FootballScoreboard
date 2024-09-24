package org.sportradar.gaming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Scoreboard {
	List<Match> matches = new ArrayList<>();

	public Scoreboard() {

	}

    //Method to start new match
	public void startMatch(String homeTeam, String awayTeam, double startTime) {
		Match match = new Match(homeTeam, awayTeam, startTime);

		Match match1 = findMatch(homeTeam, awayTeam);
		if (match1 == null) {
			matches.add(match);

		}

	}

	// Method to update score of the started matches
	public void updateScore(String homeTeam, String awayTeam, int homeScore, int awayScore) {
		Match match = findMatch(homeTeam, awayTeam);
		if (match != null) {
			match.setHomeScore(homeScore);
			match.setAwayScore(awayScore);
		}
	}

	// Method to finish match
	public void finishMatch(String homeTeam, String awayTeam) {
		Match match = findMatch(homeTeam, awayTeam);
		if (match != null) {
			matches.remove(match);
		}
	}

	// Method to get all the matches after sorting with total scores
	public List<Match> getMatchesInProgress() {
		List<Match> inProgress = new ArrayList<>();

		for (Match match : matches) {
			if (!match.isFinished()) {
				inProgress.add(match);
			}
		}
		Collections.sort(inProgress, new MatchComparator() {

		});

		for (int i = 0; i < inProgress.size(); i++) {
			Match match = inProgress.get(i);
			System.out.println((i + 1) + ". " + match.getHomeTeam() + " " + match.getHomeScore() + " - "
					+ match.getAwayTeam() + " " + match.getAwayScore() );
		}

		return inProgress;

	}

	// Method to find match
	public Match findMatch(String homeTeam, String awayTeam) {
		for (Match match : matches) {
			if (match.getHomeTeam().equals(homeTeam) && match.getAwayTeam().equals(awayTeam)) {
				return match;
			}
		}
		return null;
	}
}
