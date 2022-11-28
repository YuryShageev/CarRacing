package CarRacing;

public class DriverB<T extends Automobile> extends Driver {

    public DriverB(String name, Boolean hasLicense, Integer experience) {
        super(name, hasLicense, experience);
    }

    @Override
    String start() {
        return "Транспортное средство начало движение";
    }

    @Override
    String stop() {
        return "Транспортное средство закончило движение";
    }

    @Override
    String refuel() {
        return "Транспортное средство заправляется";
    }

    public String getAutomobileMessage(Automobile automobile) {
        return "Водитель " + getName() + " управляет автомобилем " + automobile.getBrand() + " " + automobile.getModel() +
                " и будет участвовать в заезде";
    }
}
