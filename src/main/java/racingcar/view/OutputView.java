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

    public void showGameStart() {
        System.out.println("실행 결과");
    }
}
