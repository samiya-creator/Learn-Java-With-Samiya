package main.java.com.samiya.learnjava.Ch3_Control_Flow;

public class D_ForLoop {
    public static void main(String[] args) {
        // Example of for loop printing numbers from 0 to 4
        System.out.println("For Loop Example:");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // Example of for loop printing even numbers from 0 to 10
        System.out.println("\nEven Numbers Example:");
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }

        // Example of nested for loop
        System.out.println("\nNested Loop Example:");
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i);
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j);
            }
        }

        int rows = 5;

        // Right-angled Triangle
        System.out.println("Right-angled Triangle:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Inverted Right-angled Triangle
        System.out.println("\nInverted Right-angled Triangle:");
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Equilateral Triangle
        System.out.println("\nEquilateral Triangle:");
        for (int i = 0; i < rows; i++) {
            for (int j = rows - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        // Print each car using a for-each loop
        System.out.println("Cars:");
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
