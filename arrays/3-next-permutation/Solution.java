import java.util.Arrays;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1, n - 1);
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        NextPermutation solver = new NextPermutation();
        int[] nums1 = {1, 2, 3};
        solver.nextPermutation(nums1);
        System.out.println(Arrays.toString(nums1));

        int[] nums2 = {3, 2, 1};
        solver.nextPermutation(nums2);
        System.out.println(Arrays.toString(nums2));

        int[] nums3 = {1, 1, 5};
        solver.nextPermutation(nums3);
        System.out.println(Arrays.toString(nums3));

        int[] nums4 = {1, 3, 2};
        solver.nextPermutation(nums4);
        System.out.println(Arrays.toString(nums4));
    }
}