package CarRacing;

public class DriverD <T extends Bus> extends Driver<T> {

    public DriverD(String name, boolean hasLicense, Integer experience) {
        super(name, hasLicense, experience);
    }

    @Override
    String start() {
        return null;
    }

    @Override
    String stop() {
        return null;
    }

    @Override
    String refuel() {
        return null;
    }

    public String getBusMessage(Bus bus) {
        return "Водитель " + getName() + " управляет автобусом " + bus.getBrand() + " " + bus.getModel() +
                " и будет участвовать в заезде";
    }
}
