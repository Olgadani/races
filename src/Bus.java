public class Bus extends Transport implements Competing{
    public Bus(String mark, String model, double volume) {
        super(mark, model, volume);
    }
    public enum capacity {
        EXTRASMALL(0,10),
        SMALL(0,25),
        MIDDLE(40,50),
        GREAT(60,80),
        EXTRAGREAT(100,120);
        private final int capacityFrom;
        private final int capacityTo;

        capacity(int capacityFrom, int capacityTo) {
            this.capacityFrom = capacityFrom;
            this.capacityTo = capacityTo;
        }

        public int getCapacityFrom() {
            return capacityFrom;
        }

        public int getCapacityTo() {
            return capacityTo;
        }

        @Override
        public String toString() {
            return "Вместимость от" + capacityFrom + ", до " + capacityTo;
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
        if (capacity.values() != null) {
            System.out.println(capacity.values());
        } else {
            System.out.println("Данных недостаточно");
        }
    }

    @Override
    public boolean service() {
        System.out.println("Автобус " + getMark() + " " + getModel() + " в диагностике не нуждается");
        return true;
    }

    @Override
    public void pitStop() {
        System.out.println("Pitstop: " + getClass() + " " + getMark() + " 25 minutes");
    }

    @Override
    public void bestTime() {
        System.out.println("Best time: " + getClass() + " " + getMark() + " 200 minutes");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Max speed: " + getClass() + " " + getMark() + " " + 90);
    }
    @Override
    public void fixCar() {
        System.out.println("Автобус " + getModel() + " " + getMark() + "починен");
    }
}
