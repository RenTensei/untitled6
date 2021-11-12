package Factory;

public interface Factory {
    default void carType1Producing (){
        System.out.println("Factory produces" + Sedan.carType);}
        default void carType2Producing (){
            System.out.println("Factory produces" + Offroad.carType);
    }
    Offroad type1 = new Offroad() {
        @Override
        public void drive() {
            Offroad.super.drive();
        }

        @Override
        public void brake() {
            Offroad.super.brake();
        }


        @Override
        public void turn(String direction) {
            Offroad.super.turn(direction);
        }
        Sedan type2 = new Sedan() {
            @Override
            public void drive() {
                Sedan.super.drive();
            }

            @Override
            public void brake() {
                Sedan.super.brake();
            }

            @Override
            public void turn(String direction) {
                Sedan.super.turn(direction);
            }
        };

    };



}
