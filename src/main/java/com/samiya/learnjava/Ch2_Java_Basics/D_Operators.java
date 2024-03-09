package main.java.com.samiya.learnjava.Ch2_Java_Basics;

public class D_Operators {
    public static void main(String[] args) {
        // Arithmetic operators
        int x = 100 + 50;       // Addition
        int y = x - 25;          // Subtraction
        int z = y * 2;           // Multiplication
        int w = z / 4;           // Division
        int remainder = z % 3;   // Modulus
        x++;                     // Increment
        y--;                     // Decrement

        System.out.println("Arithmetic Operators:");
        System.out.println("x + y = " + x);
        System.out.println("y - 25 = " + y);
        System.out.println("y * 2 = " + z);
        System.out.println("z / 4 = " + w);
        System.out.println("z % 3 = " + remainder);
        System.out.println("x++ = " + x);
        System.out.println("y-- = " + y);

        // Assignment operators
        int a = 10;
        a += 5;   // Equivalent to a = a + 5
        int b = 20;
        b -= 5;   // Equivalent to b = b - 5

        System.out.println("\nAssignment Operators:");
        System.out.println("a += 5: " + a);
        System.out.println("b -= 5: " + b);

        // Comparison operators
        int p = 5, q = 3;

        System.out.println("\nComparison Operators:");
        System.out.println("p == q: " + (p == q));  // Equal to
        System.out.println("p != q: " + (p != q));  // Not equal to
        System.out.println("p > q: " + (p > q));    // Greater than
        System.out.println("p < q: " + (p < q));    // Less than
        System.out.println("p >= q: " + (p >= q));  // Greater than or equal to
        System.out.println("p <= q: " + (p <= q));  // Less than or equal to

        // Logical operators
        boolean condition1 = true, condition2 = false;

        System.out.println("\nLogical Operators:");
        System.out.println("condition1 && condition2: " + (condition1 && condition2));  // Logical AND
        System.out.println("condition1 || condition2: " + (condition1 || condition2));  // Logical OR
        System.out.println("!condition1: " + !condition1);                              // Logical NOT
    }
}
