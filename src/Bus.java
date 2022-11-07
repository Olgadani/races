public class Bus extends Transport implements Competing{
    public Bus(String mark, String model, double volume) {
        super(mark, model, volume);
    }
    public enum capacity {extraSmall, small, middle, great, extraGreat}
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
