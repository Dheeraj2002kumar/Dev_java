/*
========================================
CONTROL FLOW IN JAVA
========================================

--> What is Control flow?
control flow means how your program executes statements
based on conditions or loops. Instead of running code line
by line blindly. You can tell java.

-> "Do this if something is true."
-> "Repeat this until a condition changes."
-> "Choose one path from many."

java gives us  three main types.
1. Decision-making --> if, else if, else, switch
2. Loops (Iteration)  --> for, while, do-while, enhanced for-each
3. Jump statements -> break, continue
 */



package DataType_ControlFlow_Operators;

public class ControlFlow {
    public static void main(String[] args){
        // if-else
        int age = 14;
        if (age > 18){
            System.out.println("Welcome to our bank");
        } else{
            System.out.println("Try again when you turn 18");
        }


        // if-else ladder
        int marks = 90;
        if (marks > 90){
            System.out.println("Grade A+");
        } else if (marks > 75){
            System.out.println("Grade A");
        } else if (marks > 60){
            System.out.println("Grade B");
        } else {
            System.out.println("Grade F");
        }


        // switch
        String day = "Monday";
        switch (day){
            case "Monday":
                System.out.println("Start the work day");
                break;
            case "Friday":
                System.out.println("Last day of the work day");
                break;
            default:
                System.out.println("Enjoy weekend...");
        }

        String weekday = "Friday";
        switch (weekday){
            case "Monday" -> System.out.println("Start the work day");
            case "Friday" -> System.out.println("Last day of the work day");
            default -> System.out.println("Enjoy weekend...");
        }

        // for loop
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Count: " + i);
//        }


        // while loop
        int num = 3;
        while(num > 0){
            System.out.println("Num: " + num);
            num--;
        }

        // Do While loop
        int n = 3;
        do {
            System.out.println("> n: " + n);
            n--;
        } while (n > 0);
    }
}
