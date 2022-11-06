public class Bus extends Transport implements Competing{
    public Bus(String mark, String model, double volume) {
        super(mark, model, volume);
    }

    @Override
    public void startMoving() {

    }

    @Override
    public void finishMoving() {

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

}
