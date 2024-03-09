package main.java.com.samiya.learnjava.Ch2_Java_Basics;

public class C_Casting {
    public static void main(String[] args) {
        // Widening Casting (automatically)
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println("Widening Casting:");
        System.out.println("Integer value: " + myInt);
        System.out.println("Double value: " + myDouble);

        // Narrowing Casting (manually)
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2; // Manual casting: double to int

        System.out.println("\nNarrowing Casting:");
        System.out.println("Double value: " + myDouble2);
        System.out.println("Integer value: " + myInt2);
    }
}
