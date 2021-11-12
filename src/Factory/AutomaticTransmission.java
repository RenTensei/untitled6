package Factory;

public interface AutomaticTransmission {

    default void transmissionAutoShift(String demandedGear){
        System.out.println("Gear was automatically changed to" + demandedGear);
    };


}
