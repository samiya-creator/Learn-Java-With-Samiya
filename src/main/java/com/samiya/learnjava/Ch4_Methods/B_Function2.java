package main.java.com.samiya.learnjava.Ch4_Methods;

public class B_Function2 {
    // Define a method named myMethod that takes a String parameter called fname
    static void myMethod(String fname) {
        // Print the concatenated string of fname and "Refsnes"
        System.out.println(fname + " Refsnes");
      }
    
      // Define the main method where the program starts execution
      public static void main(String[] args) {
        // Call the myMethod and pass "Liam" as an argument
        myMethod("Liam");
        // Call the myMethod and pass "Jenny" as an argument
        myMethod("Jenny");
        // Call the myMethod and pass "Anja" as an argument
        myMethod("Anja");
      }
}
