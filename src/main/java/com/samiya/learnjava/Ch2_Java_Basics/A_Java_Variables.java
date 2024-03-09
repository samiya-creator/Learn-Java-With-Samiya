package main.java.com.samiya.learnjava.Ch2_Java_Basics;

public class A_Java_Variables {
    public static void main(String[] args){
        /*
        String - stores text, such as "Hello". String values are surrounded by double quotes
        int - stores integers (whole numbers), without decimals, such as 123 or -123
        float - stores floating point numbers, with decimals, such as 19.99 or -19.99
        char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
        boolean - stores values with two states: true or false

        Syntax:
        type variableName = value;
        */

        String name = "John";
        System.out.println(name);

        int myNum = 15;
        System.out.println(myNum);

        // declare a variable without assigning the value, and assign the value later
        int myNum1;
        myNum1 = 15;
        System.out.println(myNum1);

        // overwrite previous value
        int myNum2 = 15;
        myNum2 = 20;  // myNum is now 20
        System.out.println(myNum2);

        //  final variables are unchangeable and read-only
        final int num5 = 15;

        // other types
        int myNum4 = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        // display variables
        String name2 = "John";
        System.out.println("Hello " + name2);

        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        int x1 = 5;
        int y1 = 6;
        System.out.println(x1 + y1);

        int x2 = 5;
        int y2 = 6;
        int z2 = 50;
        System.out.println(x2 + y2 + z2);

        int x3 = 5, y3 = 6, z3 = 50;
        System.out.println(x3 + y3 + z3);

        int x4, y4, z4;
        x4 = y4 = z4 = 50;
        System.out.println(x4 + y4 + z4);
    }
}
