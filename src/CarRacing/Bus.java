package CarRacing;

public class Bus extends Car implements Competing {

    public Bus(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    public Bus() {
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
        System.out.println("Автобус " + getBrand() + " " + getModel() + " заезжает на пит-стоп для замены лобового стекла.");
        System.out.println("Автобус " + getBrand() + " " + getModel() + " выезжает из пит-стопа после необходимого обслуживания.");
    }

    @Override
    public void getBestLapTime() {
        float anyNumber = 10.0f;
        System.out.printf("Лучшее время автобуса %s, %s, составляет, %2.2f, минут, \n", getBrand(), getModel(), (1+Math.random() * (anyNumber)));
    }

    @Override
    public void getMaxSpeed() {
        float anySpeed = 50.0f;
        System.out.printf("Максимальная скорость Автобуса %s, %s, составляет, %3.2f, км/ч, \n", getBrand(), getModel(), (100 + Math.random() * anySpeed));
    }
}
