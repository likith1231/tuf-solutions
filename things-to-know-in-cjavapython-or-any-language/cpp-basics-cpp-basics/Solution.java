import java.util.Scanner;

public class CppBasics {

    public static void demonstrateBasics() {
        int a = 10;
        int b = 3;
        double d = 5.5;
        char c = 'A';
        boolean flag = true;
        String s = "Hello";

        int sum = a + b;
        int diff = a - b;
        int prod = a * b;
        int quot = a / b;
        int mod = a % b;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);
        System.out.println("Product = " + prod);
        System.out.println("Quotient = " + quot);
        System.out.println("Modulus = " + mod);

        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else {
            System.out.println(b + " is greater than or equal to " + a);
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Loop iteration: " + i);
        }

        int i = 1;
        while (i <= 3) {
            System.out.println("While loop: " + i);
            i++;
        }

        System.out.println("Double value: " + d);
        System.out.println("Char value: " + c);
        System.out.println("Boolean value: " + flag);
        System.out.println("String value: " + s);
        System.out.println("String length: " + s.length());
        System.out.println("String concatenation: " + s + " World");

        int[] arr = {5, 3, 8, 1, 9};
        int maxVal = arr[0];
        for (int val : arr) {
            if (val > maxVal) {
                maxVal = val;
            }
        }
        System.out.println("Max value in array: " + maxVal);
    }

    public static void main(String[] args) {
        demonstrateBasics();
    }
}
