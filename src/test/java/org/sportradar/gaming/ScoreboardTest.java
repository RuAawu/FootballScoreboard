package org.sportradar.gaming;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Scoreboard.
 */
public class ScoreboardTest {

	@Test
	public void startMatchTest() {

		var scoreboard = new Scoreboard();
		scoreboard.startMatch("Mexico", "Canada", 10.00);
		Assert.assertNotNull(scoreboard.findMatch("Mexico", "Canada"));

	}

	@Test
	public void updateMatchTest() {
		var scoreboard = new Scoreboard();

		scoreboard.startMatch("Mexico", "Canada", 10.00);
		scoreboard.updateScore("Mexico", "Canada", 3, 4);
		scoreboard.findMatch("Mexico", "Canada");

		var match = scoreboard.getMatchesInProgress().get(0);

		Assert.assertEquals(3, match.getHomeScore());
		Assert.assertEquals(4, match.getAwayScore());

	}

	@Test
	public void finishMatchTest() {
		var scoreboard = new Scoreboard();
		scoreboard.startMatch("Mexico", "Canada", 10.00);
		scoreboard.finishMatch("Mexico", "Canada");
		Assert.assertNull(scoreboard.findMatch("Mexico", "Canada"));
	}

	@Test
	public void getMatchesInProgressTest() {
		var scoreboard = new Scoreboard();
		scoreboard.startMatch("Mexico", "Canada", 10.00);
		scoreboard.updateScore("Mexico", "Canada", 3, 4);
		scoreboard.startMatch("Germany", "France", 8.00);
		scoreboard.updateScore("Germany", "France", 8, 2);

		var match = scoreboard.getMatchesInProgress().get(0);
		var match1 = scoreboard.getMatchesInProgress().get(1);

		Assert.assertEquals("Germany", match.getHomeTeam());
		Assert.assertEquals("France", match.getAwayTeam());

		Assert.assertEquals("Mexico", match1.getHomeTeam());
		Assert.assertEquals("Canada", match1.getAwayTeam());

	}

	@Test
	public void findMatchTest() {
		var scoreboard = new Scoreboard();
		scoreboard.startMatch("Mexico", "Canada", 10.00);
		scoreboard.startMatch("Germany", "France", 8.00);
		Assert.assertNotNull(scoreboard.findMatch("Germany", "France"));

	}
}
