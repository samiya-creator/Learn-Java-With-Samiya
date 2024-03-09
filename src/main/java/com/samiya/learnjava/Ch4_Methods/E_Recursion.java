package main.java.com.samiya.learnjava.Ch4_Methods;

public class E_Recursion {
    public static int sum(int k) {
        // Base case: if k is 0, return 0
        if (k == 0) {
          return 0;
        } else {
          // Recursive call: add k to the sum of numbers from k-1 to 1
          return k + sum(k - 1);
        }
      }
    
      // Define a method named main where the program starts execution
      public static void main(String[] args) {
        // Call the sum method with an argument of 10 and print the result
        int result = sum(10);
        System.out.println(result);
      }
}
