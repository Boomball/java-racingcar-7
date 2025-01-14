package racingcar;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class CarsTest {

    private static final int MOVING_FORWARD = 4;
    private static final int STOP = 3;

    @Test
    void 올바른_우승자를_구한다() {
        Cars cars = new Cars(List.of(new Car("kang"), new Car("gyun"), new Car("pobi")));

        assertRandomNumberInRangeTest(
                () -> {
                    cars.move();
                    Cars winners = cars.getMaxPosition();
                    assertThat(winners.toString()).isEqualTo("kang");
                },
                MOVING_FORWARD, STOP, STOP
        );
    }

    @Test
    void 라운드별_결과_출력() {
        Cars cars = new Cars(List.of(new Car("kang"), new Car("gyun"), new Car("pobi")));

        assertRandomNumberInRangeTest(
                () -> {
                    cars.move();
                    assertThat(cars.getState()).contains("kang : -", "gyun : ", "pobi : ");
                },
                MOVING_FORWARD, STOP, STOP
        );
    }

}
