package main.java.com.samiya.learnjava.Ch2_Java_Basics;

public class G_Boolean {
    public static void main(String[] args) {
        // Declaring boolean variables
        boolean isJavaFun = true;
        boolean isFishTasty = false;

        // Printing boolean values
        System.out.println("Is Java fun? " + isJavaFun);    // Outputs true
        System.out.println("Is fish tasty? " + isFishTasty); // Outputs false

        // Boolean expressions
        int x = 10;
        int y = 9;
        System.out.println("Is x greater than y? " + (x > y)); // Outputs true

        // Using comparison operators with boolean expressions
        System.out.println("Is 10 equal to 10? " + (10 == 10));  // Outputs true
        System.out.println("Is 10 equal to 15? " + (10 == 15));  // Outputs false

        // Real-life example: Checking if a person is old enough to vote
        int myAge = 25;
        int votingAge = 18;
        System.out.println("Am I old enough to vote? " + (myAge >= votingAge));

        // Using if...else statement
        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }
    }
}
