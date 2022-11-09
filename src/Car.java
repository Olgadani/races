public class Car extends Transport implements Competing{
    public Car(String mark, String model, double volume) {
        super(mark, model, volume);
    }
    public enum BodyType {
        SEDAN("Sedan"),
        HATCHBACK("Hatchback"),
        COUPE("Coupe"),
        STATIONWAGON("Stationwagon"),
        OFFROAD("Offroad"),
        CROSSOVER("Crossover"),
        PICKUP("Pickup"),
        VAN("Van");
        private String bodyType;

        BodyType(String bodyType) {
            this.bodyType = Transport.checkDefault(bodyType, "Данных недостаточно");
        }

        public String getBodyType() {
            return bodyType;
        }

        @Override
        public String toString() {
            return "Тип кузова " + this.bodyType;
        }
    }


    @Override
    public void startMoving() {
        System.out.println("Start moving");
    }

    @Override
    public void finishMoving() {
        System.out.println("Stop moving");
    }

    @Override
    public void printType() {
        if (BodyType.values() != null) {
            System.out.println(BodyType.values());
        } else {
            System.out.println("Данных недостаточно");
        }
    }


    @Override
    public void pitStop() {
        System.out.println("Pitstop: " + getClass() + " " + getMark() + " 5 minutes");
    }

    @Override
    public void bestTime() {
        System.out.println("Best time: " + getClass() + " " + getMark() + " 40 minutes");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Max speed: " + getClass() + " " + getMark() + " " + 200);
    }
}
