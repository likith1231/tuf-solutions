import java.util.Arrays;

public class SortColors {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        SortColors solver = new SortColors();
        int[] nums1 = {2, 0, 2, 1, 1, 0};
        solver.sortColors(nums1);
        System.out.println(Arrays.toString(nums1));

        int[] nums2 = {2, 0, 1};
        solver.sortColors(nums2);
        System.out.println(Arrays.toString(nums2));

        int[] nums3 = {0};
        solver.sortColors(nums3);
        System.out.println(Arrays.toString(nums3));

        int[] nums4 = {1};
        solver.sortColors(nums4);
        System.out.println(Arrays.toString(nums4));
    }
}
