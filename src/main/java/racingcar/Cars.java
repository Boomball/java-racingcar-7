package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private final List<Car> cars;

    public Cars(List<Car> cars) {
        validate(cars);
        this.cars = cars;
    }

    public void move() {
        cars.forEach(car -> car.move(Randoms.pickNumberInRange(0, 9)));
    }

    public Cars getMaxPosition() {
        int maxPosition = cars.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElseThrow(() -> new IllegalArgumentException("자동차가 존재하지 않습니다."));

        return new Cars(cars.stream()
                .filter(car -> car.getPosition() == maxPosition)
                .toList());
    }

    public List<String> getState() {
        List<String> state = new ArrayList<>();
        cars.forEach(car -> state.add(car.toString() + " : " + "-".repeat(car.getPosition())));
        return state;
    }

    @Override
    public String toString() {
        String regex = "\\[|\\]";
        return cars.toString().replaceAll(regex, "");
    }

    private static void validate(List<Car> cars) {
        int size = cars.stream()
                .map(Car::toString)
                .collect(Collectors.toSet())
                .size();
        if (cars.size() != size) {
            throw new IllegalArgumentException("[ERROR]: 자동차 명은 중복될 수 없습니다.");
        }
    }
}
