package racingcar;

public class Car {

    private final String name;

    public Car(String name) {
        validate(name);
        this.name = name;
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
