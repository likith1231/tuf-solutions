import java.util.Scanner;

public class Pattern11 {
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            int start = (i % 2 == 0) ? 0 : 1;
            for (int j = 0; j < i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
        sc.close();
    }
}
