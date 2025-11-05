package ObjectOrientedProgramming.Encapsulation;

class Car {
    private String brand;
    private String color;
    private int speed;

    public Car(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
//        this.speed = speed;
        setSpeed(speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0)
            speed = 0;
        this.speed = speed;
    }

    public void drive(){
        System.out.println(brand + " is driving at " + speed);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Car car1 = new Car("Toyoto", "Red", 100);
        car1.setSpeed(-200);
        car1.drive();

        Car car2 = new Car("KIA", "White", -200);
        car2.drive();
    }
}
