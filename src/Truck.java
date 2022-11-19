public class Truck extends Transport implements Competing{
    public Truck(String mark, String model, double volume) {
        super(mark, model, volume);
    }

    public enum Tonnage {
        N1(null,3.5f),
        N2(3.5f, 12f),
        N3(12f, null);
        private float tonnageFrom;
        private float tonnageTo;

        Tonnage(Float tonnageFrom, Float tonnageTo) {
            this.tonnageFrom = tonnageFrom;
            this.tonnageTo = tonnageTo;
        }

        public float getTonnageFrom() {
            return tonnageFrom;
        }

        public float getTonnageTo() {
            return tonnageTo;
        }

        @Override
        public String toString() {
            return "Грузоподъемность от " +
                    getTonnageFrom() +
                    ", до " + getTonnageTo();
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
        if (Tonnage.values() != null) {
            System.out.println(Tonnage.values());
        } else {
            System.out.println("Данных недостаточно");
        }
    }

    @Override
    public boolean service() {
        return Math.random() > 0.5;
    }

    @Override
    public void pitStop() {
        System.out.println("Pitstop: " + getClass() + " " + getMark() + " 15 minutes");
    }

    @Override
    public void bestTime() {
        System.out.println("Best time: " + getClass() + " " + getMark() + " 140 minutes");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Max speed: " + getClass() + " " + getMark() + " " + 100);
    }

    @Override
    public void fixCar() {
        System.out.println("Грузовик " + getModel() + " " + getMark() + "починен");
    }

}
