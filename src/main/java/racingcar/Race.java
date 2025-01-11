package racingcar;

import java.util.List;

public class Race {

    private final Cars cars;

    public Race(List<String> names) {
        List<Car> cars = names.stream().map(Car::new).toList();
        this.cars = new Cars(cars);
    }

    public void playRound() {
        //int randomNumber = Randoms.pickNumberInRange(0, 9);

    }
}
