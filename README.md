#### Gaming

This project implements a Gaming System to manage live sports matches.
It allows to start new matches, updating scores, finishing mathces and retrieving the matches which are currently in progress.

# Technology used
Java

### Classes

## Scoreboard

This class manages the live mathces.

It provides below methods :

# startMatch(String homeTeam, String awayTeam, double startTime)
This method starts match between home team and away team.
If the match is not already existing, It adds the match to the list of matches.

# updateScore(String homeTeam, String awayTeam, int homeScore, int awayScore)
This method updates the score of matches which are started.
It finds the specific match and update the score with new one.

# finishMatch(String homeTeam, String awayTeam)
This method removes the given match from the list of matches.

# getMatchesInProgress()
This method returns a list of live matches sorted by total score in descending order.
If the total score is same, it will sort according to start time of the match.



## Match

This class contains information about all the matches. It includes names, scores, start time and the match is finished or not.

# getHomeTeam()
This method returns name of the home team.

# getAwayTeam()
This method returns name of the away team.

# getHomeScore()
This method returns current score of the home team.

# getAwayScore()
This method returns current score of the away team.

# isFinished()
This method returns whether the match is finished or not.

# getStartTime()
This method returns start time of the match.

# getTotalScore()
This method returns sum of the home and away team's scores.

### Use

# Create a Scoreboard object
Scoreboard scoreboard = new Scoreboard();

# Start the matches
scoreboard.startMatch("Mexico", "Canada", 10.00);
scoreboard.startMatch("Spain", "Brazil", 10.50);
scoreboard.startMatch("Germany", "France", 11.00);
scoreboard.startMatch("Uruguay", "Italy", 12.40);
scoreboard.startMatch("Argentina", "Australia", 11.30);
scoreboard.startMatch("Germany", "Brazil", 14.00);

# Update the scores
scoreboard.updateScore("Mexico", "Canada", 0, 5);
scoreboard.updateScore("Spain", "Brazil", 10, 2);
scoreboard.updateScore("Germany", "France", 2, 2);
scoreboard.updateScore("Uruguay", "Italy", 6, 6);
scoreboard.updateScore("Argentina", "Australia", 1, 3); 
scoreboard.updateScore("Germany", "Brazil", 8, 6);

# Finish a match
scoreboard.finishMatch("Germany", "Brazil");

# Get live matches, sorted with total score
scoreboard.getMatchesInProgress();


## Example with the class containing main method

public class FootballWorldCup 
{
    public static void main( String[] args )
    {
    //Starting matches
    scoreboard.startMatch("Mexico", "Canada", 10.00);
    scoreboard.startMatch("Spain", "Brazil", 10.50);
    scoreboard.startMatch("Germany", "France", 11.00);
    scoreboard.startMatch("Uruguay", "Italy", 12.40);
    scoreboard.startMatch("Argentina", "Australia", 11.30);
    scoreboard.startMatch("Germany", "Brazil", 14.00);

    //Updating scores
    scoreboard.updateScore("Mexico", "Canada", 0, 5);
    scoreboard.updateScore("Spain", "Brazil", 10, 2);
    scoreboard.updateScore("Germany", "France", 2, 2);
    scoreboard.updateScore("Uruguay", "Italy", 6, 6);
    scoreboard.updateScore("Argentina", "Australia", 1, 3); 
    scoreboard.updateScore("Germany", "Brazil", 8, 6);

    //Finishing a match
    scoreboard.finishMatch("Germany", "Brazil");

    //Displaying a sorted list of live matches
    scoreboard.getMatchesInProgress();


### Output

1. Uruguay 6 - Italy 6
2. Spain 10 - Brazil 2
3. Mexico 0 - Canada 5
4. Argentina 1 - Australia 3
5. Germany 2 - France 2
