import java.util.Scanner;

public class Pattern16 {
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = (char) ('A' + i - 1);
            StringBuilder sb = new StringBuilder();
            for (int j = 1; j <= i; j++) {
                sb.append(ch);
                if (j != i) sb.append(" ");
            }
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.hasNextInt() ? sc.nextInt() : 5;
        printPattern(n);
        sc.close();
    }
}
