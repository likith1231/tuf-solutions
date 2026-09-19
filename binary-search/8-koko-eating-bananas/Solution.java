import java.util.Scanner;

public class KokoEatingBananas {

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for (int pile : piles) {
            high = Math.max(high, pile);
        }
        int answer = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long hoursNeeded = computeHours(piles, mid);
            if (hoursNeeded <= h) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return answer;
    }

    private long computeHours(int[] piles, int speed) {
        long hours = 0;
        for (int pile : piles) {
            hours += (pile + speed - 1) / speed;
        }
        return hours;
    }

    public static void main(String[] args) {
        KokoEatingBananas solver = new KokoEatingBananas();
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine().trim());
        int[] piles = new int[n];
        String[] tokens = scanner.nextLine().trim().split("\\s+");
        for (int i = 0; i < n; i++) {
            piles[i] = Integer.parseInt(tokens[i]);
        }
        int h = Integer.parseInt(scanner.nextLine().trim());

        int result = solver.minEatingSpeed(piles, h);
        System.out.println(result);

        scanner.close();
    }
}
