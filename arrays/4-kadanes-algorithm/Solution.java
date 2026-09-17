import java.util.Scanner;

public class KadanesAlgorithm {

    public static int maxSubArraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = Integer.parseInt(scanner.nextLine().trim());
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers separated by space:");
        String[] tokens = scanner.nextLine().trim().split("\\s+");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }
        int result = maxSubArraySum(arr);
        System.out.println("Maximum Subarray Sum: " + result);
        scanner.close();
    }
}
