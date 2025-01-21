package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;

public class InputView {

    public List<String> readCars() {
        String line = Console.readLine();
        if (line.matches("^(\\s(,))*\\s$")) {
            return List.of(line.split(","));
        }
        throw new IllegalArgumentException("[ERROR]: 자동차 입력 형식이 잘못되었습니다.");

    }

    public int readRound() {
        int round;
        try {
            round = Integer.parseInt(Console.readLine());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR]: 시도 횟수는 숫자여야합니다.");
        }
        return round;
    }

}
