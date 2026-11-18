import java.util.Scanner;

public class Pattern22 {
    public static void printPattern(int n) {
        int size = 2 * n - 1;
        for (int i = 0; i < size; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < size; j++) {
                int top = i;
                int bottom = size - 1 - i;
                int left = j;
                int right = size - 1 - j;
                int min = Math.min(Math.min(top, bottom), Math.min(left, right));
                int value = n - min;
                sb.append(value);
                if (j < size - 1) {
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
