package CarRacing;

public class Bus extends Car {

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
}
