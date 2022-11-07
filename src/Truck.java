public class Truck extends Transport implements Competing{
    public Truck(String mark, String model, double volume) {
        super(mark, model, volume);
    }

    public enum tonnage {N1, N2, N3}
    @Override
    public void startMoving() {
        System.out.println("Start moving");
    }

    @Override
    public void finishMoving() {
        System.out.println("Stop moving");
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
}
