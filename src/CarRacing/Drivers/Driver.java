package CarRacing.Drivers;

import CarRacing.Car;
import CarRacing.Categories.Category;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public abstract class Driver<T extends Car> extends Category {

    private String name;
    private final boolean hasLicense;
    private final double experience;
    private final Set<Driver> drivers = new HashSet<>();

    private T t;

    public Driver(String name, boolean hasLicense, Integer experience) {
        this.name = validateParameters(name);
        this.hasLicense = validateBoolean(hasLicense);
        this.experience = validateInteger(experience);
    }

    public void addDrivers(Driver driver) {
        this.drivers.addAll(Arrays.asList(driver));
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
            throw new RuntimeException("Имя водителя должно быть указано");
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

    @Override
    public String toString() {
        return name + ", стаж вождения " + experience + " лет, нужная категория " + t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        Driver<?> driver = (Driver<?>) o;
        return name.equals(driver.name) && drivers.equals(driver.drivers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, drivers);
    }
}
