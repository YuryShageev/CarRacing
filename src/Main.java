import CarRacing.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Automobile[] automobiles = {
                new Automobile("Шевроле", "Камаро", 3.8f),
                new Automobile("Космич", "Пирожок", 1.5f),
                new Automobile("Жигули", "Девятка", 1.5f),
                new Automobile("Жигули", "Шестёрка", 1.6f)
        };

        DriverB driverB = new DriverB<>("Ковбой", true, 7);
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
                new Truck("Зил", "Сто тридцать", 5.9f),
                new Truck("Краз", "Двести пятьдесят пять", 14.8f),
                new Truck("Зил", "Сто тридцать один", 6.5f),
                new Truck("Маз", "Пятьсот тридцать семь", 12.6f)
        };
        for (int i = 0; i < trucks.length; i++) {
            System.out.println(trucks[i]);
            trucks[i].startMovement();
            trucks[i].pitStopped();
            trucks[i].getBestLapTime();
            trucks[i].getMaxSpeed();
            trucks[i].finishMovement();
        }

        separator();


        Bus[] buses = {
                new Bus("Паз", "672", 6.3f),
                new Bus("Маз", "746", 5.7f),
                new Bus("ЛиАЗ", "456", 7.1f),
                new Bus("Hyundai", "Dlya Russii", 4.3f)
        };

        for (Bus bus : buses) {
            System.out.println(bus);
            bus.startMovement();
            bus.pitStopped();
            bus.getBestLapTime();
            bus.getMaxSpeed();
            bus.finishMovement();
        }
    }

    public static void separator() {
        System.out.println("================================================");
    }

}
