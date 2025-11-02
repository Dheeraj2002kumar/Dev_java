package DataType_ControlFlow_Operators;

public class Methods {
    public static void main(String[] args){
        sayHello("Dheeraj");

        System.out.println("Addition of 5 and 8 is: " + Add(5, 8));
    }

    private static void sayHello(String name){
        System.out.println("Hello, " + name + ". You are a developer.");
    }

    private static int Add(int a, int b){
        return  a + b;
    }
}
