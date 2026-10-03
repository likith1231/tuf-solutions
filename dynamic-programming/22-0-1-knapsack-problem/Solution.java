import java.util.Scanner;

public class Problem01KnapsackProblem {

    public static int knapsack(int[] weights, int[] values, int n, int capacity) {
        int[] dp = new int[capacity + 1];

        for (int i = 0; i < n; i++) {
            int wt = weights[i];
            int val = values[i];
            for (int w = capacity; w >= wt; w--) {
                dp[w] = Math.max(dp[w], val + dp[w - wt]);
            }
        }

        return dp[capacity];
    }

    public static void main(String[] args) {
        int[] weights = {1, 3, 4, 5};
        int[] values = {1, 4, 5, 7};
        int capacity = 7;
        int n = weights.length;

        int maxValue = knapsack(weights, values, n, capacity);
        System.out.println("Maximum value in knapsack = " + maxValue);

        Scanner scanner = new Scanner(System.in);
        scanner.close();
    }
}
