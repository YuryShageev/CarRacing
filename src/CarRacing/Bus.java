package CarRacing;

public class Bus extends Car implements Competing {

    private Capacity capacity;
    public Bus(String brand, String model, float engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
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
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Вместимость - от " + capacity.getFrom() + " до " + capacity.getTo());
        }
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
