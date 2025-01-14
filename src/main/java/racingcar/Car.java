package racingcar;

public class Car {

    private final String name;
    private int position;

    public Car(String name) {
        validate(name);
        this.name = name;
        this.position = 0;
    }

    public int move(int condition) {
        if (condition >= 4) {
            return ++position;
        }
        return position;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return name;
    }

    private void validate(String name) {
        if (name.trim().isBlank()) {
            throw new IllegalArgumentException("자동차의 이름은 존재해야합니다.");
        }
        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차의 이름은 5자 이하여야 합니다.");
        }
    }
}
