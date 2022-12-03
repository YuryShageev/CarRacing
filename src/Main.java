import CarRacing.*;

public class Main {

    public static void main(String[] args) {
        Automobile[] automobiles = {
                new Automobile("Шевроле", "Камаро", 3.8f, BodyType.BD_SEDAN),
                new Automobile("Космич", "Пирожок", 1.5f, BodyType.BD_HATCH),
                new Automobile("Жигули", "Девятка", 1.5f, BodyType.BD_HATCH),
                new Automobile("Жигули", "Шестёрка", 1.6f, BodyType.BD_SEDAN)
        };

        DriverB<Automobile> driverB = new DriverB<>("Ковбой", true, 7);

        for (int i = 0; i < automobiles.length; i++) {
            System.out.println(automobiles[i]);
            automobiles[i].startMovement();
            automobiles[i].pitStopped();
            automobiles[i].getBestLapTime();
            automobiles[i].getMaxSpeed();
            automobiles[i].finishMovement();
            System.out.println(driverB.getAutomobileMessage(automobiles[i]));

        }

        separator();

        Truck[] trucks = {
                new Truck("Зил", "Сто тридцать", 5.9f, Weight.N1),
                new Truck("Краз", "Двести пятьдесят пять", 14.8f, Weight.N3),
                new Truck("Зил", "Сто тридцать один", 6.5f, Weight.N1),
                new Truck("Маз", "Пятьсот тридцать семь", 12.6f, Weight.N2)
        };

        DriverC<Truck> driverC = new DriverC<>("Михалыч", true, 12);

        for (int i = 0; i < trucks.length; i++) {
            System.out.println(trucks[i]);
            trucks[i].startMovement();
            trucks[i].pitStopped();
            trucks[i].getBestLapTime();
            trucks[i].getMaxSpeed();
            trucks[i].finishMovement();
            System.out.println(driverC.getTruckMessage(trucks[i]));
        }

        separator();


        Bus[] buses = {
                new Bus("Паз", "672", 6.3f, Capacity.SMALL),
                new Bus("Маз", "746", 5.7f, Capacity.LARGE),
                new Bus("ЛиАЗ", "456", 7.1f, Capacity.MEDIUM),
                new Bus("Hyundai", "Dlya Russii", 4.3f, Capacity.EXTRA_SMALL)
        };

        DriverD<Bus> driverD = new DriverD<>("Петрович", true, 23);

        for (Bus bus : buses) {
            System.out.println(bus);
            bus.startMovement();
            bus.pitStopped();
            bus.getBestLapTime();
            bus.getMaxSpeed();
            bus.finishMovement();
            System.out.println(driverD.getBusMessage(bus));
        }

        printInfo(driverB, automobiles[1]);


    }

    private static void printInfo(Driver driver, Car car) {
        System.out.println("Водитель " + driver.getName() + " управляет транспортным средством " + car.getBrand() +
                " " + car.getModel() + ", Будет участвовать в гонке");
        car.printType();
    }

    public static void separator() {
        System.out.println("================================================");
    }

}
