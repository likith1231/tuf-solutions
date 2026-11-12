import java.util.Scanner;

public class Pattern17 {
    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int s = 0; s < n - 1 - i; s++) {
                sb.append(' ');
            }
            for (int j = 0; j <= i; j++) {
                sb.append((char) ('A' + j));
            }
            for (int j = i - 1; j >= 0; j--) {
                sb.append((char) ('A' + j));
            }
            System.out.println(sb.toString());
        }
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
