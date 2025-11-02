/*
=========================================================
VARIABLE NAMING RULES IN JAVA
=========================================================

==> Rules (concise Version):
-> Case-sensitive (age != Age)
-> Must begin  with a letter, '-' or '$' (but prefer letters)
-> Cannot start with a digit
-> No Spaces or special symbols (%, #, @, etc)
-> Cannot be a java keyword (e.g., int, class, for)
-> Can contain letter, digits, '_' or '$' after the first character
-> Use meaningfull  names (avoid x1, a2)
-> Use LowerCamelCase for normal variables (totalMarks
-> Use UPPER_CASE_WITH_UNDERSCORES for constants (MAX_SPEED)

---------------------------------------------------------------------
 */



package DataType_ControlFlow_Operators;

public class VariableName {
    public static void main(String[] args){
        // Valid variable names
        int age = 25;
        int studentCount = 100;
        int _score = 95;        // legal but not recommended
        int $total = 500;       // legal but not recommended
        int gearRatio = 6;
        final int MAX_SPEED = 120;  // constant naming convention

        // printing valid variables
        System.out.println("Age: " + age);
        System.out.println("Student Count: " + studentCount);
        System.out.println("Gear Ratio: " + gearRatio);
        System.out.println("Max Speed: " + MAX_SPEED);

        // INVALID variable name
//        int 2fast = 50;         // cannot start with a digit
//        int student-count = 40;  // hyphens not allowed
//        int total markes = 100;  // spaces not allowed
//        int for = 5;            // 'for' is a keyword
//        int @rate = 10;         // '@' not allowed
//        int class = 1;          // reserved keyword


        //  Example showing case-sensitivity
        int number = 10;
        int Number = 20;
        System.out.print("number = " + number);
        System.out.print("Number = " + Number);

    }
}
