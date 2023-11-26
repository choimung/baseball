package baseball.domain;

import baseball.utils.Constance;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Computer {
    public List<Integer> generateComputerNumber() {
        Set<Integer> computerNumber  = new HashSet<>();
        while (computerNumber.size() < Constance.MIN_NUMBER_COUNT){
            computerNumber.add(Randoms.pickNumberInRange(Constance.MIN_NUMBER_RANGE,Constance.MAX_NUMBER_RANGE));
        }
        return computerNumber.stream().sorted().toList();
    }
}
