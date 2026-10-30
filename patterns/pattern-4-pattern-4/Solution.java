import java.util.Scanner;

public class Pattern4 {
    public static String generatePattern(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append(i);
                if (j < i) {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void printPattern(int n) {
        System.out.print(generatePattern(n));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printPattern(n);
        scanner.close();
    }
}
