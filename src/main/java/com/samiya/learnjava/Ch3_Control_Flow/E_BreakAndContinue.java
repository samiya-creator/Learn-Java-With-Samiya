package main.java.com.samiya.learnjava.Ch3_Control_Flow;

public class E_BreakAndContinue {
    public static void main(String[] args) {
        System.out.println("Using break in a for loop:");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("\nUsing continue in a for loop:");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("\nUsing break in a while loop:");
        int j = 0;
        while (j < 10) {
            System.out.println(j);
            j++;
            if (j == 4) {
                break;
            }
        }

        System.out.println("\nUsing continue in a while loop:");
        int k = 0;
        while (k < 10) {
            if (k == 4) {
                k++;
                continue;
            }
            System.out.println(k);
            k++;
        }
    }
}
