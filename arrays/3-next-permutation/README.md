# Next Permutation

**Source:** https://takeuforward.org/data-structure/next_permutation-find-next-lexicographically-greater-permutation/ | **Topic:** arrays | **Difficulty:** Medium

## Approach
Find the largest index i such that nums[i] < nums[i+1]. If no such index exists, reverse the whole array (it's the last permutation). Otherwise, find the largest index j > i such that nums[j] > nums[i], swap nums[i] and nums[j], then reverse the subarray from i+1 to the end.

## Complexity
- Time: O(N)
- Space: O(1)
