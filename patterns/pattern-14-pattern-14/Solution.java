import java.util.Scanner;

public class Pattern14 {
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 1; j <= i; j++) {
                sb.append(j);
                if (j != i) {
                    sb.append(" ");
                }
            }
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printPattern(n);
        scanner.close();
    }
}
