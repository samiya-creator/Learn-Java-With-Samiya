package main.java.com.samiya.learnjava.Ch4_Methods;

public class A_Function {
    // Define a method named myMethod
    // This method does not return any value (void)
    static void myMethod() {
      // Print a message when this method is called
      System.out.println("I just got executed!");
    }
  
    // The main method, where the program starts execution
    public static void main(String[] args) {
        // Call the myMethod() to execute its code
        myMethod();
        // Call function N-times
        myMethod();
        myMethod();
    }
}
