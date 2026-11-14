import java.util.Scanner;

public class Pattern19 {
    public static void printPattern(int n) {
        for (int s = 1; s <= n; s++) {
            for (int k = 0; k < s; k++) {
                System.out.print("*");
            }
            int spaces = 2 * (n - s);
            for (int k = 0; k < spaces; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k < s; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int s = n - 1; s >= 1; s--) {
            for (int k = 0; k < s; k++) {
                System.out.print("*");
            }
            int spaces = 2 * (n - s);
            for (int k = 0; k < spaces; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k < s; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printPattern(n);
        scanner.close();
    }
}
