package org.sportradar.gaming;

public class MatchComparator implements java.util.Comparator<Match>{
	@Override
    public int compare(Match m1, Match m2) {
        if (m1.getTotalScore() == m2.getTotalScore()) {
            return String.valueOf(m2.getStartTime()).compareTo(String.valueOf(m1.getStartTime()));
        } else {
            return m2.getTotalScore() - m1.getTotalScore();
        }
    }

}
