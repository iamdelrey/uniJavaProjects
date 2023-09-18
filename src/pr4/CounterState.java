package pr4;

public class CounterState {
    private int teamLeftScore;
    private int teamRightScore;
    private final String teamLeftName;


    private final String teamRightName;

    private boolean isLeftLastUpdated;

    public CounterState(String teamLeft, String teamRight) {
        teamLeftName = teamLeft;
        teamRightName = teamRight;
    }

    public String getTeamLeftName() {
        return teamLeftName;
    }

    public String getTeamRightName() {
        return teamRightName;
    }

    public void incrementLeft() {
        teamLeftScore++;
        isLeftLastUpdated = true;
    }

    public void incrementRight() {
        teamRightScore++;
        isLeftLastUpdated = false;
    }


    public int getTeamLeftScore() {
        return teamLeftScore;
    }

    public int getTeamRightScore() {
        return teamRightScore;
    }

    public String getLastScorer() {
        if (teamLeftScore == 0 && teamRightScore == 0)
            return "N/A";
        return isLeftLastUpdated ? teamLeftName : teamRightName;
    }

    public String getWinner() {
        if (teamLeftScore == teamRightScore)
            return "DRAW";

        return teamLeftScore > teamRightScore ? teamLeftName : teamRightName;
    }
}