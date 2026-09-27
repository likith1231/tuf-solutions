import java.util.*;

public class NextGreaterElement {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        NextGreaterElement solver = new NextGreaterElement();
        int[] nums = {4, 5, 2, 25, 7, 8};
        int[] result = solver.nextGreaterElements(nums);
        System.out.println(Arrays.toString(result));
    }
}
