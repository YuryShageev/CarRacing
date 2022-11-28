package CarRacing;

public class Truck extends Car implements Competing{

    public Truck(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    public Truck() {
    }

    @Override
    public void startMovement() {
        System.out.println("Начать движение!");
    }

    @Override
    public void finishMovement() {
        System.out.println("Закончить движение!");
    }

    @Override
    public void pitStopped() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " заезжает на пит-стоп для замены масла.");
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " выезжает из пит-стопа после необходимого обслуживания.");
    }

    @Override
    public void getBestLapTime() {
        float anyNumber = 6.0f;
        System.out.printf("Лучшее время грузовика %s, %s, составляет, %2.2f, минут, \n", getBrand(), getModel(), (1+Math.random() * (anyNumber)));
    }

    @Override
    public void getMaxSpeed() {
        float anySpeed = 80.00f;
        System.out.printf("Максимальная скорость грузовика %s, %s, составляет, %3.2f, км/ч, \n", getBrand(), getModel(), (100 + Math.random() * anySpeed));
    }
}
