package CarRacing;

public class Automobile extends Car{

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

}
