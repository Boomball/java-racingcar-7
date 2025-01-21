package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;

public class InputView {

    public List<String> readCars() {
        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)");
        String line = Console.readLine();
        if (line.matches("^([a-zA-Z가-힣]*(,))*[a-zA-Z가-힣]+$")) {
            return List.of(line.split(","));
        }
        throw new IllegalArgumentException("[ERROR]: 자동차 입력 형식이 잘못되었습니다.");

    }

    public int readRound() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        int round;
        try {
            round = Integer.parseInt(Console.readLine());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR]: 시도 횟수는 숫자여야합니다.");
        }
        return round;
    }

}
