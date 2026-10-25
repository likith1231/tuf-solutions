import java.util.Arrays;

public class TheoryWithExamples {

    public static void demonstrateDataTypes() {
        int a = 10;
        double b = 3.14;
        char c = 'A';
        boolean d = true;
        String e = "Hello";
        System.out.println("int: " + a);
        System.out.println("double: " + b);
        System.out.println("char: " + c);
        System.out.println("boolean: " + d);
        System.out.println("String: " + e);
    }

    public static void demonstrateOperators() {
        int x = 7, y = 3;
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));
        System.out.println("x > y = " + (x > y));
        System.out.println("x == y = " + (x == y));
    }

    public static void demonstrateControlFlow(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }

    public static void demonstrateLoops(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }

    public static void demonstrateArrays() {
        int[] arr = {5, 3, 8, 1, 9};
        System.out.println("Array: " + Arrays.toString(arr));
        int sum = 0;
        for (int val : arr) {
            sum += val;
        }
        System.out.println("Sum: " + sum);
    }

    public static void demonstrateStrings() {
        String s = "DSA Sheet";
        System.out.println("Length: " + s.length());
        System.out.println("Upper: " + s.toUpperCase());
        System.out.println("Substring: " + s.substring(0, 3));
        System.out.println("Reversed: " + new StringBuilder(s).reverse().toString());
    }

    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void demonstrateFunctions() {
        int num = 5;
        System.out.println("Factorial of " + num + " is " + factorial(num));
    }

    public static void main(String[] args) {
        TheoryWithExamples.demonstrateDataTypes();
        System.out.println();
        TheoryWithExamples.demonstrateOperators();
        System.out.println();
        TheoryWithExamples.demonstrateControlFlow(10);
        TheoryWithExamples.demonstrateControlFlow(7);
        System.out.println();
        TheoryWithExamples.demonstrateLoops(5);
        System.out.println();
        TheoryWithExamples.demonstrateArrays();
        System.out.println();
        TheoryWithExamples.demonstrateStrings();
        System.out.println();
        TheoryWithExamples.demonstrateFunctions();
    }
}
