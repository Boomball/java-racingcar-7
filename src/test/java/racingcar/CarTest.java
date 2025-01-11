package racingcar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CarTest {

    @Test
    void 자동차는_이름을_가진다() {
        String name = "Kng";
        Car car = new Car(name);

        assertEquals(car.toString(), name);
    }

    @Test
    void 자동차의_이름은_5자_초과면_예외를_던진다() {
        String name = "kangrae";
        assertThrows(IllegalArgumentException.class, () -> new Car(name));
    }

    @ParameterizedTest
    @ValueSource(strings = {" ", "\0", ""})
    void 자동차의_이름이_없는_경우_예외를_던진다(String name) {
        assertThrows(IllegalArgumentException.class, () -> new Car(name));
    }

    @Test
    void 자동차는_4이상의_수를_받을_때_전진한다() {
        int randomNumber = 4;
        Car car = new Car("test");
        assertEquals(car.move(randomNumber), 1);
    }
}