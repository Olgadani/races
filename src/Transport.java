public abstract class Transport {

        private String mark;
        private String model;
        private double volume;

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

    public static String checkDefault(String value, String error) {
        if (value == null || value.isBlank()) {
            return error;
        } else {
            return value;
        }
    }
    }
