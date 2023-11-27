package baseball.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class JudgmentTest {

    private static final List<Integer> ANSWER = Arrays.asList(1,2,3);
    private Judgment judgment;

    @BeforeEach
    void beforeEach(){
        judgment = new Judgment();
    }

    @ParameterizedTest
    @CsvSource({"1,2,3,3", "2,3,4,2", "4,5,6,0"})
    void 볼개수테스트(int num1, int num2, int num3, int expected){
        int actual = judgment.countBall(ANSWER, Arrays.asList(num1, num2, num3));
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"1,2,4,2", "1,2,3,3", "4,5,6,0"})
    void 스트라이크개수테스트(int num1, int num2, int num3, int expected){
        int actual = judgment.countStrike(ANSWER, Arrays.asList(num1, num2, num3));
        Assertions.assertThat(actual).isEqualTo(expected);
    }

}