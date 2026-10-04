# Selection Sort

**Source:** https://takeuforward.org/dsa/strivers-a2z-sheet-learn-dsa-a-to-z | **Topic:** Sorting-I | **Difficulty:** Easy

## Approach
Iterate through the array from index 0 to n-2. For each position i, find the index of the minimum element in the subarray from i to n-1 by scanning linearly, then swap that minimum element with the element at position i. This repeatedly selects the smallest remaining element and places it in its correct sorted position, building the sorted array from left to right.

## Complexity
- Time: O(N^2)
- Space: O(1)
