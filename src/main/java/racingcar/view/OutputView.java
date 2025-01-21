package racingcar.view;

import racingcar.Cars;

public class OutputView {

    public void showRound(Cars cars) {
        cars.getState().forEach(System.out::println);
        System.out.println();
    }

    public void showWinners(Cars winners) {
        System.out.println("최종 우승자 : " + winners.toString());
    }

    public void showCarsNameCommand() {
        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)");
    }

    public void showRoundCommand() {
        System.out.println("시도할 횟수는 몇 회인가요?");
    }

    public void showGameStart() {
        System.out.println("실행 결과");
    }
}
