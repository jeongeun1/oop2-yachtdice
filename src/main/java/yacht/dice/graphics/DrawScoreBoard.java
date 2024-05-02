package yacht.dice.graphics;

import yacht.dice.DiceList;
import yacht.dice.scoreboard.Scoreboard;
import yacht.dice.scoreboard.ScoreboardManager;

public class DrawScoreBoard {
        String scoreBoard = """
                +----------+------+--------+--------+-------+-------+-------+------------+--------+-------------+------------+------------+------------+-------+---------+
                | CHOICE   |  a   |    b   |   c    |   d   |   e   |   f   |            |   g    |      h      |     i      |     j      |      k     |   l   |         | 
                +----------+------+--------+--------+-------+-------+-------+------------+--------+-------------+------------+------------+------------+-------+---------+
                | CATEGORY | Aces | Deuces | Threes | Fours | Fives | Sixes |▶ SUBTOTAL ◀| Choice | 4 of a Kind | Full House | S.Straight | L.Straight | Yacht |▶ TOTAL ◀|
                +----------+------+--------+--------+-------+-------+-------+------------+--------+-------------+------------+------------+------------+-------+---------+
                | SCORE    | """;
        String lastLine = """
                +----------+------+--------+--------+-------+-------+-------+------------+--------+-------------+------------+------------+------------+-------+---------+
                """;

    public String printScoreBoard() {return scoreBoard;}
    public String printLastLine() {return lastLine;}
}
