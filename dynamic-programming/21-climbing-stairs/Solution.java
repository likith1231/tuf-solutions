import java.util.Scanner;

public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n <= 2) return n;
        int prev2 = 1, prev1 = 2, curr = 0;
        for (int i = 3; i <= n; i++) {
            curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }

    public static void main(String[] args) {
        ClimbingStairs solution = new ClimbingStairs();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(solution.climbStairs(n));
        scanner.close();
    }
}
