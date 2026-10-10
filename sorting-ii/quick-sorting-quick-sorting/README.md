# Quick Sorting

**Source:** https://takeuforward.org/dsa/strivers-a2z-sheet-learn-dsa-a-to-z | **Topic:** Sorting-II | **Difficulty:** Easy

## Approach
Implement the classic Quick Sort algorithm using the Lomuto partition scheme. Choose the last element of the current subarray as the pivot, rearrange elements so that smaller elements go to the left and larger ones to the right of the pivot, then recursively sort the left and right partitions.

## Complexity
- Time: O(N log N) average case, O(N^2) worst case
- Space: O(log N) due to recursion stack
