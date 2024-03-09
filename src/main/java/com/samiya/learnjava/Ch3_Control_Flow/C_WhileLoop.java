package main.java.com.samiya.learnjava.Ch3_Control_Flow;

public class C_WhileLoop {
    public static void main(String[] args) {
        // Example of while loop
        int i = 0;
        System.out.println("While Loop:");
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // Example of do-while loop
        System.out.println("\nDo-While Loop:");
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 5);
    }
}
