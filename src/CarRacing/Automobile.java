package CarRacing;

public class Automobile extends Car implements Competing{


    public Automobile(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);

    }

    public Automobile() {
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
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " заезжает на пит-стоп для замены колеса.");
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " выезжает из пит-стопа после необходимого обслуживания.");
    }

    @Override
    public void getBestLapTime() {
        float anyNumber = 2.0f;
        System.out.println("Лучшее время автомобиля " + getBrand() + " " + getModel() + " составляет " + (1+Math.random() * (anyNumber)) + " минут");
    }

    @Override
    public void getMaxSpeed() {
        float anySpeed = 200.00f;
        System.out.println("Максимальная скорость автомобиля " + getBrand() + " " + getModel() + " составляет " + (100 + Math.random() * anySpeed) + " км/ч");
    }
}
