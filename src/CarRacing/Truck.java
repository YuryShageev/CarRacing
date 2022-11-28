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

        float anyNumber = 8.0f;
        System.out.println("Лучшее время автомобиля " + getBrand() + " " + getModel() + " составляет " + (1+Math.random() * (anyNumber)) + " минут");
    }

    @Override
    public void getMaxSpeed() {
        float anySpeed = 80.0f;
        System.out.println("Максимальная скорость автомобиля " + getBrand() + " " + getModel() + " составляет " + (100 + Math.random() * anySpeed) + " км/ч");
    }
}
