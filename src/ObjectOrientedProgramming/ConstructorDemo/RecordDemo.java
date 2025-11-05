package ObjectOrientedProgramming.ConstructorDemo;

record Bike(String brand, int speed){}

public class RecordDemo {
    public static void main(String[] args) {
        Bike bike = new Bike("BMW", 200);
        System.out.println("Brand: " + bike.brand());
        System.out.println("Brand: " + bike.speed());
        System.out.println(bike);
    }
}
