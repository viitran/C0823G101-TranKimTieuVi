package ss8_clean_code_refactoring_java.exc;

public class TennisGame {
    public static final char ZEROPOINT = 0;
    public static final char ONEPOINT = 1;
    public static final char TWOPOINT = 2;
    public static final char THREEPOINT = 3;
    public static final String VALUE_LOVE = "Love";
    public static final String VALUE_FIFTEEN = "Fifteen";
    public static final String VALUE_THIRTY = "Thirty";
    public static final String VALUE_FORTY = "Forty";
    public static final String VALUE_ALL = "All";


    public static String getScore(String playerNameOne, String playerNameTwo, int scoreOne, int scoreTwo) {
        String score = "";
        int tempScore = 0;
        if (scoreOne == scoreTwo) {
            score = getReceiveEqualScore(scoreOne);
        } else if (scoreOne >= 4 || scoreTwo >= 4) {
            score = getEndScore(scoreOne, scoreTwo);
        } else {
            score = getExtraScore(scoreOne, scoreTwo, score);
        }
        return score;
    }

    private static String getReceiveEqualScore(int scoreOne) {
        String score;
        score = switch (scoreOne) {
            case ZEROPOINT -> VALUE_LOVE + " - " + VALUE_ALL;
            case ONEPOINT -> VALUE_FIFTEEN + " - " + VALUE_ALL;
            case TWOPOINT -> VALUE_THIRTY + " - " + VALUE_ALL;
            case THREEPOINT -> VALUE_FORTY + " - " + VALUE_ALL;
            default -> "Deuce";
        };
        return score;
    }

    private static String getEndScore(int scoreOne, int scoreTwo) {
        String score;
        int minusResult = scoreOne - scoreTwo;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    private static String getExtraScore(int scoreOne, int scoreTwo, String score) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = scoreOne;
            else {
                score += "-";
                tempScore = scoreTwo;
            }
            switch (tempScore) {
                case ZEROPOINT -> score += VALUE_LOVE;
                case ONEPOINT -> score += VALUE_FIFTEEN;
                case TWOPOINT -> score += VALUE_THIRTY;
                case THREEPOINT -> score += VALUE_FORTY;
            }
        }
        return score;
    }
}