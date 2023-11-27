package baseball.domain;

import static baseball.utils.Constance.MIN_NUMBER_COUNT;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Player {
    private final List<Integer> numbers;

    public Player(String numbers) {
        validateLength(numbers);
        validateNumber(numbers);
        validateDuplication(numbers);
        this.numbers = StringToIntegerList(numbers);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    private List<Integer> StringToIntegerList(String numbers){
        List<Integer> player = new ArrayList<>();
        for(int i = 0; i < numbers.length(); i++){
            player.add(Integer.parseInt(String.valueOf(numbers.charAt(i))));
        }
        return player;
    }

    private void validateLength(String number){
        if(number.length() != MIN_NUMBER_COUNT){
            throw new IllegalArgumentException("length Exception!!");
        }
    }

    private void validateNumber(String number){
        if(!number.matches("^[1-9]*$")){
            throw new IllegalArgumentException("format Exception!!");
        }
    }

    private void validateDuplication(String number) {
        Set<Character> validateNumber = extractCharactersToSet(number);
        if (validateNumber.size() != MIN_NUMBER_COUNT) {
            throw new IllegalArgumentException();
        }
    }

    private Set<Character> extractCharactersToSet(String number) {
        Set<Character> validatedNumber = new HashSet<>();
        for (int i = 0; i < MIN_NUMBER_COUNT; i++) {
            validatedNumber.add(number.charAt(i));
        }
        return validatedNumber;
    }
}
