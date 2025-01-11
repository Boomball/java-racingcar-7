package racingcar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import org.junit.jupiter.api.Test;

class RaceTest {

    @Test
    void 라운드가_진행되면_시도_횟수가_줄어든다() {
        Race race = new Race(List.of("kng", "gyun", "pobi"), 5);
        assertEquals(4, race.playRound());
    }

    @Test
    void 라운드가_음수면_예외를_던진다() {
        assertThrows(IllegalArgumentException.class,
                () -> new Race(List.of("kng", "gyun", "pobi"), -1));
    }

    @Test
    void 라운드의_최대치_이상히면_예외를_던진다() {
        assertThrows(IllegalArgumentException.class,
                () -> new Race(List.of("kng", "gyun", "pobi"), Integer.MAX_VALUE));
    }
}