package racingcar;

public class Round {

    private static final int MAX_ROUND = 100_000;
    private static final int MIN_ROUND = 0;

    private int round;

    public Round(int round) {
        validate(round);
        this.round = round;
    }

    public int play() {
        return --round;
    }

    private void validate(int round) {
        if (round <= MIN_ROUND) {
            throw new IllegalArgumentException("라운드는 0보다 작을 수 없습니다.");
        }
        if (round > MAX_ROUND) {
            throw new IllegalArgumentException("라운드는 MAX_VALUE보다 클 수 없습니다.");
        }
    }

}
