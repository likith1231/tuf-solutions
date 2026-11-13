import java.util.Scanner;

public class Pattern18 {
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = n - i; j < n; j++) {
                char ch = (char) ('A' + j);
                sb.append(ch);
                if (j < n - 1) {
                    sb.append(" ");
                }
            }
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
        sc.close();
    }
}
