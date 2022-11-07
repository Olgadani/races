public class Car extends Transport implements Competing{
    public Car(String mark, String model, double volume) {
        super(mark, model, volume);
    }
    public enum BodyType {sedan, hatchback, coupe, stationWagon, offRoad, crossover, pickup, van}
    @Override
    public void startMoving() {

    }

    @Override
    public void finishMoving() {

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
