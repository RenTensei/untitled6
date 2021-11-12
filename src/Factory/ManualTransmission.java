package Factory;

public interface ManualTransmission {
    int gears = 9;
    default void transmissionManualChange(String desiredGear){
        System.out.println("User changed gear to" + desiredGear);
    }

    default void passengerToShift(String passengerDesiredGear){
        System.out.println("Passenger changed gear to" + passengerDesiredGear);
    }

}
