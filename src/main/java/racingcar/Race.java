package racingcar;

import java.util.List;

public class Race {

    private final Cars cars;
    private int round;

    public Race(List<String> names, int round) {
        validate(round);

        List<Car> cars = names.stream().map(Car::new).toList();
        this.cars = new Cars(cars);
        this.round = round;
    }

    public int playRound() {
        cars.move();
        return --round;
    }

    private void validate(int round) {
        if (round <= 0) {
            throw new IllegalArgumentException("라운드는 0보다 작을 수 없습니다.");
        }
        if (round == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("라운드는 MAX_VALUE보다 클 수 없습니다.");
        }
    }
}
