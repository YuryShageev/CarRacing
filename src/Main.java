import CarRacing.*;
import CarRacing.Categories.CategoryB;
import CarRacing.Check.Data;
import CarRacing.Drivers.Driver;
import CarRacing.Drivers.DriverB;
import CarRacing.Drivers.DriverC;
import CarRacing.Drivers.DriverD;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        DriverB<Automobile> driverB = new DriverB<>("Ковбой", true, 7);
        Mechanic<Automobile> warren = new Mechanic<>("Ворен", "Баффет", "Toyo");
        Mechanic<Car> michael = new Mechanic<>("Микаель", "Шумахер", "Kama");
        Sponsor lukOil = new Sponsor("Лукойл", 2_000_000);
        Sponsor michelin = new Sponsor("Мишлен", 3_000_000);


        Automobile[] automobiles = {
                new Automobile("Шевроле", "Камаро", 3.8f, BodyType.BD_SEDAN),
                new Automobile("Космич", "Пирожок", 1.5f, BodyType.BD_HATCH),
                new Automobile("Жигули", "Девятка", 1.5f, BodyType.BD_HATCH),
                new Automobile("Жигули", "Шестёрка", 1.6f, BodyType.BD_SEDAN)
        };
        automobiles[0].addDriver(driverB);
        automobiles[0].addMechanic(warren);
        automobiles[0].addSponsor(lukOil, michelin);




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
        trucks[0].addDriver(driverC);
        trucks[0].addMechanic(michael);
        trucks[0].addSponsor(lukOil, michelin);


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

        buses[0].addDriver(driverD);
        buses[0].addMechanic(michael);
        buses[0].addSponsor(lukOil);

        for (Bus bus : buses) {
            System.out.println(bus);
            bus.startMovement();
            bus.pitStopped();
            bus.getBestLapTime();
            bus.getMaxSpeed();
            bus.finishMovement();
            System.out.println(driverD.getBusMessage(bus));
        }

//        separator();
//        printInfo(driverB, automobiles[1]);
//        printInfo(driverD, buses[3]);
//        printInfo(driverC, trucks[0]);


        boolean success = Data.validate("stop", "stop", "stop");
        if (success) {
            System.out.println("Данные валидны!");
        } else {
            System.out.println("Данные не валидны!");
        }

//        service(
//                automobiles[0], automobiles[1], automobiles[2], automobiles[3],
//                trucks[0], trucks[1], trucks[2], trucks[3],
//                buses[0], buses[1], buses[2], buses[3]
//        );
separator();
        List<Car> cars = List.of(
                automobiles[0],
                trucks[0],
                buses[0]);

        for (Car car : cars) {
            printInfoTransport(car);
        }


        MainenanceStation mainenanceStation = new MainenanceStation();
        mainenanceStation.addAutomobile(automobiles[1]);
        mainenanceStation.addAutomobile(automobiles[2]);
        mainenanceStation.addTruck(trucks[1]);
        mainenanceStation.service();
        mainenanceStation.service();
        mainenanceStation.service();
    }

    private static void printInfoTransport(Car car) {
        System.out.println("Данные по автомобилю " + car.getBrand() + " " + car.getModel());
        System.out.println("Водители:" + car.getDrivers());


        System.out.println("Спонсоры:" + car.getSponsors());

        System.out.println("Механики:" + car.getMechanics());
//        for (Mechanic<?> mechanic : car.getMechanics()) {
//            System.out.println(mechanic.getName() + " " + mechanic.getSurname() + " из " + mechanic.getCompany());
//        }
        System.out.println();
    }

    private static void service(Car... cars) {
        for (Car car : cars) {
            serviceCars(car);
        }
    }

    private static void serviceCars(Car car) {

        try {
            if (!car.service()) {
                throw new RuntimeException("Транспортное средство " + car.getBrand() + " " + car.getModel() + " не прошёл диагностику");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());

        }
    }


    private static void printInfo(Driver<?> driver, Car car) {
        System.out.println("Водитель " + driver.getName() + " управляет транспортным средством " + car.getBrand() +
                " " + car.getModel() + ", Будет участвовать в гонке");
        car.printType();
    }


    public static void separator() {
        System.out.println("================================================");
    }

}
