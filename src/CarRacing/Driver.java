package CarRacing;

public abstract class Driver {

    private String name;
    private final boolean hasLicense;
    private final double experience;

    public Driver(String name, boolean hasLicense, Integer experience) {
        this.name = validateParameters(name);
        this.hasLicense = validateBoolean(hasLicense);
        this.experience = validateInteger(experience);
    }

    public static String validateParameters(String value) {
        return value == null || value.isEmpty() || value.isBlank() ? "Информация не указана" : value;
    }

    public Boolean validateBoolean(Boolean value) {
        return value == null ? false : value;
    }

    public double validateInteger(Integer value) {
        return value <= 0 ? 1 : value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            throw new RuntimeException();
        }
    }

    public boolean isHasLicense() {
        return hasLicense;
    }

    public double getExperience() {
        return experience;
    }

    abstract String start();

    abstract String stop();

    abstract String refuel();
}
