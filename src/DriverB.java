public class DriverB extends Driver <Car>{


    public DriverB(String name, String license, int experience, Car car) {
        super(name, license, experience, car);
    }

    @Override
    public void startMoving() {
        System.out.println("Start moving");
    }

    @Override
    public void stop() {
        System.out.println("Stop moving");
    }

    @Override
    public void refillAuto() {
        System.out.println("Let's refill");
    }

    public void printing() {
        System.out.println("Водитель " + getName() + " управляет автомобилем " + Car.class + " и будет участвовать в заезде");
    }
}
