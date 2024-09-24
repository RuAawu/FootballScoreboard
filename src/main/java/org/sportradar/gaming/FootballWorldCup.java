package org.sportradar.gaming;

public class FootballWorldCup 
{
    public static void main( String[] args )
    {
    	Scoreboard scoreboard = new Scoreboard();
    	scoreboard.startMatch("Mexico", "Canada", 10.00);
    	scoreboard.updateScore("Mexico", "Canada", 0, 5);
    	scoreboard.startMatch("Spain", "Brazil", 10.50);
    	scoreboard.updateScore("Spain", "Brazil", 10, 2);
    	scoreboard.startMatch("Germany", "France", 11.00);
    	scoreboard.updateScore("Germany", "France", 2, 2);
    	scoreboard.startMatch("Uruguay", "Italy", 12.40);
    	scoreboard.updateScore("Uruguay", "Italy", 6, 6); 
    	scoreboard.startMatch("Argentina", "Australia", 11.30);
    	scoreboard.updateScore("Argentina", "Australia", 1, 3); 
    	scoreboard.getMatchesInProgress();
    	
    }
}