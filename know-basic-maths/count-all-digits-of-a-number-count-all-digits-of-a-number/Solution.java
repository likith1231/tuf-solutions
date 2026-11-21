import java.util.Scanner;

public class CountAllDigitsOfANumber {

    public static int countDigits(long n) {
        n = Math.abs(n);
        if (n == 0) {
            return 1;
        }
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        int result = countDigits(number);
        System.out.println(result);
        sc.close();
    }
}
