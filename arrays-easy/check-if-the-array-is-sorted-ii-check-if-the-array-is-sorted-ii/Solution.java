import java.util.*;

public class CheckIfTheArrayIsSortedIi {
    public static boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int next = (i + 1) % n;
            if (nums[i] > nums[next]) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 4, 5, 1, 2};
        int[] arr2 = {2, 1, 3, 4};
        int[] arr3 = {1, 2, 3};

        System.out.println(check(arr1));
        System.out.println(check(arr2));
        System.out.println(check(arr3));
    }
}
