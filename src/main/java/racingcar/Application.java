package racingcar;

import java.util.List;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();

        List<Car> names = inputView.readCars()
                .stream()
                .map(Car::new)
                .toList();

        Cars cars = new Cars(names);
        Round round = new Round(inputView.readRound());

        outputView.showGameStart();
        while (round.play() >= 0) {
            cars.move();
            outputView.showRound(cars);
        }

        outputView.showWinners(cars.getMaxPosition());
    }
}
