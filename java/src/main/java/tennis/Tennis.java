package tennis;

public class Tennis {
    private PlayerScore playerAScore = new Love();
    private PlayerScore playerBScore = new Love();

    public Tennis() {
    }

    void playerBScores() {
        playerBScore = playerBScore.playerScores();
    }

    void playerAScores() {
        playerAScore = playerAScore.playerScores();
    }

    String score() {
        if (inBeginningOfGame()) {
            if (playerAScore.getWonBalls() == 4)
                return "game-A";
            if (playerBScore.getWonBalls() == 4)
                return "game-B";
            return playerAScore.format() + "-" + playerBScore.format();
        } else {
            if (playerAScore.getWonBalls() - playerBScore.getWonBalls() == -2)
                return "game-B";
            if (playerAScore.getWonBalls() - playerBScore.getWonBalls() == -1)
                return "advantage-B";
            if (playerAScore.getWonBalls() - playerBScore.getWonBalls() == 1)
                return "advantage-A";
            if (playerAScore.getWonBalls() - playerBScore.getWonBalls() == 0)
                return "deuce";
            if (playerAScore.getWonBalls() - playerBScore.getWonBalls() == 2)
                return "game-A";
            else
                throw new RuntimeException("cant happen");
        }

    }

    private boolean inBeginningOfGame() {
        return playerAScore.getWonBalls() + playerBScore.getWonBalls() < 6;
    }

    private static class Love extends PlayerScore {
        String format() { return "love"; }
        PlayerScore playerScores() { return new Fifteen(); }
    }

    private static class Fifteen extends PlayerScore {
        String format() { return "fifteen"; }
        PlayerScore playerScores() { return new PlayerScore(2); }
    }

}