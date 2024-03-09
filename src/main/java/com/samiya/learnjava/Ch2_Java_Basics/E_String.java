package main.java.com.samiya.learnjava.Ch2_Java_Basics;

public class E_String {
    public static void main(String[] args) {
        // Creating a string
        String greeting = "Hello";

        // String length
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        // String methods
        String txt2 = "Hello World";
        System.out.println(txt2.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt2.toLowerCase());   // Outputs "hello world"

        // Finding a character in a string
        String txt3 = "Please locate where 'locate' occurs!";
        System.out.println(txt3.indexOf("locate")); // Outputs 7

        // String concatenation
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName); // Concatenates firstName and lastName

        // Using concat() method
        String firstName2 = "John ";
        String lastName2 = "Doe";
        System.out.println(firstName2.concat(lastName2)); // Concatenates firstName2 and lastName2

        // Adding numbers and strings
        int x = 10;
        int y = 20;
        int z = x + y;  // z will be 30 (an integer/number)
        System.out.println("Sum of x and y: " + z);

        String a = "10";
        String b = "20";
        String c = a + b;  // c will be 1020 (a String)
        System.out.println("Concatenation of a and b: " + c);

        String d = "10";
        int e = 20;
        String f = d + e;  // f will be 1020 (a String)
        System.out.println("Concatenation of d and e: " + f);

        // Special characters in strings
        String txt4 = "We are the so-called \"Vikings\" from the north.";
        String txt5 = "It\'s alright.";
        String txt6 = "The character \\ is called backslash.";

        System.out.println(txt4);
        System.out.println(txt5);
        System.out.println(txt6);
    }
}
