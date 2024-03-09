package main.java.com.samiya.learnjava.Ch2_Java_Basics;

public class B_DataTypes {
    public static void main(String[] args) {
        // Data types in Java are divided into two groups:
        // 1. Primitive data types - include byte, short, int, long, float, double, boolean, and char
        // 2. Non-primitive data types - such as String, Arrays, and Classes

        // Integer (whole number)
        int myNum = 5;

        // Floating point number
        float myFloatNum = 5.99f;

        // Character
        char myLetter = 'D';

        // Boolean
        boolean isJavaFun = true;
        boolean isFishTasty = false;

        // String
        String myText = "Hello";

        // Long
        long myLongNum = 15000000000L;

        // Float
        float myFloatNum2 = 5.75f;

        // Double
        double myDoubleNum = 19.99;

        // Printing character variables
        System.out.println("myLetter: " + myLetter);

        // Printing multiple characters using ASCII values
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println("myVar1: " + myVar1);
        System.out.println("myVar2: " + myVar2);
        System.out.println("myVar3: " + myVar3);

        // Printing a string variable
        System.out.println("myText: " + myText);
    }
}

