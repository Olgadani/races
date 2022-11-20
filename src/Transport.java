import java.util.*;

public abstract class Transport<H> {

        private String mark;
        private String model;
        private double volume;
        private Set<Transport<?>> transports = new HashSet<>();
        private Set<Mechanics<?>> mechanics = new HashSet<>();
        private Set<Sponsor> sponsors = new HashSet<>();
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

    public Set<Transport<?>> getTransports() {
        return transports;
    }

    public Mechanics<?> getMechanics() {
        return (Mechanics<?>) mechanics;
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport<?> transport = (Transport<?>) o;
        return Double.compare(transport.volume, volume) == 0 && Objects.equals(mark, transport.mark) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark, model, volume);
    }

    public abstract void fixCar();
}
