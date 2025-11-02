package DataType_ControlFlow_Operators;

public class Operators {
    public static void main(String[] args){
//        System.out.println(10 + (20 * 2));

        ArithmeticOperation();
        UnaryOperator();
        AssignmentOperator();
        ComparisonOperator();
        LogicalOperator();


    }

    private static void ArithmeticOperation() {
        System.out.println("\n ----------- Arithmetic Operators ----------");

        int a = 10, b = 3;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b)); // 3
        System.out.println("a % b = " + (a % b));  // 1
    }

    private static void UnaryOperator(){
        System.out.println("\n---------- Unary Operators ----------");
        int x = 5;

        System.out.println("++x = " + (++x));  // 6
        System.out.println("x++ = " + (x++));  // 6, then become
        System.out.println("X after post-increment = " + x); // 7
        System.out.println("-x = " + (-x)); // -7
        System.out.println("!(x > 0) = " + (!(x > 0))); // false
    }

    private static void AssignmentOperator(){
        System.out.println("\n ---- Assignment Operators ----- ");

        int y = 10;
        y += 5;  // y = y + 5;
        y *= 2;  // y = y * 2;
        System.out.println("y after += and *= : " + y);
    }

    private static void ComparisonOperator(){
        System.out.println("\n -------- Comparison Operators ------------");
        int age = 30;
        System.out.println("age >= 18: " + (age >= 18));
        System.out.println("age >= 18: " + (age != 30));
    }

    private static void LogicalOperator(){
        System.out.println("\n------ Logical Operator -------");

        boolean hasProject = true;
        boolean isHuman = true;
        int age = 23;

        if (hasProject && isHuman){
            System.out.println("Welcome to Dev Environment...");
        } else{
            System.out.println("Sorry you can't come in dev Environment...");
        }

        if ((age > 20) || hasProject){
            System.out.println("Welcome to engineering team..");
        } else{
            System.out.println("Wait to complete your age 20...");
        }

        // Ternary => (condition) : (TRUE) ? (FALSE)
        System.out.println((isHuman || hasProject) ? "Welcome to the team.." : "Sorry, You can't come...");

    }
}
