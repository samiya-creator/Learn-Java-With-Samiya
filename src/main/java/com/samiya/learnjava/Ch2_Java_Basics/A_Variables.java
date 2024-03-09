package main.java.com.samiya.learnjava.Ch2_Java_Basics;

public class A_Variables {
    public static void main(String[] args) {
        // Variables in Java store different types of data:
        // - String: Text surrounded by double quotes
        // - int: Integers (whole numbers) without decimals
        // - float: Floating point numbers with decimals
        // - char: Single characters surrounded by single quotes
        // - boolean: Values with two states: true or false

        // Declare and initialize variables
        String name = "John";
        System.out.println("Name: " + name);

        int myNum = 15;
        System.out.println("myNum: " + myNum);

        // Declare a variable without assigning the value, and assign the value later
        int myNum1;
        myNum1 = 15;
        System.out.println("myNum1: " + myNum1);

        // Overwrite previous value
        int myNum2 = 15;
        myNum2 = 20;  // myNum is now 20
        System.out.println("myNum2: " + myNum2);

        // Declare final variables, which are unchangeable and read-only
        final int NUM5 = 15;

        // Other variable types
        int myNum4 = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        // Display variables
        String name2 = "John";
        System.out.println("Hello " + name2);

        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println("Full Name: " + fullName);

        int x1 = 5;
        int y1 = 6;
        System.out.println("Sum of x1 and y1: " + (x1 + y1));

        int x2 = 5;
        int y2 = 6;
        int z2 = 50;
        System.out.println("Sum of x2, y2, and z2: " + (x2 + y2 + z2));

        int x3 = 5, y3 = 6, z3 = 50;
        System.out.println("Sum of x3, y3, and z3: " + (x3 + y3 + z3));

        int x4, y4, z4;
        x4 = y4 = z4 = 50;
        System.out.println("Sum of x4, y4, and z4: " + (x4 + y4 + z4));
    }
}

