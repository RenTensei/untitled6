package Factory;

public interface Sedan extends Auto{
    String carType = "Sedan";

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
