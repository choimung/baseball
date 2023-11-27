package baseball.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RefereeTest {

    private static final List<Integer> ANSWER = Arrays.asList(1,2,3);

    @ParameterizedTest
    @CsvSource({"4,5,6,낫싱","1,4,5,1스트라이크","1,2,4,2스트라이크","3,2,1,2볼 1스트라이크" ,"1,2,3, 3스트라이크"})
    void compare(int num1, int num2, int num3, String result){
        Referee referee = new Referee();
        String actual = referee.compare(ANSWER, Arrays.asList(num1, num2, num3));
        org.assertj.core.api.Assertions.assertThat(actual).isEqualTo(result);
    }

}