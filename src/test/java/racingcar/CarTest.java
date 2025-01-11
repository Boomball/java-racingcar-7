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
    void 자동차의_이름은_5자_이하() {
        String name = "kangrae";
        assertThrows(IllegalArgumentException.class, () -> new Car(name));
    }

    @ParameterizedTest
    @ValueSource(strings = {" ", "\0", ""})
    void 자동차의_이름은_존재해야한다(String name) {
        assertThrows(IllegalArgumentException.class, () -> new Car(name));
    }

}