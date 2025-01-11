package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class Cars {

    List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }


    public void move() {
        cars.forEach(car -> car.move(Randoms.pickNumberInRange(0, 9)));
    }

    // 우승자 판별


}
