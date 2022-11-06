public class DriverD extends Driver <Bus>{
    public DriverD(String name, String license, int experience) {
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
        System.out.println("Водитель " + getName() + " управляет автомобилем " + Bus.class + " и будет участвовать в заезде");
    }
}
