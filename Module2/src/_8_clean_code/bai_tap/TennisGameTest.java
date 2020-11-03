package _8_clean_code.bai_tap;

import org.junit.jupiter.api.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

public class TennisGameTest {
    public static final String WIN_FOR_PLAYER_1 = "Win for player1";
    public static final String WIN_FOR_PLAYER_2 = "Win for player2";
    public static final String ADVANTAGE_PLAYER_1 = "Advantage player1";
    public static final String ADVANTAGE_PLAYER_2 = "Advantage player2";
    private int player1Score;
    private int player2Score;
    private String expectedScore;

    public TennisGameTest(int player1Score, int player2Score, String expectedScore) {
        this.player1Score = player1Score;
        this.player2Score = player2Score;
        this.expectedScore = expectedScore;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getAllScores() {
        return Arrays.asList(new Object[][]{
                {0, 0, "Love-All"},
                {1, 1, "Fifteen-All"},
                {2, 2, "Thirty-All"},
                {3, 3, "Forty-All"},
                {4, 4, "Deuce"},

                {1, 0, "Fifteen-Love"},
                {0, 1, "Love-Fifteen"},
                {2, 0, "Thirty-Love"},
                {0, 2, "Love-Thirty"},
                {3, 0, "Forty-Love"},
                {0, 3, "Love-Forty"},
                {4, 0, WIN_FOR_PLAYER_1},
                {0, 4, WIN_FOR_PLAYER_2},

                {2, 1, "Thirty-Fifteen"},
                {1, 2, "Fifteen-Thirty"},
                {3, 1, "Forty-Fifteen"},
                {1, 3, "Fifteen-Forty"},
                {4, 1, WIN_FOR_PLAYER_1},
                {1, 4, WIN_FOR_PLAYER_2},

                {3, 2, "Forty-Thirty"},
                {2, 3, "Thirty-Forty"},
                {4, 2, WIN_FOR_PLAYER_1},
                {2, 4, WIN_FOR_PLAYER_2},

                {4, 3, ADVANTAGE_PLAYER_1},
                {3, 4, ADVANTAGE_PLAYER_2},
                {5, 4, ADVANTAGE_PLAYER_1},
                {4, 5, ADVANTAGE_PLAYER_2},
                {15, 14, ADVANTAGE_PLAYER_1},
                {14, 15, ADVANTAGE_PLAYER_2},

                {6, 4, WIN_FOR_PLAYER_1},
                {4, 6, WIN_FOR_PLAYER_2},
                {16, 14, WIN_FOR_PLAYER_1},
                {14, 16, WIN_FOR_PLAYER_2},
        });
    }

    @Test
    public void checkAllScores() {
        int highestScore = Math.max(this.player1Score, this.player2Score);
        int score1 = 0;
        int score2 = 0;
        for (int i = 0; i < highestScore; i++) {
            if (i < this.player1Score)
                score1 += 1;
            if (i < this.player2Score)
                score2 += 1;
        }
        assertEquals(this.expectedScore, TennisGame.getScore("John", "Bill", score1, score2));
    }
}
