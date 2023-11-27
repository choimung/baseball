package baseball.controller;

import baseball.domain.Computer;
import baseball.domain.Judgment;
import baseball.domain.Player;
import baseball.domain.Referee;
import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.List;

public class BaseBallController {

    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();
    private final Computer computer = new Computer();
    private final Judgment judgment = new Judgment();
    private final Referee referee = new Referee();
    private Player player;


    public void run(){
        List<Integer> computerNumber = computer.generateComputerNumber();
        System.out.println(computerNumber);
        while (true){
            player = new Player(inputView.inputPlayerNumber());
            String hint = referee.compare(computerNumber, player.getNumbers());
            System.out.println(hint);
            if(referee.isWin(hint)){
                System.out.println("종료");
                return;
            }
        }
    }
}
