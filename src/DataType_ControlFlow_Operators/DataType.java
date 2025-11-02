/*
=============================================
DATA TYPES IN JAVA
=============================================

==> What Are Data Types?
A data type defines what kind of data a variable con store.

Example:
    int age = 25;   --> age is an integer
    String name = "Faisal";  --> name is text

    Think of it as the "shape" or "category" of the data.
*/

/*
======================================================
Categories of Data Types in java
======================================================

1. Primitive Data Types (total 8)
----------------------------------------------
These are the most basic types, directly stored in memory

byte        8-bit           byte b=10;
short       16-bit          short s=200;
int         32-bit          int age = 25;
long        64-bit          long views = 1_000_000L;
float       32-bit (decimal)    float pi = 3.14f;
double     64-bit (decimal)     double price = 99.99;
char        16-bit  (unicode)   char grade = 'A';
boolean     1-bit (true/false)  boolean isActive = true;


2. Non-Primitive Data Type
----------------------------------------------------
Example: String, Arrays, Classes, Interfaces
These are created by the programmer or JAVA itself.

 */

package DataType_ControlFlow_Operators;

public class DataType {
    public static void main(String[] args){
        String name = "Developer";
        char a = 'A';
        boolean b = false;

        byte b1 = 127;

        float pi = 2.149487298729879f;
        double price = 99.9947629872695849287;
        System.out.println(pi);
        System.out.println(price);

        char unicodeDome = '\u20AC';
        System.out.println(unicodeDome);  // €

        // Arrays
        float[] marks = {1, 2, 3, 4, 5};
        System.out.println(marks[0]);
        System.out.println(marks[4]);

    }
}
