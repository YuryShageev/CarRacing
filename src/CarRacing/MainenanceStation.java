package CarRacing;

import java.util.ArrayDeque;
import java.util.Queue;

public class MainenanceStation {

    private final Queue<Car> cars = new ArrayDeque<>();


    private void add(Car car) {

        cars.offer(car);
    }

    public void addAutomobile(Automobile automobile) {
        add(automobile);
    }

    public void addTruck(Truck truck) {
        add(truck);
    }

    public void service() {
        if (!cars.isEmpty()) {
            Car car = cars.poll();
            boolean result = car.service();
            if (!result) {
                car.repair();
            }
        }
    }

}
