import java.util.Scanner;

public class ReverseANumber {

    public static long reverse(long n) {
        boolean isNegative = n < 0;
        long num = Math.abs(n);
        long reversed = 0;

        while (num != 0) {
            long digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return isNegative ? -reversed : reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        long result = reverse(number);
        System.out.println("Reversed number: " + result);
        sc.close();
    }
}
