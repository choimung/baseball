package baseball.domain;

import baseball.utils.Constance;
import java.util.List;

public class Referee {

    public String compare(List<Integer> computer, List<Integer> player) {
        Judgment judgment = new Judgment();
        int strike = judgment.countStrike(computer, player);
        int ball = judgment.countBall(computer, player) - strike;

        if (ball + strike <= Constance.MIN_COUNT) {
            return "낫싱";
        }
        if (ball <= Constance.MIN_COUNT) {
            return strike + "스트라이크";
        }
        if (strike <= Constance.MIN_COUNT) {
            return ball + "볼";
        }
        return ball + "볼" + " " + strike + "스트라이크";
    }

    public boolean isWin(String hint){
        return hint.equals("3스트라이크");
    }

}
