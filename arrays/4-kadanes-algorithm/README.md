# Kadane's Algorithm

**Source:** https://takeuforward.org/data-structure/kadanes-algorithm-maximum-subarray-sum-in-an-array/ | **Topic:** arrays | **Difficulty:** Medium

## Approach
Iterate through the array while maintaining a running sum of the current subarray. If the running sum becomes negative, reset it to zero since a negative sum would only decrease any future subarray sum. At each step update the global maximum with the current running sum. This greedily extends the subarray as long as it contributes positively to the sum, giving the maximum subarray sum in a single pass.

## Complexity
- Time: O(N)
- Space: O(1)
