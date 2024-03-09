package main.java.com.samiya.learnjava.Ch3_Control_Flow;

public class F_Array {
    public static void main(String[] args) {
        // Declare and initialize an array of strings
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        // Accessing elements of the array
        System.out.println("First element of the array: " + cars[0]);

        // Changing an array element
        cars[0] = "Opel";
        System.out.println("First element after change: " + cars[0]);

        // Getting the length of the array
        System.out.println("Length of the array: " + cars.length);

        // Looping through the array using a for loop
        System.out.println("Looping through the array using a for loop:");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        // Looping through the array using a for-each loop
        System.out.println("\nLooping through the array using a for-each loop:");
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
