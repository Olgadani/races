import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Transport<H> {

        private String mark;
        private String model;
        private double volume;
        private List<Transport<?>> transports = new ArrayList<>();
        private List<Mechanics<?>> mechanics = new ArrayList<>();
        private List<Sponsor> sponsors = new ArrayList<>();
        public Transport(String mark, String model, double volume) {
            this.mark = checkDefault(mark, "default");
            this.model = checkDefault(mark, "default");
            this.volume = Math.max(volume, 1.5);
        }


    public String getMark() {
        return mark;
    }


    public String getModel() {
        return model;
    }

    public double getVolume() {
        return volume;
    }

    public abstract void startMoving();
    public abstract void finishMoving();

    public abstract void printType();

    public abstract boolean service();

    public static String checkDefault(String value, String error) {
        if (value == null || value.isBlank()) {
            return error;
        } else {
            return value;
        }
    }

    public void addMechanic(Mechanics<?>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }
    public void addSponsor(Sponsor... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }
    public void addTransport(Transport<?> transport) {
        transports.add(transport);
    }

    public List<Transport<?>> getTransports() {
        return transports;
    }

    public Mechanics<?> getMechanics() {
        return (Mechanics<?>) mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public abstract void fixCar();
}
