package CarRacing;

public class Truck extends Car {

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
}
