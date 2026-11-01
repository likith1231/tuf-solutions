import java.util.Scanner;

public class Pattern6 {
    public static void printPattern(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append(j);
                if (j < i) {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printPattern(n);
        scanner.close();
    }
}
