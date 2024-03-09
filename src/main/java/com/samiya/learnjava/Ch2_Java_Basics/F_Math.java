package main.java.com.samiya.learnjava.Ch2_Java_Basics;

public class F_Math {
    public static void main(String[] args) {
        // Finding the highest value
        int maxVal = Math.max(5, 10);
        System.out.println("Max value between 5 and 10: " + maxVal);

        // Finding the lowest value
        int minVal = Math.min(5, 10);
        System.out.println("Min value between 5 and 10: " + minVal);

        // Finding the square root
        double sqrtVal = Math.sqrt(64);
        System.out.println("Square root of 64: " + sqrtVal);

        // Finding the absolute value
        double absVal = Math.abs(-4.7);
        System.out.println("Absolute value of -4.7: " + absVal);

        // Generating a random number between 0 and 100
        int randomNum = (int) (Math.random() * 101);  // 0 to 100
        System.out.println("Random number between 0 and 100: " + randomNum);
    }
}
