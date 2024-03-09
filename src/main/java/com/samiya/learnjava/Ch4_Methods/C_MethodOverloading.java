package main.java.com.samiya.learnjava.Ch4_Methods;

public class C_MethodOverloading {
    // Define a method named plusMethodInt that takes two int parameters and returns an int
  static int plusMethodInt(int x, int y) {
    // Return the sum of the two int parameters
    return x + y;
  }

  // Define a method named plusMethodDouble that takes two double parameters and returns a double
  static double plusMethodDouble(double x, double y) {
    // Return the sum of the two double parameters
    return x + y;
  }

  // Define the main method where the program starts execution
  public static void main(String[] args) {
    // Call the plusMethodInt method with int parameters 8 and 5 and store the result in myNum1
    int myNum1 = plusMethodInt(8, 5);
    // Call the plusMethodDouble method with double parameters 4.3 and 6.26 and store the result in myNum2
    double myNum2 = plusMethodDouble(4.3, 6.26);
    // Print the value of myNum1 with a message
    System.out.println("int: " + myNum1);
    // Print the value of myNum2 with a message
    System.out.println("double: " + myNum2);
  }
}
