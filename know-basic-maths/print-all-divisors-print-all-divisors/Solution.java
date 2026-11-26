import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrintAllDivisors {
    public static List<Integer> printDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; (long) i * i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }
        Collections.sort(divisors);
        return divisors;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        List<Integer> result = printDivisors(n);
        System.out.println("Divisors of " + n + ": " + result);
        scanner.close();
    }
}
