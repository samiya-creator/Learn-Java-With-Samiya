package main.java.com.samiya.learnjava.Ch4_Methods;

public class D_Scope {
    public static void main(String[] args) {
    int x = 100;
    System.out.println("Outer x: " + x);

    { 
      // Declare a new variable named x and initialize it to 200
      int y = 200;
      
      // Print the value of the inner x variable
      System.out.println("Inner x: " + y);

    } 
  }
}
