public abstract class Driver<C extends Transport> {
    private final String name;
    private String license;
    private int experience;

    public Driver(String name, String license, int experience) {
        this.name = Transport.checkDefault(name, "No infomation");
        setLicense(license);
        setExperience(experience);
    }

    public String getName() {
        return name;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license =  Transport.checkDefault(license, "No infomation");
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = Math.max(experience, 1);
    }
    public abstract void startMoving();

    public abstract void stop();

    public abstract void refillAuto();

}
