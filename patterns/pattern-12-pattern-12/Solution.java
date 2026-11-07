import java.util.Scanner;

public class Pattern12 {
    public static void printPattern(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append(j);
                if (j < i) sb.append(' ');
            }
            int spaces = 2 * (n - i) + 2;
            for (int k = 0; k < spaces; k++) {
                sb.append(' ');
            }
            for (int j = i; j >= 1; j--) {
                sb.append(j);
                if (j > 1) sb.append(' ');
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 5;
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        }
        printPattern(n);
        scanner.close();
    }
}
