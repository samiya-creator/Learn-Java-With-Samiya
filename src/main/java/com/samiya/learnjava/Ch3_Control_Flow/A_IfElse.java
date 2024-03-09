package main.java.com.samiya.learnjava.Ch3_Control_Flow;

public class A_IfElse {
    public static void main(String[] args) {
        // Example of if statement
        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }

        // Example of if...else statement
        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println("x is greater than y");
        } else {
            System.out.println("x is not greater than y");
        }

        // Example of if...else if...else statement
        int time = 22;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        // Example of ternary operator
        int time2 = 20;
        String result = (time2 < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        // Exercise: Short hand if...else statement
        int time3 = 20;
        String result2 = (time3 < 18) ? "Good day." : "Good evening.";
        System.out.println(result2);
    }
}
