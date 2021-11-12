package Factory;

public interface Offroad extends Auto {
    String carType = "Offroad";

    @Override
    default void drive() {
        Auto.super.drive();
    }

    @Override
    default void brake() {
        Auto.super.brake();
    }

    @Override
    default void turn(String direction) {
        Auto.super.turn(direction);
    }
}
