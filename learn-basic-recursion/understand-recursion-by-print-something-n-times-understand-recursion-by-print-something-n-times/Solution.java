import java.util.Scanner;

public class UnderstandRecursionByPrintSomethingNTimes {

    static void printNTimes(int count, int n) {
        if (count > n) {
            return;
        }
        System.out.println("Hello, World! " + count);
        printNTimes(count + 1, n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        printNTimes(1, n);
        scanner.close();
    }
}
