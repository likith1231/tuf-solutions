import java.util.Scanner;

public class EasyAndMedium {

    public static int countDigits(int n) {
        if (n == 0) return 1;
        n = Math.abs(n);
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static int reverseNumber(int n) {
        boolean negative = n < 0;
        n = Math.abs(n);
        int reversed = 0;
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return negative ? -reversed : reversed;
    }

    public static boolean isPalindrome(int n) {
        if (n < 0) return false;
        int original = n;
        int reversed = 0;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        return original == reversed;
    }

    public static boolean isArmstrong(int n) {
        if (n < 0) return false;
        int original = n;
        int numDigits = countDigits(n);
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 0; i < numDigits; i++) {
                power *= digit;
            }
            sum += power;
            temp /= 10;
        }
        return sum == original;
    }

    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; (long) i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 12321;
        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + countDigits(number));
        System.out.println("Reversed number: " + reverseNumber(number));
        System.out.println("Is palindrome: " + isPalindrome(number));

        int armstrongTest = 153;
        System.out.println("\nNumber: " + armstrongTest);
        System.out.println("Is Armstrong number: " + isArmstrong(armstrongTest));

        int a = 48, b = 18;
        System.out.println("\nGCD of " + a + " and " + b + ": " + gcd(a, b));

        int primeTest = 29;
        System.out.println("\nNumber: " + primeTest);
        System.out.println("Is prime: " + isPrime(primeTest));

        Scanner scanner = new Scanner(System.in);
        scanner.close();
    }
}
