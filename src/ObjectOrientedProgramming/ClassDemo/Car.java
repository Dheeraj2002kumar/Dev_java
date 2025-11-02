package ObjectOrientedProgramming.ClassDemo;

public class Car {
    String brand;
    String color;
    int speed;

    public void drive(){
        System.out.println(brand + " is driving at " + speed);
    }
}

// we can create more than one classes in single java file but we have to write only "class <class_name>" and then it will work, don't write public before class name
class abc{
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.speed = 100;
        car1.brand = "Toyota";
        car1.color = "Red";
        car1.drive();

        Car car2 = new Car();
        car2.speed = 200;
        car2.brand = "Tata";
        car2.color = "White";
        car2.drive();
    }
}