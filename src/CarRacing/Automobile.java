package CarRacing;

public class Automobile extends Car implements Competing {

//    public enum BodyType {
//        BD_SEDAN("Седан"),
//        BD_HATCH("Хечбек"),
//        BD_COUPE("Купе"),
//        BD_UNIVER("Универсал"),
//        BD_SUV("Внедорожник"),
//        BD_CROSS("Кроссовер"),
//        BD_PICK("Пикап"),
//        BD_VAN("Фургон"),
//        BD_MIN_VAN("Минивэн");
//
//        public static BodyType findByRusWord(String callBodyType) {
//            for (BodyType type : values()) {
//                if (type.getCallBodyType().equals(callBodyType)) {
//                    return type;
//                }
//            }
//            return null;
//        }
//
//
//        private final String callBodyType;
//
//        BodyType(String callBodyType) {
//            this.callBodyType = callBodyType;
//        }
//
//        public String getCallBodyType() {
//            return callBodyType;
//        }
//    }

    private BodyType bodyType;

    public Automobile(String brand, String model, float engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;

    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
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
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Тип кузова - " + bodyType);
        }
    }

    @Override
    public boolean service() {
        return Math.random() > 0.7;
    }

    @Override
    public void pitStopped() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " заезжает на пит-стоп для замены колеса.");
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " выезжает из пит-стопа после необходимого обслуживания.");
    }

    @Override
    public void getBestLapTime() {
        float anyNumber = 2.0f;
        System.out.printf("Лучшее время автомобиля %s, %s, составляет, %2.2f, минут, \n", getBrand(), getModel(), (1 + Math.random() * (anyNumber)));
    }

    @Override
    public void getMaxSpeed() {
        float anySpeed = 200.00f;
        System.out.printf("Максимальная скорость автомобиля %s, %s, составляет, %3.2f, км/ч, \n", getBrand(), getModel(), (100 + Math.random() * anySpeed));
    }



}
