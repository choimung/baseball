package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ComputerTest {


    @Test
    void 임의의3자리숫자생성(){
        Computer computer = new Computer();
        List<Integer> computerNumber = computer.generateComputerNumber();
        assertThat(computerNumber.size()).isEqualTo(3);
    }

}