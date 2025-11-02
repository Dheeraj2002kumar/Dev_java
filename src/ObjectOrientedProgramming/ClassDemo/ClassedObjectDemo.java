package ObjectOrientedProgramming.ClassDemo;

public class ClassedObjectDemo {
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
