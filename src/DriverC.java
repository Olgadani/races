public class DriverC extends Driver <Truck>{
    public DriverC(String name, String license, int experience) {
        super(name, license, experience);
    }

    @Override
    public void startMoving() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void refillAuto() {

    }
    public void printing() {
        System.out.println("Водитель " + getName() + " управляет автомобилем " + Truck.class + " и будет участвовать в заезде");
    }
}
