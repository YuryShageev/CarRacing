package CarRacing;

public class DriverC <T extends Truck> extends Driver{

    public DriverC(String name, boolean hasLicense, Integer experience) {
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

    public String getTruckMessage(Truck truck) {
        return "Водитель " + getName() + " управляет грузовым автомобилем " + truck.getBrand() + " " + truck.getModel() +
                " и будет участвовать в заезде";
    }
}
