package baseball.domain;
import java.util.List;
import java.util.stream.IntStream;

public class Judgment {

    public int countBall(List<Integer> computer, List<Integer> player){
        return (int) player.stream()
                .filter(computer::contains)
                .count();
    }

    public int countStrike(List<Integer> computer, List<Integer> player) {
        return (int) IntStream.range(0, player.size())
                .filter(i -> computer.get(i).equals(player.get(i)))
                .count();
    }

}
